package ss3_array_in_java.exercise;

import java.util.Scanner;

public class SumNumbersInASpecifiedColumn {
    //    Tính tổng các số ở một cột xác định
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] twoDimensionalArray = new int[][]{
                {2, 3, 4, 6},
                {6, 3, 4, 7},
                {9, 6, 4, 3, 2},
                {4, 7, 1, 2}};
        System.out.print("Bạn muốn tính tổng giá trị phần tử nào: ");
        int index = sc.nextInt();
        int sum = 0;
        for (int j = 0; j < twoDimensionalArray[index].length; j++) {
            sum = sum + twoDimensionalArray[index][j];
        }
        System.out.print("Tổng phần tử thứ " + index + " trong mảng hai chiều là: " + sum);
    }
}