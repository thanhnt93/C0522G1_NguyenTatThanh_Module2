package ss5_access_modifier_static_method_static_property.exercise.class_student;

public class Student {
    private String name = "John";
    private String classes = "CO2";

    public Student() {
    }

    public String setName(String name) {
        return this.name = name;
    }

    public String setClasses(String classes) {
        return this.classes = classes;
    }
}
