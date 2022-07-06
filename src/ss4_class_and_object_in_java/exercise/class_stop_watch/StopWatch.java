package ss4_class_and_object_in_java.exercise.class_stop_watch;

public class StopWatch {
    private long startTime;
    private long endTime;

    public StopWatch() {
        startTime = getStartTime();
    }

    public void start() {
        startTime = System.currentTimeMillis();
    }

    public void endTime() {
        endTime = System.currentTimeMillis();
    }

    public long getElapsedTime() {
        return getEndTime() - getStartTime();
    }

    public long getStartTime() {
        return startTime;
    }

    public long getEndTime() {
        return endTime;
    }
}
