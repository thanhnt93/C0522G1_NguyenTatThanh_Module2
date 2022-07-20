package ss14_sort_algorithm.demo_sort;

import java.util.Locale;

public class Sort {

    /**
     * Phương thức giải thuật sắp xếp nổi bọt
     * @param arr: Danh sách mảng số nguyên int
     */
    public static void bubbleSort(int[] arr){
        boolean isSwap = true;
        for (int i = 0; i < arr.length - 1 && isSwap; i++){
            isSwap = false;
            for (int j = 0; j < arr.length - 1 - i; j++){
                if(arr[j] > arr[j + 1]){
                    int temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                    isSwap = true;
                }
            }
        }
    }

    /**
     * Phương thức giải thuật sắp xếp chọn
     * @param arr: Danh sách mảng số nguyên int
     */
    public static void selectSort(int[] arr){
        for (int i = 0; i < arr.length - 1; i++){
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++){
                if(arr[j] < arr[minIndex]){
                    minIndex = j;
                }
            }
            if (minIndex != i){
                int temp = arr[minIndex];
                arr[minIndex] = arr[i];
                arr[i] = temp;
            }
        }
    }

    /**
     * Phương thức giải thuật sắp xếp chèn
     * @param arr: Danh sách mảng số nguyên int
     */
    public static void insertSort(int[] arr){
        for (int i = 1; i < arr.length; i++){
            int key = arr[i];
            int j;
            for (j = i - 1; j >= 0 && arr[j] > key;j--){
                arr[j + 1] = arr[j];
            }
            arr[j + 1] = key;
        }
    }


}
