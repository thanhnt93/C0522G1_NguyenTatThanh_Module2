package ss10_dsa_list.exercise.arraylist.controller;


import ss10_dsa_list.exercise.arraylist.model.Student;
import ss10_dsa_list.exercise.arraylist.service.IStudentService;
import ss10_dsa_list.exercise.arraylist.service.impl.StudentService;

import java.util.Scanner;

public class MyListController {
    IStudentService iStudentService = new StudentService<>();
    StudentService studentService = new StudentService();

    public void displayMenu() {
        Scanner sc = new Scanner(System.in);
        int choose;
        do {
            System.out.println("======== Menu ========");
            System.out.println("1. Hiển thị danh sách");
            System.out.println("2. Thêm mới");
            System.out.println("3. Kiểm tra danh sách có hay không ?");
            System.out.println("4. Xóa");
            System.out.println("5. Thoát");
            System.out.print("Nhập sự lựa chọn của bạn: ");
            choose = Integer.parseInt(sc.nextLine());

            if (choose < 1 || choose > 5) {
                System.out.println("Lựa chọn không hợp lại, vui lòng nhập lại: ");
                continue;
            }
            switch (choose) {
                case 1:
                    iStudentService.findAll();
                    break;
                case 2:
                    System.out.print("Nhập id: ");
                    int id = Integer.parseInt(sc.nextLine());

                    System.out.print("Nhập tên: ");
                    String name = sc.nextLine();

                    StudentService.people.add(new Student(id,name));
                    break;
                case 3:

                    break;
                case 4:
                    break;
                case 5:
                    System.exit(0);
            }
        } while (true);


//        for (int i = 0; i < studentStudentService.size(); i++){
//            Student student = (Student) studentStudentService.element[i];
//            System.out.print(student.getId() + " ");
//            System.out.println(student.getName());
//        }

//        System.out.println(studentStudentService.size());
//        System.out.println(studentStudentService.get(2).getName());
//        System.out.println(studentStudentService.indexOf(student3));
//        System.out.println(studentStudentService.contains(student3));

//        newMyArrayList = studentStudentService.clone();
//        newMyArrayList.remove(0);
//        studentStudentService.add(student1, 5);
//        for (int i = 0; i < studentStudentService.size(); i++) {
//            System.out.print(studentStudentService.get(i).getId() + " ");
//            System.out.println(studentStudentService.get(i).getName());
//        }

    }
}
