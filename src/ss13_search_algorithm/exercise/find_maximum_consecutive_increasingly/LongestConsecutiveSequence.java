package ss13_search_algorithm.exercise.find_maximum_consecutive_increasingly;

import java.util.LinkedList;
import java.util.Scanner;

public class LongestConsecutiveSequence {
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        LinkedList<Character> max = new LinkedList<>();
        LinkedList<Character> list = new LinkedList<>();

        longestConsecutiveSequence(max, list);

    }

    /**
     * Phương thức tìm chuỗi có độ dài lớn nhất
     *
     * @param max:  chuỗi kí tự có độ dài  lớn nhất
     * @param list: danh sách chuỗi kí tự
     */
    public static void longestConsecutiveSequence(LinkedList<Character> max, LinkedList<Character> list) {
        System.out.print("Nhập chuỗi: ");
        String str = sc.nextLine();

        for (int i = 0; i < str.length(); i++) {
            if (list.size() > 1 && str.charAt(i) <= list.getLast() &&
                    list.contains(str.charAt(i))) {
                list.clear();
            }

            list.add(str.charAt(i));

            if (list.size() > max.size()) {
                max.clear();
                max.addAll(list);
            }
        }

        for (Character ch : max) {
            System.out.print(ch);
        }
    }
}
