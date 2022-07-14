package btvn_mvc.student_management.controller;

import java.util.Scanner;

public class MainController {
    public static void menuController() {
        Scanner sc = new Scanner(System.in);
        StudentController studentController = new StudentController();
        TeacherController teacherController = new TeacherController();
        do {
            System.out.print("--CHƯƠNG TRÌNH QUẢN LÝ HỌC SINH VÀ GIẢNG VIÊN –- \n" +
                    "1. Quản lí học sinh.\n" +
                    "2. Quản lí giảng viên \n" +
                    "3. Thoát chương trình \n" +
                    "Mời bạn nhập lựa chọn: ");

            int choose = Integer.parseInt(sc.nextLine());
            System.out.println("--------------------------------------------");
            switch (choose) {
                case 1: {
                    studentController.menuStudent();
                    break;
                }
                case 2: {
                    teacherController.menuTeacher();
                }
                case 3: {
                    System.exit(1);
                }
            }
        } while (true);
    }
}
