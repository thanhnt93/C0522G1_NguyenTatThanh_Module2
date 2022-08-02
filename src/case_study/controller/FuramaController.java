package case_study.controller;

import java.util.Scanner;

public class FuramaController {
    public static void displayMainMenu() {
        Scanner sc = new Scanner(System.in);
        EmployeeController employeeController = new EmployeeController();
        CustomerController customerController = new CustomerController();
        FacilityController facilityController = new FacilityController();
        BookingController bookingController = new BookingController();
        PromotionController promotionController = new PromotionController();
        do {
            try {
                System.out.print("--ỨNG DỤNG QUẢN LÝ KHU NGHĨ DƯỠNG FURAMA–- \n" +
                        "1. Quản lý nhân viên.\n" +
                        "2. Quản lý khách hàng.\n" +
                        "3. Quản lý cơ sở.\n" +
                        "4. Quản lý đặt chỗ.\n" +
                        "5. Quản lý khuyến mãi.\n" +
                        "6. Thoát khu quản lí\n" +
                        "Mời bạn chọn: ");
                int choose = Integer.parseInt(sc.nextLine());
                System.out.println("--------------------------------------------");
                switch (choose) {
                    case 1:
                        employeeController.menuEmployee();
                        break;
                    case 2:
                        customerController.menuCustomer();
                        break;
                    case 3:
                        facilityController.menuFacility();
                        break;
                    case 4:
                        bookingController.menuBooking();
                        break;
                    case 5:
                        promotionController.menuPromotion();
                        break;
                    case 6:
                        System.exit(1);
                    default:
                        System.out.println("Không có trong Menu, vui lòng chọn lại");
                }
            } catch (NumberFormatException e) {
                System.out.println("Vui lòng nhập số thứ tự trong MENU, không nhập kí tự đặc biệt");
            }

        } while (true);
    }
}
