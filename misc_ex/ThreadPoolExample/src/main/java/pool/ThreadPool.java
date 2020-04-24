package pool;

import java.util.LinkedList;
import java.util.Queue;

public class ThreadPool {
    private final PoolWorker[] threads;
    private final Queue<TaskInfo> queue;

    public ThreadPool(int nThreads) {
        queue = new LinkedList<>();
        threads = new PoolWorker[nThreads];

        for (int i = 0; i < nThreads; i++) {
            threads[i] = new PoolWorker();
            threads[i].start();
        }
    }

    public void submit(Runnable task, long delayMillis) {
        synchronized (queue) {
            TaskInfo taskInfo = new TaskInfo(task, delayMillis);
            queue.add(taskInfo);
            queue.notify();
        }
    }

    public boolean isQueueEmpty() {
        synchronized(queue) {
            return queue.isEmpty();
        }
    }

    private class PoolWorker extends Thread {
        public void run() {
            TaskInfo taskInfo;

            while (true) {

                synchronized (queue) {
                    while (queue.isEmpty()) {
                        try {
                            queue.wait();
                        } catch (InterruptedException e) {
                            System.out.println("An error occurred while queue is waiting: " + e.getMessage());
                        }
                    }

                    taskInfo = queue.poll();
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
