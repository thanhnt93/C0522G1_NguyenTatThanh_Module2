package ss14_sort_algorithm.exercise.insert_sort;

import java.util.Arrays;
import java.util.Scanner;

public class InsertSort {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int[] arr = enterArray();
        insertionSort(arr);

        System.out.println(Arrays.toString(arr));
    }

    /**
     * Phương thức giải thuật sắp xếp chèn
     *
     * @param arr: Danh sách mảng số nguyên int
     */
    public static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j;
            for (j = i - 1; j >= 0 && arr[j] > key; j--) {
                arr[j + 1] = arr[j];
            }
            arr[j + 1] = key;
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
