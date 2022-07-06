package ss5_access_modifier_static_method_static_property.exercise.class_student;

public class MainStudent {
    public static void main(String[] args) {
        Student student = new Student();
        String name = student.setName("Nguyễn Tất Thành");
        String classed = student.setClasses("C0522G1");

//        System.out.print("Name: " + name + "\t Class: " + classed);
    }
}
