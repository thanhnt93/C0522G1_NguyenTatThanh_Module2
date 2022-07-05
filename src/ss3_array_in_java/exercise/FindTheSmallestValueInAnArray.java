package ss3_array_in_java.exercise;

import java.util.Scanner;

public class FindTheSmallestValueInAnArray {
    //    Tìm giá trị nhỏ nhất trong một mảng
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số cột m: ");
        int numberCollum = sc.nextInt();
        System.out.print("Nhập số dòng n: ");
        int numberRow = sc.nextInt();
        int[][] twoDimensionalArray = new int[numberCollum][];


        for (int i = 0; i < numberCollum; i++) {
            twoDimensionalArray[i] = new int[numberRow];
            for (int j = 0; j < numberRow; j++) {
                System.out.print("Nhập vào cột " + i + ", dòng " + j + ": ");
                twoDimensionalArray[i][j] = sc.nextInt();
            }
        }
        System.out.print("twoDimensionalArray = [ ");
        for (int i = 0; i < twoDimensionalArray.length; i++) {
            System.out.print("[ ");
            for (int j = 0; j < twoDimensionalArray[i].length; j++) {
                System.out.print(twoDimensionalArray[i][j] + " ");
            }
            System.out.print("]");
        }
        System.out.print(" ]" + "\n");

        int minArr = minArr(twoDimensionalArray);
        System.out.print("Số nhỏ nhất trong mảng hai chiều: " + minArr);

    }

    public static int minArr(int[][] arr) {
        int min = arr[0][0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] < min) {
                    min = arr[i][j];
                }
            }
        }
        return min;
    }
}
