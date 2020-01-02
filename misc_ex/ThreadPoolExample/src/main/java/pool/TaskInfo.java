package pool;

public class TaskInfo {
    private final Runnable runnable;
    private final long delayMillis;

    public TaskInfo(Runnable runnable, long delayMillis) {
        this.runnable = runnable;
        this.delayMillis = delayMillis;
    }

    public long getDelayMillis() {
        return delayMillis;
    }

    public Runnable getRunnable() {
        return runnable;
    }
}
