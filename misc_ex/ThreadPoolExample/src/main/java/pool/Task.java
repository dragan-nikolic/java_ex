package pool;

import java.util.List;

public class Task implements Runnable {

    //private Object key = new Object();
    private int id;
    private List<Integer> buffer;

    public Task(int id, List<Integer> buffer) {
        System.out.println("Created task " + id);
        
        this.id = id;
        this.buffer = buffer;
    }

    public void run() {
        synchronized(buffer) {
            System.out.println("Task " + id + " is running.");
            buffer.add(id);
        }
    }
}
