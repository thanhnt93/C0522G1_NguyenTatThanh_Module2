package demo_mvc.controller;
import demo_mvc.service.IPersonService;
import demo_mvc.service.IStudentService;
import demo_mvc.service.impl.PersonService;
import demo_mvc.service.impl.StudentService;

import java.util.Scanner;
public class MainController {
    IPersonService iPersonService = new PersonService();
    IStudentService iStudentService = new StudentService();

    public void displayMenu() {
        Scanner scanner = new Scanner(System.in);
        int choose;
        do {
            System.out.println("======== Menu ========");
            System.out.println("1. Thêm mới");
            System.out.println("2. Hiển thị danh sách");
            System.out.println("3. Chỉnh sửa");
            System.out.println("4. Xóa");
            System.out.println("5. Thoát");
            System.out.print("Nhập sự lựa chọn của bạn: ");
            choose = Integer.parseInt(scanner.nextLine());

            if (choose < 1 || choose > 5) {
                System.out.println("Lựa chọn không hợp lại, vui lòng nhập lại: ");
                continue;
            }
            switch (choose) {
                case 1:
                    break;
                case 2:
                    iPersonService.findAll();
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    System.exit(0);
            }
        } while (true);
    }
}
