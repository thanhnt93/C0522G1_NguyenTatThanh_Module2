package ss4_class_and_object_in_java.exercise.class_fan;

public class MainFan {
    public static void main(String[] args) {
        Fan fan1 = new Fan(Fan.FAST, true, 10, "yellow");
        Fan fan2 = new Fan(Fan.MEDIUM, false, 5, "blue");
//        Fan fan = new Fan();
//        String toString1 = fan1.toString();
        System.out.print(fan1);
        System.out.print(fan2);
    }
}
