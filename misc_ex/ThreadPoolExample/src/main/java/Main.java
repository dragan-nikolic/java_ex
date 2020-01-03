import java.util.ArrayList;
import java.util.List;

import pool.Task;
import pool.ThreadPool;

public class Main {

    public static void main(String[] args) {
        ThreadPool pool = new ThreadPool(3);
        List<Integer> buffer = new ArrayList<>();

        long[] delays = {1000, 400, 800, 300, 200};
        for (int i = 0; i < 5; i++) {
            Task task = new Task(i, buffer);
            pool.submit(task, delays[i]);
        }
    }
}
