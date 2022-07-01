package ss2_loop_java.exercise;

public class DisplayPrimesLessThanOneHundred {
    //Hiển thị các số nguyên tố nhỏ hơn 100
    public static void main(String[] args) {
        System.out.print("Các số nguyên tố nhỏ hơn 100: ");
        for (int i = 1; i < 100; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
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
