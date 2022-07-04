package ss3_array_in_java.exercise;

import java.util.Arrays;
import java.util.Scanner;

public class AddElementToArray {
    //    thêm phần tử vào mảng
    public static void main(String[] args) {
//        int[] arrNumber = new int[]{1, 3, 4, 5, 7, 9, 12};
//        int[] newArr = new int[arrNumber.length + 1];
//        int value = 20;
        Scanner sc = new Scanner(System.in);
        int arrayLength;

        do {
            System.out.print("Nhập chiều dài của mảng: ");
            arrayLength = sc.nextInt();
            if (arrayLength < 1) {
                System.out.print("Độ dài phải > 0, vui lòng kiểm tra lại \n");
            }
        } while (arrayLength < 1);

        int[] arrNumber = new int[arrayLength];

        for (int i = 0; i < arrayLength; i++) {
            System.out.print("Nhập vào phần tử thứ " + i + " là: ");
            arrNumber[i] = sc.nextInt();
        }

        System.out.print("Mảng vừa nhập: ");
        System.out.print(Arrays.toString(arrNumber) + "\n");

        System.out.print("Nhập vào giá trị chèn: ");
        int value = sc.nextInt();
        System.out.print("Nhập vào vị trí chèn: ");
        int indexInsert;
        boolean isNotIndex;
        do {
            indexInsert = sc.nextInt();
            isNotIndex = indexInsert < 0 || indexInsert >= arrNumber.length;
            if (isNotIndex) {
                System.out.print("Vị trí thêm vào mảng không tồn tài, yêu cầu nhập lại: ");
            }
        } while (isNotIndex);


        arrNumber = addElement(arrNumber, value, indexInsert);

        System.out.print("Mảng sau khi thêm: ");
        System.out.print(Arrays.toString(arrNumber));
    }

    public static int[] addElement(int[] arr, int value, int index) {

        int[] arrNew = new int[arr.length + 1];

        for (int i = 0; i < index; i++) {
            arrNew[i] = arr[i];
        }

        arrNew[index] = value;

        for (int i = index + 1; i < arrNew.length; i++) {
            arrNew[i] = arr[i - 1];
        }

        return arrNew;

    }
}
