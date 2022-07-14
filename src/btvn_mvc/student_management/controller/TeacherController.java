package btvn_mvc.student_management.controller;

import btvn_mvc.student_management.service.ITeacherService;
import btvn_mvc.student_management.service.impl.TeacherService;

import java.util.Scanner;

public class TeacherController {
    private Scanner sc = new Scanner(System.in);
    ITeacherService iTeacherService = new TeacherService();

    public void menuTeacher() {
        do {
            System.out.print("--QUẢN LÝ GIẢNG VIÊN-- \n" +
                    "1. Thêm mới giảng viên \n" +
                    "2. Xóa giảng viên \n" +
                    "3. Xem danh sách giảng viên \n" +
                    "4. Quay về menu chính. \n" +
                    "Mời bạn nhập lựa chọn: ");
            int choose = Integer.parseInt(sc.nextLine());
            System.out.println("--------------------------------------------");
            switch (choose) {
                case 1:
                    iTeacherService.addTeacher();
                    System.out.println("--------------------------------------------");
                    break;
                case 2:
                    iTeacherService.removeTeacher();
                    System.out.println("--------------------------------------------");
                    break;
                case 3:
                    iTeacherService.displayAllTeacher();
                    System.out.println("--------------------------------------------");
                    break;
                case 4:
                    return;
            }
        } while (true);
    }
}
