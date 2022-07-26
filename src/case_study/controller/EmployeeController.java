package case_study.controller;

import btvn_mvc.student_management.service.IStudentService;
import btvn_mvc.student_management.service.impl.StudentService;

import java.util.Scanner;

public class EmployeeController {
    private Scanner sc = new Scanner(System.in);
    IStudentService iStudentService = new StudentService();

    public void menuEmployee() {
        do {
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
