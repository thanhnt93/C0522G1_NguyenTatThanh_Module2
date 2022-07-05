package ss4_class_and_object_in_java.exercise;

public class StopWatch {
    //    Xây dựng lớp StopWatch
    public static void main(String[] args) {
        StopWatch stopWatch = new StopWatch();
        stopWatch.start();
        for (int i = 1; i <= 100000; i++) {
            System.out.print(i + " ");
        }
        stopWatch.endTime();
        System.out.println("\n ElapsedTime: "+ stopWatch.getElapsedTime());
    }

    private long startTime;
    private long endTime;

    public void start() {
        this.startTime = System.currentTimeMillis();
    }

    public void endTime() {
        this.endTime = System.currentTimeMillis();
    }

    public long getElapsedTime() {
        return this.endTime - this.startTime;
    }

}
