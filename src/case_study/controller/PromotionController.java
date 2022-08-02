package case_study.controller;

import java.util.Scanner;

public class PromotionController {
    private Scanner sc = new Scanner(System.in);


    public void menuPromotion() {
        do {
            try {
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
                    default:
                        System.out.println("Không có trong Menu, vui lòng chọn lại");
                }
            } catch (NumberFormatException e) {
                System.out.println("Vui lòng nhập số thứ tự trong MENU, không nhập kí tự đặc biệt");
            }
        } while (true);
    }
}
