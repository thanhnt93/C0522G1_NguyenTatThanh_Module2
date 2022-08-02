package case_study.controller;


import case_study.service.ICustomerService;
import case_study.service.impl.CustomerServiceImpl;

import java.util.Scanner;

public class CustomerController {
    private Scanner sc = new Scanner(System.in);
    ICustomerService iCustomerService = new CustomerServiceImpl();

    public void menuCustomer() {
        do {
            try {
                System.out.print("--QUẢN LÝ KHÁCH HÀNG-- \n" +
                        "1. Hiển thị danh sách khách hàng.\n" +
                        "2. Thêm mới khách hàng.\n" +
                        "3. Chỉnh sửa khách hàng.\n" +
                        "4. Tìm kiếm khách hàng theo ID\n" +
                        "5. Xóa khách hàng\n" +
                        "6. Trở về MENU chính\n" +
                        "Mời bạn chọn: ");
                int choose = Integer.parseInt(sc.nextLine());
                System.out.println("--------------------------------------------");
                switch (choose) {
                    case 1:
                        iCustomerService.display();
                        System.out.println("--------------------------------------------");
                        break;
                    case 2:
                        iCustomerService.add();
                        System.out.println("--------------------------------------------");
                        break;
                    case 3:
                        iCustomerService.update();
                        System.out.println("--------------------------------------------");
                        break;
                    case 4:
                        iCustomerService.seachByID();
                        System.out.println("--------------------------------------------");
                        break;
                    case 5:
                        iCustomerService.remove();
                        System.out.println("--------------------------------------------");
                        break;
                    case 6:
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
