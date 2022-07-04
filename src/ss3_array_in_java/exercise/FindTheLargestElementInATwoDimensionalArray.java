package ss3_array_in_java.exercise;

import java.util.Scanner;

public class FindTheLargestElementInATwoDimensionalArray {
    //    Tìm phần tử lớn nhất trong mảng hai chiều
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

//        int[][] twoDimensionalArray = new int[][]{{4, 2, 9, 13}, {6, 7, 8}, {1, 12, 11}};
        int maxArr = maxArr(twoDimensionalArray);
        System.out.print("Số lớn nhất mảng hai chiều: " + maxArr);
    }

    public static int maxArr(int[][] arr) {
        int max = arr[0][0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr[i].length; j++) {
                if (arr[i][j] > max) {
                    max = arr[i][j];
                }
            }
        }
        return max;
    }
}
