package case_study.controller;

import java.util.Scanner;

public class FacilityController {
    private Scanner sc = new Scanner(System.in);


    public void menuFacility() {
        do {
            System.out.print("--QUẢN LÝ CƠ SỞ-- \n" +
                    "1. Hiển thị cơ sở.\n" +
                    "2. Thêm mới cơ sở.\n" +
                    "3. Hiển thị danh sách bảo trì cơ sở.\n" +
                    "4. Trở về MENU chính\n" +
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
                    return;
            }
        } while (true);
    }
}
