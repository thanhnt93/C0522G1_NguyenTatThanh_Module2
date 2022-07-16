package ss11_dsa_stack_queue.exercise.decimal_to_binary;

import java.util.Scanner;
import java.util.Stack;

public class DecimalToBinary {
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Stack<Integer> binary = new Stack<>();
        decimalToBinary(binary);

    }

    /**
     * Phương thức chuyển đổi hệ thập phân sang nhị phân
     *
     * @param binary
     */
    public static void decimalToBinary(Stack<Integer> binary) {
        System.out.print("Nhập số: ");
        int decimal = Integer.parseInt(sc.nextLine());

        int temp = decimal;

        while (temp > 0) {
            binary.push(temp % 2);
            temp /= 2;
        }

        System.out.print(decimal + " đổi thành nhị phân: ");
        while (!binary.isEmpty()) {
            System.out.print(binary.pop());
        }

    }
}
