package case_study.controller;

import java.util.Scanner;

public class PromotionController {
    private Scanner sc = new Scanner(System.in);


    public void menuPromotion() {
        do {
            System.out.print("--QUẢN LÝ KHUYẾN MÃI-- \n" +
                    "1. Hiển thị danh sách khách hàng sử dụng dịch vụ.\n" +
                    "2. Hiển thị danh sách khách hàng nhận được voucher.\n" +
                    "3. Trở về MENU chính.\n" +
                    "Mời bạn chọn");
            int choose = Integer.parseInt(sc.nextLine());
            System.out.println("--------------------------------------------");
            switch (choose) {
                case 1:

                    System.out.println("--------------------------------------------");
                    break;
                case 2:

                    System.out.println("--------------------------------------------");
                    break;
                case 3:
                    return;
            }
        } while (true);
    }
}
