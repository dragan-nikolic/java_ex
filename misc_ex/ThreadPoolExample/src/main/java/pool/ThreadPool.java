package pool;

import java.util.LinkedList;
import java.util.Queue;

public class ThreadPool {
    private final PoolWorker[] threads;
    private final Queue<TaskInfo> tasks;

    public ThreadPool(int nThreads) {
        tasks = new LinkedList<>();
        threads = new PoolWorker[nThreads];

        for (int i = 0; i < nThreads; i++) {
            threads[i] = new PoolWorker();
            threads[i].start();
        }
    }

    public void submit(Runnable task, long delayMillis) {
        synchronized (tasks) {
            TaskInfo taskInfo = new TaskInfo(task, delayMillis);
            tasks.add(taskInfo);
            tasks.notify();
        }
    }

    public boolean isTaskAvailable() {
        synchronized(tasks) {
            return !tasks.isEmpty();
        }
    }

    private class PoolWorker extends Thread {
        public void run() {
            TaskInfo taskInfo;

            while (true) {

                synchronized (tasks) {
                    while (tasks.isEmpty()) {
                        try {
                            tasks.wait();
                        } catch (InterruptedException e) {
                            System.out.println("An error occurred while queue is waiting: " + e.getMessage());
                        }
                    }

                    taskInfo = tasks.poll();
                }

                if (taskInfo.getDelayMillis() > 0) {
                    try {
                        Thread.sleep(taskInfo.getDelayMillis());
                    } catch (InterruptedException e) {
                        System.out.println("Thread sleep interrupted: " + e.getMessage());
                        e.printStackTrace();
                    }
                }

                // If we don't catch RuntimeException,
                // the pool could leak threads
                try {
                    taskInfo.getRunnable().run();
                } catch (RuntimeException e) {
                    System.out.println("Thread pool is interrupted due to an issue: " + e.getMessage());
                }
            }
        }
    }
}
