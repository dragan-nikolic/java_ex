package waitnotify;

public class ProducerConsumer {

    private static Object lock = new Object();

    private static int[] buffer;
    private static int count;

    static class Producer {

        void produce() {
            synchronized(lock) {
                if (isFull(buffer)) {
                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

                buffer[count++] = 1;
                printBuffer("Produce");
                lock.notify();
            }
        }
    }

    static class Consumer {

        void consume() {
            synchronized (lock) {
                if (isEmpty(buffer)) {
                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

                buffer[--count] = 0;
                printBuffer("Consume");
                lock.notify();
            }
        }
    }

    static boolean isEmpty(int[] buffer) {
        return count == 0;
    }

    static boolean isFull(int[] buffer) {
        return count == buffer.length;
    }

    static void printBuffer(String operation) {
        System.out.println(operation + "<<<");
        for (int v: buffer) {
            System.out.print(v);
        }
        System.out.println(">>>");
    }

    public static void main(String... strings) throws InterruptedException {

        buffer = new int[10];
        count = 0;

        Producer producer = new Producer();
        Consumer consumer = new Consumer();

        Runnable produceTask = () -> {
            for (int i = 0; i < 50; i++) {
                producer.produce();
            }
            System.out.println("Done producing");
        };
        Runnable consumeTask = () -> {
            for (int i = 0; i < 45; i++) {
                consumer.consume();
                try {
                    Thread.sleep(10); // slow down consumer
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
        }
            System.out.println("Done consuming");
        };

        Thread consumerThread = new Thread(consumeTask);
        Thread producerThread = new Thread(produceTask);

        consumerThread.start();
        producerThread.start();

        consumerThread.join();
        producerThread.join();

        System.out.println("Data in the buffer: " + count);
        printBuffer("Final");
    }
}