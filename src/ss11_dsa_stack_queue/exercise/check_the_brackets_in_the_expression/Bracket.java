package ss11_dsa_stack_queue.exercise.check_the_brackets_in_the_expression;

import java.util.Scanner;
import java.util.Stack;

public class Bracket {
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập vào biểu thức toán học: ");
        String sym = sc.nextLine();

        System.out.println(isSym(sym));
    }

    /**
     * Phương thức kiểm tra dấu ngoặc trong biểu thức
     *
     * @param sym
     * @return boolean
     */
    public static boolean isSym(String sym) {
        Stack<String> stringStack = new Stack<>();

        for (int i = 0; i < sym.length(); i++) {
            if ("(".equals(sym.substring(i, i + 1))) {
                stringStack.add("(");
            } else if (")".equals(sym.substring(i, i + 1))) {
                if (stringStack.isEmpty()) {
                    return false;
                }
                stringStack.pop();
            }
        }
        return stringStack.isEmpty();
    }
}
