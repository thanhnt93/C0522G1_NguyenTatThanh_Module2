package case_study.controller;

import btvn_mvc.student_management.service.IStudentService;
import btvn_mvc.student_management.service.impl.StudentService;

import java.util.Scanner;

public class CustomerController {
    private Scanner sc = new Scanner(System.in);


    public void menuCustomer() {
        do {
            System.out.print("--QUẢN LÝ KHÁCH HÀNG-- \n" +
                    "1. Hiển thị danh sách khách hàng.\n" +
                    "2. Thêm mới khách hàng.\n" +
                    "3. Chỉnh sửa khách hàng.\n" +
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
