package ss5_access_modifier_static_method_static_property.exercise.class_circle;

import java.util.Scanner;

public class MainCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập bán kính r = ");
        double r = sc.nextDouble();

        Circle circle = new Circle(r);

        double radius = circle.getRadius();
        double area = circle.getArea();
        System.out.print("Đường kính r = " + radius + "\n");
        System.out.printf("Diện tích S = %.2f ", area);
    }

}
