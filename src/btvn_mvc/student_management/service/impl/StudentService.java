package btvn_mvc.student_management.service.impl;

import btvn_mvc.student_management.model.Student;
import btvn_mvc.student_management.service.IStudentService;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentService implements IStudentService {
    private static List<Student> studentList = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

   static {

       Student student1 = new Student(1, "Nguyễn Tất Thành", "24-02-2000", "Nam", "C052G1", 10);
       Student student2 = new Student(2, "Nguyễn Tấn Huân", "26-09-2000", "Nam", "C052G1", 7);
       Student student3 = new Student(3, "Bùi Hùng", "28-12-2000", "Nam", "C052G1", 6);
       Student student4 = new Student(4, "Lê Đại Lợi", "30-08-2000", "Nam", "C052G1", 8);
       Student student5 = new Student(5, "Huỳnh Trung Thuyên", "01-12-2000", "Nam", "C052G1", 9);

       studentList.add(student1);
       studentList.add(student2);
       studentList.add(student3);
       studentList.add(student4);
       studentList.add(student5);
   }

    public void addStudent() {
        Student student = infoStudent();
        studentList.add(student);
        System.out.println("Thêm mới thành công!. ");
    }

    @Override
    public void displayAllStudent() {
        for (Student student : studentList) {
            System.out.println(student);
        }
//        for(int i =0; i< studentList.size(); i++) {
//            System.out.println(studentList.get(i));
//        }
    }

    @Override
    public void removeStudent() {
        System.out.println("Mời bạn nhập id cần xóa: ");
        int idRemove = Integer.parseInt(scanner.nextLine());
        boolean isFlag = false;
        for (Student student : studentList) {
            if (student.getId() == idRemove) {
                System.out.println(" Bạn có chắc muốn xóa hay không? \n" +
                        "1. Có \n" +
                        "2. Không");
                int chooseYesNo = Integer.parseInt(scanner.nextLine());
                if (chooseYesNo == 1) {
                    studentList.remove(student);
                    System.out.println("Xóa thành công!.");
                }
                isFlag = true;
                break;

            }
        }
        if (!isFlag) {
            System.out.println("Không tìm thấy");
        }
    }

    public static Student infoStudent() {
        System.out.println("--NHẬP THÔNG TIN HỌC SINH--");
        System.out.print("Nhập id: ");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.print("Nhập name: ");
        String name = scanner.nextLine();
        System.out.print("Nhập ngày sinh: ");
        String dateOfBirth = scanner.nextLine();
        System.out.print("Nhập giới tính: ");
        String sex = scanner.nextLine();
        System.out.print("Nhập Lớp: ");
        String classed = scanner.nextLine();
        System.out.print("Nhập điểm: ");
        int point = Integer.parseInt(scanner.nextLine());
        Student student = new Student(id, name, dateOfBirth, sex, classed, point);
        return student;
    }

}