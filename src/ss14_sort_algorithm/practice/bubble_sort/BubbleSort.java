package ss14_sort_algorithm.practice.bubble_sort;

public class BubbleSort {
    public static void main(String[] args) {
        bubbleSort(list);
        for (int i = 0; i < list.length; i++)
            System.out.print(list[i] + " ");
    }

    static int[] list = {2, 3, 2, 5, 6, 1, -2, 3, 14, 12};

    /**
     * Phương thức thuật toán sắp xếp nổi bọt
     * @param list: Danh số số nguyên kiểu int
     */
    public static void bubbleSort(int[] list) {
        boolean needNextPass = true;

        for (int k = 1; k < list.length && needNextPass; k++) {
            /* Array may be sorted and next pass not needed */
            needNextPass = false;
            for (int i = 0; i < list.length - k; i++) {
                if (list[i] > list[i + 1]) {
                    /* Swap list[i] with list[i + 1] */
                    int temp = list[i];
                    list[i] = list[i + 1];
                    list[i + 1] = temp;

                    needNextPass = true; /* Next pass still needed */
                }
            }
        }
    }
}
