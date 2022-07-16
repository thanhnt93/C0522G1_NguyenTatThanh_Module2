package ss11_dsa_stack_queue.exercise.palindrome_queue;

import java.util.*;

public class Palindrome {
    private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        Stack<Character> arrStrFirst = new Stack<>();
        Queue<Character> arrStringSecond = new LinkedList<>();
        symmetricChain(arrStrFirst, arrStringSecond);
    }

    /**
     * Phương thức kiểm tra chuỗi Palindrome
     * @param arrStrFirst
     * @param arrStringSecond
     */
    public static void symmetricChain(Stack<Character> arrStrFirst, Queue<Character> arrStringSecond){
        System.out.print("Nhập vào 1 chuỗi: ");
        String str = sc.nextLine();
        str = str.toLowerCase();

        for (int i = 0; i < str.length(); i++){
            arrStrFirst.push(str.charAt(i));
            arrStringSecond.add(str.charAt(i));
        }
            boolean isFlag = false;
        for (int i = 0; i < arrStrFirst.size();){
            if(arrStrFirst.pop() != arrStringSecond.poll()){
                isFlag = true;
                break;
            };
        }
        if (isFlag){
            System.out.print("Không phải là chuỗi Palindrome");
        } else {
            System.out.print("Chuỗi trên là chuỗi Palindrome");
        }
    }

}
