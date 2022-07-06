package ss4_class_and_object_in_java.exercise.class_quadratic_equation;

import java.util.Scanner;

public class MainQuadraticEquation {
    public static void main(String[] args) {
        //    Xây dựng lớp QuadraticEquation (Phương trình bậc hai)
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Nhập giá trị a: ");
//        double a = sc.nextDouble();
//        System.out.print("Nhập giá trị b: ");
//        double b = sc.nextDouble();
//        System.out.print("Nhập giá trị c: ");
//        double c = sc.nextDouble();

        double a = inputPositive("a");

        double b = inputPositive("b");

        double c = inputPositive("c");

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

    public static double inputPositive(String target) {
        Scanner sc = new Scanner(System.in);
        double n;
        boolean isInvalidN;
        do {
            System.out.printf("Nhập giá trị %s: ", target);
            n = sc.nextDouble();

            isInvalidN = n < 0;
            if (isInvalidN) {
                System.out.printf("%s >= 0, xin kiểm tra lại ! \n", target);
            }
        } while (isInvalidN);
        return n;
    }
}
