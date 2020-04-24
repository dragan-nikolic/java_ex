package pool;

import java.util.LinkedList;
import java.util.Queue;

public class ThreadPool {
    private final Object key = new Object();
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
        synchronized (key) {
            TaskInfo taskInfo = new TaskInfo(task, delayMillis);
            tasks.add(taskInfo);
            key.notify();
        }
    }

    public boolean isTaskAvailable() {
        synchronized(key) {
            return !tasks.isEmpty();
        }
    }

    private class PoolWorker extends Thread {
        public void run() {
            TaskInfo taskInfo;

            while (true) {

                synchronized (key) {
                    if (tasks.isEmpty()) {
                        try {
                            key.wait();
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
