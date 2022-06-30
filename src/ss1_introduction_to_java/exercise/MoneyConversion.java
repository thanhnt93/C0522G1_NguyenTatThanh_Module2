package ss1_introduction_to_java.exercise;

import java.util.Scanner;

public class MoneyConversion {
//    Chuyển đổi tiền tệ
    public static void main(String[] args) {
        double vnd = 20000;
        double usd;
        Scanner sc = new Scanner(System.in);
        System.out.print("Mời bạn nhập số tiền: ");
        usd = sc.nextDouble();
        double conversion = usd * 23000;
        System.out.print("Số tiền VND: " + conversion);

    }
}
