package ss3_array_in_java.exercise;

import java.util.Scanner;

public class RemoveElementFromArray {
    //    Xoá phần tử khỏi mảng
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số phần tử: ");
        int number = sc.nextInt();
        int[] arrN = new int[number];
        for (int i = 0; i < number; i++) {
            System.out.print("Nhập phần tử thứ " + i + " là: ");
            arrN[i] = sc.nextInt();
        }
        System.out.print("Nhập số cần xóa trong mảng: ");
        int deleteNumber = sc.nextInt();

//        int[] arrN = {2, 5, 6, 4, 7, 21, 3, 12};
//        int deleteNumber = 3;
        int indexDel = 0;
        for (int i = 0; i < arrN.length; i++) {
            if (deleteNumber == arrN[i]) {
                indexDel = i;
            }
        }
        // System.out.print(indexDel);
        if (indexDel >= 0) {
            /*Xóa nếu number tồn tại*/
            for (int i = indexDel; i < arrN.length - 1; i++) {
                arrN[i] = arrN[i + 1];
            }
            //gán 0 cho phần tử cuối
            arrN[arrN.length - 1] = 0;

            for (int i = 0; i < arrN.length; i++) {
                System.out.print(arrN[i] + "\t");
            }
        } else {
            /*Ko có number trong mảng*/
            System.out.print("Not found: " + deleteNumber);

        }

    }
}
