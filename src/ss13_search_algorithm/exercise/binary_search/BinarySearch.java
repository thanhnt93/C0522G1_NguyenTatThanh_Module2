package ss13_search_algorithm.exercise.binary_search;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {

    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int[] arr = enterArray();

        System.out.print("Nhập số cần tìm: ");
        int k = Integer.parseInt(sc.nextLine());

        System.out.println(Arrays.toString(arr));

        System.out.print(k + " nằm ở vị trí: ");
        System.out.println(binarySearch(arr, 0, arr.length - 1, k));
    }

    /**
     * Phương thức thuật toán tìm kiếm nhị phận
     * @param arr: Mảng cần tìm kiếm
     * @param left: vị trí đầu tiên của mảng
     * @param right: vị trí cuối cùng của mảng
     * @param x: số cần tìm trong mảng
     * @return nếu có thì trả về vị trí của mảng, ngược lại thì trả về -1
     */
    public static int binarySearch(int[] arr, int left, int right, int x) {
        if (right >= left) {
            int mid = (left + right) / 2;

            if (x == arr[mid]) {
                return mid;
            }

            if (x > arr[mid]) {
                return binarySearch(arr, mid + 1, right, x);
            }

            return binarySearch(arr, left, mid + 1, x);
        }

        return -1;
    }

    /**
     * Phương thức nhập các giá trị vào mảng
     * @return trả về mảng int
     */
    public static int[] enterArray(){
        System.out.print("Nhập số phần tử của mảng: ");
        int numberArr = Integer.parseInt(sc.nextLine());

        int[] arr = new int[numberArr];

        for (int i = 0; i < arr.length; i++){
            System.out.print("Nhập phần tử thứ " + (i + 1) + ": ");
            arr[i] = Integer.parseInt(sc.nextLine());
        }
        Arrays.sort(arr);

        return arr;
    }

}
