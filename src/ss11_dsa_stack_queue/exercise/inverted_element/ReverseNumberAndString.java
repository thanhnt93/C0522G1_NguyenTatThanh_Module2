package ss11_dsa_stack_queue.exercise.inverted_element;

import java.util.Scanner;
import java.util.Stack;

public class ReverseNumberAndString {
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Stack<Integer> arrStackNumber = new Stack<>();
        ReverseNumber(arrStackNumber);

        System.out.println("\n-------------------------------------");

        Stack<Character> arrStackString = new Stack<>();
        ReverseString(arrStackString);
    }

    /**
     * Phương thức đảo ngược phần tử số
     * @param arrStack
     */
    public static void ReverseNumber(Stack<Integer> arrStack) {
        System.out.print("Nhập số phần tử: ");
        int number = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < number; i++) {
            System.out.print("Nhập phần tử thứ " + i + ": ");
            arrStack.push(Integer.valueOf(sc.nextLine()));
        }

        System.out.print("Mảng đảo ngược: ");
        for (int i = 0; i < arrStack.size(); ) {
            System.out.print(arrStack.pop() + "\t");
        }

    }

    /**
     * Phương thức đảo ngược kí tự chuỗi
     * @param arrStack
     */
    public static void ReverseString(Stack<Character> arrStack) {
        System.out.print("Nhập một chuỗi: ");
        String str = sc.nextLine();

        for (int i = 0; i < str.length(); i++) {
            arrStack.push(str.charAt(i));
        }

        System.out.print("Chuỗi đảo ngược: ");
        for (int i = 0; i < arrStack.size(); ) {
            System.out.print(arrStack.pop() + "\t");
        }

    }
}
