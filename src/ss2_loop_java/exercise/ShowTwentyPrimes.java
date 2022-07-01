package ss2_loop_java.exercise;

import java.util.Scanner;

public class ShowTwentyPrimes {
    //    Hiển thị 20 số nguyên tố
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Bạn muốn hiển thị bao nhiêu số nguyên tố: ");
        int number = sc.nextInt();
        int count = 0;
        for (int i = 1; i > 0; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
                count++;
            }
            if (count == number) {
                break;
            }
        }
    }

    public static boolean isPrime(int number) {
        int count = 0;
        boolean check = false;
        if (number >= 2) {
            for (int i = 1; i <= number; i++) {
                if (number % i == 0) {
                    count++;
                }
            }
            if (count == 2) {
                check = true;
            }
        }
        return check;
    }
}
