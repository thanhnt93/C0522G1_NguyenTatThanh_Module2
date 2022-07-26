package case_study.controller;

import java.util.Scanner;

public class BookingController {
    private Scanner sc = new Scanner(System.in);


    public void menuBooking() {
        do {
            System.out.print("--QUẢN LÝ ĐẶT CHỖ-- \n" +
                    "1. Thêm mới đặt chỗ.\n" +
                    "2. Hiển thị danh sách đặt chỗ.\n" +
                    "3. Tạo hợp đồng mới.\n" +
                    "4. Hiển thị danh sách hợp đồng.\n" +
                    "5. Chỉnh sửa hợp đồng.\n" +
                    "6. Trở về MENU chính.\n" +
                    "Mời bạn chọn: ");
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

                    System.out.println("--------------------------------------------");
                    break;
                case 4:

                    System.out.println("--------------------------------------------");
                    break;
                case 5:

                    System.out.println("--------------------------------------------");
                    break;
                case 6:
                    return;
            }
        } while (true);
    }
}
