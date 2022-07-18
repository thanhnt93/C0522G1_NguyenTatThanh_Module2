package ss12_java_collection_framework.exercise.count_word;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class CountWord {
    private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        TreeMap<String, Integer> treeMap = new TreeMap<>();

        countWord(treeMap);

    }

    /**
     * Phương thức đếm số lần xuất hiện trong chuỗi String
     * @param treeMap
     */
    public static void countWord(TreeMap<String, Integer> treeMap){
        System.out.print("Nhập chuỗi cần kiểm tra: ");
        String str = sc.nextLine();

        String[] array = str.toLowerCase().split(" ");

        for (String key : array) {
            if (!treeMap.containsKey(key)) {
                treeMap.put(key, 1);
            } else {
                int count = treeMap.get(key);
                treeMap.put(key, count + 1);
            }
        }

        System.out.println(treeMap);

        Set<String> stringSet = treeMap.keySet();
        System.out.println("Số lần xuất hiện các từ trong chuỗi: ");
        for (String key : stringSet) {
            System.out.println(key + ": " + treeMap.get(key));
        }
    }
}
