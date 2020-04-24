import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import pool.Task;
import pool.ThreadPool;

public class ThreadPoolTest {
    /**
     * Test Timeline
     * -------------
     * Given:
     * - There is ThreadPool with 3 threads
     * - Task output buffer is created
     *
     * Start:
     * - 5 tasks created and submitted for execution. Each task writes its id into the buffer on completion.
     * - First 3 tasks (0,1 and 2) start execution
     *
     * ~400ms:
     * - Task 1 completes
     * - Task 3 starts execution
     *
     * ~700ms:
     * - Task 3 completes
     * - Task 4 starts execution
     *
     * ~800ms:
     * - Task 2 completed
     *
     * ~900ms:
     * - Task 4 completed
     *
     * ~1000ms:
     * - Task 0 completed
     */
    @Test
    public void BasicTest() throws InterruptedException {
        // given
        ThreadPool pool = new ThreadPool(3);
        List<Integer> buffer = new ArrayList<>();
        long[] delays = {1000, 400, 800, 300, 200};
        List<Integer> expectedTaskOrder = new ArrayList<>(Arrays.asList(1,3,2,4,0));

        // when
        for (int i = 0; i < 5; i++) {
            Task task = new Task(i, buffer);
            pool.submit(task, delays[i]);
        }

        Thread.sleep(2000);

        // then
        Assert.assertEquals(expectedTaskOrder, buffer);
    }

    @Test
    public void NoDelaysTest3_100() throws InterruptedException {
        NoDelayTest(3, 100);
    }

    @Test
    public void NoDelaysTest3_1000() throws InterruptedException {
        NoDelayTest(3, 1000);
    }

    @Test
    public void NoDelaysTest3_10000() throws InterruptedException {
        NoDelayTest(3, 10000);
    }

    @Test
    public void NoDelaysTest3_100000() throws InterruptedException {
        NoDelayTest(3, 100000);
    }

    private void NoDelayTest(int poolSize, int numberOfTasks) throws InterruptedException {
        // given
        ThreadPool pool = new ThreadPool(poolSize);

        List<Integer> buffer = new ArrayList<>();
        List<Integer> expectedTaskOrder = new ArrayList<>();
        for (int i = 0; i < numberOfTasks; i++) {
            expectedTaskOrder.add(i+1);
        }

        // when
        for (int i = 0; i < numberOfTasks; i++) {
            Task task = new Task(i+1, buffer);
            pool.submit(task, 0);
        }

        while (pool.isTaskAvailable());
        Thread.sleep(10*poolSize + 100);

        // then
        Assert.assertEquals(expectedTaskOrder.size(), buffer.size());
    }
}
