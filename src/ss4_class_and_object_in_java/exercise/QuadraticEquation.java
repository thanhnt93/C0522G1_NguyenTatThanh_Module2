package ss4_class_and_object_in_java.exercise;

import java.util.Scanner;

public class QuadraticEquation {
    //    Xây dựng lớp QuadraticEquation (Phương trình bậc hai)
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập giá trị a: ");
        double a = sc.nextDouble();
        System.out.print("Nhập giá trị b: ");
        double b = sc.nextDouble();
        System.out.print("Nhập giá trị c: ");
        double c = sc.nextDouble();
        QuadraticEquation quadraticEquation = new QuadraticEquation(a, b, c);

        double discriminant = quadraticEquation.getDiscriminant();
        double root1 = quadraticEquation.getRoot1();
        double root2 = quadraticEquation.getRoot2();
        if (discriminant > 0) {
            System.out.printf("The equation has two roots %.5f and %.6f", root1, root2);
        } else if (discriminant == 0) {
            System.out.print("The equation has one root " + root1);
        } else {
            System.out.print("The equation has no roots");
        }

    }

    private double a, b, c;

    public QuadraticEquation() {
    }

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    private double getA() {
        return a;
    }

    private double getB() {
        return b;
    }

    private double getC() {
        return c;
    }

    public double getDiscriminant() {
        return b * 2 - 4 * a * c;
    }

    public double getRoot1() {
        if (getDiscriminant() >= 0) {
            return (-b - Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / (2 * a);
        } else {
            return 0;
        }
    }

    public double getRoot2() {
        if (getDiscriminant() >= 0) {
            return (-b + Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / (2 * a);
        } else {
            return 0;
        }
    }

}
