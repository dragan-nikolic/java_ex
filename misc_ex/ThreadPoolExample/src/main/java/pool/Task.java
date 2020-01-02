package pool;

public class Task implements Runnable {

    private int num;

    public Task(int n) {
        System.out.println("Created task " + n);
        num = n;
    }

    public void run() {
        System.out.println("Task " + num + " is running.");
    }
}
