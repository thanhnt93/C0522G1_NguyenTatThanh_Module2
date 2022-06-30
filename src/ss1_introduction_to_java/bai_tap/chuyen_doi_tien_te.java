package ss1_introduction_to_java.bai_tap;

import java.util.Scanner;

public class chuyen_doi_tien_te {
    public static void main(String[] args) {
        double vnd = 20000;
        double usd;
        Scanner sc = new Scanner(System.in);
        System.out.print("Mời bạn nhập số tiền: ");
        usd = sc.nextDouble();
        double quyDoi = usd * 23000;
        System.out.print("Số tiền VND: " + quyDoi);

    }
}
