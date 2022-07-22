package case_study.controller;

import btvn_mvc.student_management.service.IStudentService;
import btvn_mvc.student_management.service.impl.StudentService;

import java.util.Scanner;

public class EmployeeManagementController {
    private Scanner sc = new Scanner(System.in);
    IStudentService iStudentService = new StudentService();

    public void menuEmployee() {
        do {
            System.out.print("--EMPLOYEE MANAGEMENT-- \n" +
                    "1. Display list employees\n" +
                    "2. Add new employee\n" +
                    "3. Edit employee\n" +
                    "4. Return main menu\n" +
                    "Enter: ");
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
