package ss4_class_and_object_in_java.exercise.class_stop_watch;

public class MainStopWatch {
    //    Xây dựng lớp StopWatch
    public static void main(String[] args) {
        StopWatch stopWatch = new StopWatch();
        stopWatch.start();
        for (int i = 1; i <= 100000; i++) {
            System.out.print(i + " ");
        }

        stopWatch.endTime();
        System.out.println("\n ElapsedTime: " + stopWatch.getElapsedTime());
    }
}
