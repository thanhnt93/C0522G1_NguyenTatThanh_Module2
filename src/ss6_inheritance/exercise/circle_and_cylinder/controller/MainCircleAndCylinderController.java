package ss6_inheritance.exercise.circle_and_cylinder.controller;

import ss6_inheritance.exercise.circle_and_cylinder.model.Circle;
import ss6_inheritance.exercise.circle_and_cylinder.model.Cylinder;

public class MainCircleAndCylinderController {
    public static void main(String[] args) {
        Circle circle = new Circle();
        Cylinder cylinder = new Cylinder(10.0, "Pink", 20);

        System.out.print(cylinder + "\n");
        System.out.println("=================================");
        System.out.printf("Diện tích hình tròn = %.2f \n", cylinder.area());
        System.out.printf("Thể tích hình tròn = %.2f", cylinder.volume());

    }
}
