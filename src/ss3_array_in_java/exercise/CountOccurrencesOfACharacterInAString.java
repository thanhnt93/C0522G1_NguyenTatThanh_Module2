package ss3_array_in_java.exercise;

import java.util.Scanner;

public class CountOccurrencesOfACharacterInAString {
    //    Đếm số lần xuất hiện của một ký tự trong một chuỗi
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập chuỗi ký tự dài: ");
        String characterString = sc.nextLine();
        System.out.print("Nhập một ký tự muốn đếm: ");
        String character = sc.nextLine();

//        String characterString = "nguyentatthanh";
//        char character = 'n';
        int count = 0;
        for (int i = 0; i < characterString.length(); i++) {
            if (character.charAt(0) == characterString.charAt(i)) {
                count++;
            }
        }
        System.out.print("Ký tự " + character + " xuất hiện " + count + " lần trong chuỗi");
    }
}
