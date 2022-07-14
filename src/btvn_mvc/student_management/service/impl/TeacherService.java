package btvn_mvc.student_management.service.impl;

import btvn_mvc.student_management.model.Teacher;
import btvn_mvc.student_management.service.ITeacherService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TeacherService implements ITeacherService {
    private static List<Teacher> teacherList = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    static {
        Teacher teacher1 = new Teacher(1, "HaiTT", "01-01-2000", "Nam", "CNTT");
        Teacher teacher2 = new Teacher(2, "TrungDC", "21-01-2000", "Nam", "CNTT");
        Teacher teacher3 = new Teacher(3, "CongNT", "06-01-2000", "Nam", "CNTT");
        Teacher teacher4 = new Teacher(4, "Chanh", "30-01-2000", "Nam", "CNTT");
        Teacher teacher5 = new Teacher(5, "QuanNN", "11-01-2000", "Nam", "CNTT");

        teacherList.add(teacher1);
        teacherList.add(teacher2);
        teacherList.add(teacher3);
        teacherList.add(teacher4);
        teacherList.add(teacher5);
    }

    @Override
    public void addTeacher() {
        Teacher teacher = infoTeacher();
        teacherList.add(teacher);
        System.out.println("Thêm mới thành công!. ");
    }

    @Override
    public void displayAllTeacher() {
        for (Teacher teacher : teacherList) {
            System.out.println(teacher);
        }
    }

    @Override
    public void removeTeacher() {
        System.out.println("Mời bạn nhập id giảng viên cần xóa: ");
        int idRemove = Integer.parseInt(scanner.nextLine());
        boolean isFlag = false;
        for (Teacher teacher : teacherList) {
            if (teacher.getId() == idRemove) {
                System.out.println(" Bạn có chắc muốn xóa hay không? \n" +
                        "1. Có \n" +
                        "2. Không");
                int chooseYesNo = Integer.parseInt(scanner.nextLine());
                if (chooseYesNo == 1) {
                    teacherList.remove(teacher);
                    System.out.println("Xóa thành công!.");
                }
                isFlag = true;
                break;

            }
        }
        if (!isFlag) {
            System.out.println("Không tìm thấy id giảng viên");
        }
    }

    public static Teacher infoTeacher() {
        System.out.println("--NHẬP THÔNG TIN GIẢNG VIÊN--");
        System.out.print("Nhập id: ");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.print("Nhập name: ");
        String name = scanner.nextLine();
        System.out.print("Nhập ngày sinh: ");
        String dateOfBirth = scanner.nextLine();
        System.out.print("Nhập giới tính: ");
        String sex = scanner.nextLine();
        System.out.print("Nhập chuyên môn: ");
        String specialize = scanner.nextLine();
        Teacher teacher = new Teacher(id, name, dateOfBirth, sex, specialize);
        return teacher;
    }

}
