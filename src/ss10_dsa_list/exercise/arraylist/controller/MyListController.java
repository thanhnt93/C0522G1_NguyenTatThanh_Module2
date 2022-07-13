package ss10_dsa_list.exercise.arraylist.controller;


import ss10_dsa_list.exercise.arraylist.model.Student;
import ss10_dsa_list.exercise.arraylist.service.impl.StudentService;

import java.util.Scanner;

public class MyListController {
    public void displayMenu() {
        Scanner scanner = new Scanner(System.in);


        StudentService<Student> newMyArrayList = new StudentService<>();
        StudentService<Student> studentStudentService = new StudentService<>();

        Student student1 = new Student(1, "Huan");
        Student student2 = new Student(2, "Thanh");
        Student student3 = new Student(3, "Hung");
        Student student4 = new Student(4, "Nam");
        Student student5 = new Student(5, "Phuc");


        studentStudentService.add(student1);
        studentStudentService.add(student2);
        studentStudentService.add(student3);
        studentStudentService.add(student4);
        studentStudentService.add(student5);

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
        studentStudentService.add(student1, 5);
        for (int i = 0; i < studentStudentService.size(); i++) {
            System.out.print(studentStudentService.get(i).getId() + " ");
            System.out.println(studentStudentService.get(i).getName());
        }

//        int choose;
//        do {
//            System.out.println("======== Menu ========");
//            System.out.println("1. Thêm mới");
//            System.out.println("2. Hiển thị danh sách");
//            System.out.println("3. Chỉnh sửa");
//            System.out.println("4. Xóa");
//            System.out.println("5. Thoát");
//            System.out.print("Nhập sự lựa chọn của bạn: ");
//            choose = Integer.parseInt(scanner.nextLine());
//
//            if (choose < 1 || choose > 5) {
//                System.out.println("Lựa chọn không hợp lại, vui lòng nhập lại: ");
//                continue;
//            }
//            switch (choose) {
//                case 1:
//                    break;
//                case 2:
//
//                case 3:
//                    break;
//                case 4:
//                    break;
//                case 5:
//                    System.exit(0);
//            }
//        } while (true);
    }
}
