package ss3_array_in_java.exercise;

import java.util.Scanner;

public class MergeArray {
    //    Gộp mảng
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số phần tử mảng thứ nhất: ");
        int numberArrFirst = sc.nextInt();
        int[] arrFirst = new int[numberArrFirst];
        for (int i = 0; i < numberArrFirst; i++) {
            System.out.print("Nhập phần tử thứ " + i + " là: ");
            arrFirst[i] = sc.nextInt();
        }

        System.out.print("Nhập số phần tử mảng thứ hai: ");
        int numberArrSecond = sc.nextInt();
        int[] arrSecond = new int[numberArrSecond];
        for (int i = 0; i < numberArrSecond; i++) {
            System.out.print("Nhập phần tử thứ " + i + " là: ");
            arrSecond[i] = sc.nextInt();
        }

//        int[] arrSecond = {1, 2, 3, 4, 5};
//        int[] arrSecond = {2, 3, 4, 5, 6};
        int[] arrThree = new int[arrFirst.length + arrSecond.length];
        for (int i = 0; i < arrFirst.length; i++) {
            arrThree[i] = arrFirst[i];
        }
        int indexArrSecond = arrFirst.length;
        for (int i = 0; i < arrSecond.length; i++) {
            arrThree[indexArrSecond++] = arrSecond[i];
        }
        System.out.print("Mảng đã nối: ");
        for (int i = 0; i < arrThree.length; i++) {
            System.out.print(arrThree[i] + "\t");
        }

    }
}

