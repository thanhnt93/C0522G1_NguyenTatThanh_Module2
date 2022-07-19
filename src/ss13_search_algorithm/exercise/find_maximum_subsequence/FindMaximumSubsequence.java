package ss13_search_algorithm.exercise.find_maximum_subsequence;

import java.util.LinkedList;
import java.util.Scanner;

public class FindMaximumSubsequence {
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        LinkedList<Character> max = new LinkedList<>();

        findMaximumSubsequence(max);
    }

    /**
     * Phương thức tìm chuỗi tăng dần có độ dài lớn nhất
     *
     * @param max: Truyền độ dài chuỗi vào LinkedList
     */
    public static void findMaximumSubsequence(LinkedList<Character> max) {
        System.out.print("Nhập chuỗi: ");
        String string = sc.nextLine();

        for (int i = 0; i < string.length(); i++) {
            LinkedList<Character> list = new LinkedList<>();
            list.add(string.charAt(i));
            for (int j = i + 1; j < string.length(); j++) {
                if (string.charAt(j) > list.getLast()) {
                    list.add(string.charAt(j));
                }
            }
            if (list.size() > max.size()) {
                max.clear();
                max.addAll(list);
            }
            list.clear();
        }

        for (Character ch : max) {
            System.out.print(ch);
        }
    }
}
