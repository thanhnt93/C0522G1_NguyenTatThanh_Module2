package ss6_inheritance.exercise.circle_and_cylinder;

public class MainCircleAndCylinder {
    public static void main(String[] args) {
        Circle circle = new Circle();
        Cylinder cylinder = new Cylinder(10.0, "Pink", 20);

        System.out.print(cylinder + "\n");
        System.out.println("=================================");
        System.out.printf("Diện tích hình tròn = %.2f \n", cylinder.area());
        System.out.printf("Thể tích hình tròn = %.2f", cylinder.volume());

    }
}
