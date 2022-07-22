package case_study.controller;

import btvn_mvc.student_management.controller.StudentController;
import btvn_mvc.student_management.controller.TeacherController;

import java.util.Scanner;

public class FuramaController {
    public static void displayMainMenu() {
        Scanner sc = new Scanner(System.in);
        EmployeeManagementController employeeManagementController = new EmployeeManagementController();

        do {
            System.out.print("--MENU –- \n" +
                    "1. Employee Management\n" +
                    "2. Customer Management\n" +
                    "3. Facility Management\n" +
                    "4. Facility Management\n" +
                    "5. Promotion Management\n" +
                    "6. Exit" +
                    "Enter: ");

            int choose = Integer.parseInt(sc.nextLine());
            System.out.println("--------------------------------------------");
            switch (choose) {
                case 1: {
                    employeeManagementController.menuEmployee();
                    break;
                }
                case 2: {

                }
                case 3: {

                }
                case 4: {

                }
                case 5: {

                }
                case 6: {
                    System.exit(1);
                }
            }
        } while (true);
    }
}
