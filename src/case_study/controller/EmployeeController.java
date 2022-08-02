package case_study.controller;

import case_study.service.IEmployeeService;
import case_study.service.impl.EmployeeServiceImpl;

import java.util.Scanner;

public class EmployeeController {
    private Scanner sc = new Scanner(System.in);
    IEmployeeService iEmployeeService = new EmployeeServiceImpl();

    public void menuEmployee() {
        do {
            try {
                System.out.print("--QUẢN LÝ NHÂN VIÊN-- \n" +
                        "1. Hiển thị danh sách nhân viên.\n" +
                        "2. Thêm mới nhân viên.\n" +
                        "3. Chỉnh sửa nhân viên.\n" +
                        "4. Trở về MENU chính.\n" +
                        "Mời bạn chọn: ");
                int choose = Integer.parseInt(sc.nextLine());
                System.out.println("--------------------------------------------");
                switch (choose) {
                    case 1:
                        iEmployeeService.display();
                        System.out.println("--------------------------------------------");
                        break;
                    case 2:
                        iEmployeeService.add();
                        System.out.println("--------------------------------------------");
                        break;
                    case 3:
                        iEmployeeService.update();
                        System.out.println("--------------------------------------------");
                        break;
                    case 4:
                        return;
                    default:
                        System.out.println("Không có trong Menu, vui lòng chọn lại");
                }
            }catch (NumberFormatException e){
                System.out.println("Vui lòng nhập số thứ tự trong MENU, không nhập kí tự đặc biệt");
            }

        } while (true);
    }
}
