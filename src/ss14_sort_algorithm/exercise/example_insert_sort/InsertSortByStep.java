package ss14_sort_algorithm.exercise.example_insert_sort;

import java.util.Arrays;
import java.util.Scanner;

public class InsertSortByStep {
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int[] arr = {10, 2, 11, 5, 6, 8, 3, 4};
        System.out.println(Arrays.toString(arr));
        insertSortByStep(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void insertSortByStep(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j;
            for (j = i - 1; j >= 0 && arr[j] > key; j--) {
                System.out.println("Xét " + arr[i] + " với " + arr[i - 1]);
                arr[j + 1] = arr[j];
            }
//            System.out.println(arr[j + 1] + "<" + arr[]);
            arr[j + 1] = key;
            System.out.println(Arrays.toString(arr));
        }
    }

    /**
     * Phương thức nhập các giá trị vào mảng
     *
     * @return trả về mảng int
     */
    private static int[] enterArray() {
        System.out.print("Nhập số phần tử mảng: ");
        int numberArr = Integer.parseInt(sc.nextLine());

        int[] arr = new int[numberArr];

        for (int i = 0; i < arr.length; i++) {
            System.out.print("Nhập phần tử thứ " + (i + 1) + ": ");
            arr[i] = Integer.parseInt(sc.nextLine());
        }

        return arr;
    }
}
