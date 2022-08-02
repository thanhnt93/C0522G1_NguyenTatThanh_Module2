package case_study.controller;

import case_study.service.IFacilityService;
import case_study.service.impl.FacilityServiceImpl;

import java.util.Scanner;

public class FacilityController {
    private Scanner sc = new Scanner(System.in);
    IFacilityService iFacilityService = new FacilityServiceImpl();

    public void menuFacility() {
        do {
            try {
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
                        iFacilityService.display();
                        System.out.println("--------------------------------------------");
                        break;
                    case 2:
                        iFacilityService.add();
                        System.out.println("--------------------------------------------");
                        break;
                    case 3:

                        System.out.println("--------------------------------------------");
                        break;
                    case 4:
                        return;
                    default:
                        System.out.println("Không có trong Menu, vui lòng chọn lại");
                }
            } catch (NumberFormatException e){
                System.out.println("Vui lòng nhập số thứ tự trong MENU, không nhập kí tự đặc biệt");
            }

        } while (true);
    }
}
