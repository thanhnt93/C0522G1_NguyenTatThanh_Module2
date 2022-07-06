package ss6_inheritance.exercise.circle_and_cylinder;

public class MainCircleAndCylinder {
    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder();
        cylinder.setHeight(20);
        cylinder.setRadius(10.0);
        cylinder.setColor("Pink");

//        System.out.print(cylinder.toString());
        System.out.printf("Diện tích hình tròn = %.2f \n", cylinder.area());
        System.out.printf("Thể tích hình tròn = %.2f", cylinder.volume());

    }
}
