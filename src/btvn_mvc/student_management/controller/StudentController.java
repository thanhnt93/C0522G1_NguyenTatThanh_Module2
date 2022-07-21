package btvn_mvc.student_management.controller;

import btvn_mvc.student_management.service.IStudentService;
import btvn_mvc.student_management.service.impl.StudentService;

import java.util.Scanner;

public class StudentController {
    private Scanner sc = new Scanner(System.in);
    IStudentService iStudentService = new StudentService();

    public void menuStudent() {
        do {
            System.out.print("--QUẢN LÝ HỌC SINH-- \n" +
                    "1. Thêm mới học sinh \n" +
                    "2. Xóa học sinh \n" +
                    "3. Xem danh sách học sinh \n" +
                    "4. Tìm kiếm học sinh theo ID hoặc Tên học sinh \n" +
                    "5. Sắp xếp học sinh theo tên học sinh \n" +
                    "6. Quay về menu chính. \n" +
                    "Mời bạn nhập lựa chọn: ");
            int choose = Integer.parseInt(sc.nextLine());
            System.out.println("--------------------------------------------");
            switch (choose) {
                case 1:
                    iStudentService.addStudent();
                    System.out.println("--------------------------------------------");
                    break;
                case 2:
                    iStudentService.removeStudent();
                    System.out.println("--------------------------------------------");
                    break;
                case 3:
                    iStudentService.displayAllStudent();
                    System.out.println("--------------------------------------------");
                    break;
                case 4:
                    iStudentService.searchStudentsByIdAndName();
                    System.out.println("--------------------------------------------");
                    break;
                case 5:
                    iStudentService.sortByName();
                    System.out.println("--------------------------------------------");
                    break;
                case 6:
                    return;
            }
        } while (true);
    }
}