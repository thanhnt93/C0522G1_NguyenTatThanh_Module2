package ss15_exeception_debug.exercise.Illegal_triangle_exception;

import java.util.Scanner;

public class TestIllegalTriangleException {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("NHẬP BA CẠNH TAM GIÁC.");

            System.out.print("Nhập cạnh a: ");
            double a = Double.parseDouble(sc.nextLine());

            System.out.print("Nhập cạnh b: ");
            double b = Double.parseDouble(sc.nextLine());

            System.out.print("Nhập cạnh c: ");
            double c = Double.parseDouble(sc.nextLine());

            try {
                triangleTest(a, b, c);
                break;
            } catch (IllegalTriangleException e) {
                System.out.println(e.getMessage());
                e.printStackTrace();
            }

        }


    }

    public static void triangleTest(double a, double b, double c) throws IllegalTriangleException {
        if (a < 0 || b < 0 || c < 0 || a + b < c || a + c < b || b + c < a) {
            throw new IllegalTriangleException("Lỗi ba cạnh tam giác.");
        }
    }

}
