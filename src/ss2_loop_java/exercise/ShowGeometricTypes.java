package ss2_loop_java.exercise;

import sun.awt.geom.AreaOp;
import sun.text.resources.uk.JavaTimeSupplementary_uk;

import java.util.Scanner;

public class ShowGeometricTypes {
    //    Hiển thị các loại hình học
    public static void main(String[] args) {
        int choice = -1;
        Scanner input = new Scanner(System.in);
        while (choice != 0) {
            System.out.println("Menu");
            System.out.println("1. Print the rectangle");
            System.out.println("2. Print the square triangle");
            System.out.println("3. Print isosceles triangle");
            System.out.println("4. Exit");
            System.out.print("Enter your choice:  ");
            choice = input.nextInt();
            int height;
            switch (choice) {
                case 1:

                    //Hình chữ nhật
                    System.out.print("Nhập chiều dài: ");
                    int width = input.nextInt();
                    System.out.print("Nhập chiều cao: ");
                    height = input.nextInt();
                    for (int i = 1; i <= height; i++) {
                        for (int j = 1; j <= width; j++) {
                            System.out.print("* ");
                        }
                        System.out.println();
                    }
                    break;
                case 2:
                    //Góc vuông dưới trái
                    System.out.print("Nhập chiều cao: ");
                    height = input.nextInt();
                    String resultTopLeft = "";
                    for (int i = 1; i <= height; i++) {
                        for (int j = 1; j <= i; j++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    System.out.println();

                    //Góc vuông trên trái
                    for (int i = 1; i <= height; i++) {
                        for (int j = height; j >= i; j--) {
                            resultTopLeft = resultTopLeft + "*";
                        }
                        resultTopLeft = resultTopLeft + "\n";
                    }
                    System.out.print(resultTopLeft + "\n");

                    //Góc vuông trên phải
                    String resultTopRight = "";
                    for (int i = 1; i <= height; i++) {
                        for (int j = 1; j <= height; j++) {
                            if (j > i - 1) {
                                resultTopRight = resultTopRight + "*";
                            } else {
                                resultTopRight = resultTopRight + " ";
                            }
                        }
                        resultTopRight = resultTopRight + "\n";
                    }
                    System.out.print(resultTopRight + "\n");

                    //Góc vuông dươi phải
                    String resultBotRight = "";
                    for (int i = 1; i <= height; i++) {
                        for (int j = 1; j <= height; j++) {
                            if (i > height - j) {
                                resultBotRight = resultBotRight + "*";
                            } else {
                                resultBotRight = resultBotRight + " ";
                            }
                        }
                        resultBotRight = resultBotRight + "\n";
                    }
                    System.out.print(resultBotRight);
                    break;
                case 3:
                    //Tam giác cân
                    System.out.print("Nhập chiều cao: ");
                    height = input.nextInt();
                    for (int i = 1; i <= height; i++) {
                        for (int k = height; k > i; k--) {
                            System.out.print(" ");
                        }
                        for (int j = 1; j <= i * 2 - 1; j++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    break;
                case 4:
                    System.exit(4);
                default:
                    System.out.println("No choice!");
            }
        }
    }
}
