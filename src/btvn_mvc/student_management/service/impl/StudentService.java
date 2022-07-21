package btvn_mvc.student_management.service.impl;

import btvn_mvc.student_management.exception.DuplicateIDException;
import btvn_mvc.student_management.model.Student;
import btvn_mvc.student_management.service.IStudentService;


import java.util.ArrayList;
import java.util.Collections;
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

    /**
     * Phương thức thêm học sinh vào studentList
     */
    public void addStudent() {
        Student student = infoStudent();
        studentList.add(student);
        System.out.println("Thêm mới thành công!. ");
    }

    /**
     * Phương thức hiển thị tất cả thông tin của học sinh
     */
    @Override
    public void displayAllStudent() {
        for (Student student : studentList) {
            System.out.println(student);
        }
//        for(int i =0; i< studentList.size(); i++) {
//            System.out.println(studentList.get(i));
//        }
    }

    /**
     * Phương thức xóa học sinh theo id học sinh
     */
    @Override
    public void removeStudent() {
        System.out.println("Mời bạn nhập ID cần xóa");
        int idRemove = 0;
        while (true) {
            try {
                idRemove = Integer.parseInt(scanner.nextLine());
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
                return;
            } catch (NumberFormatException e) {
                System.out.println("Bạn có chắc mình nhập đúng ID");
            }
        }
    }

    /**
     * Phương thức tìm kiếm thông tin học sinh thông qua id học sinh
     */
    @Override
    public void searchStudentsByIdAndName() {
        System.out.print("Bạn muốn tìm kiếm theo tên hay id! \n" +
                "1. Tìm kiếm theo id. \n" +
                "2. Tìm kiếm theo tên. \n" +
                "Lựa chọn của bạn: ");
        int choose = Integer.parseInt(scanner.nextLine());

        if (choose == 1) {
            System.out.print("Mời bạn nhập id sinh viên cần tìm: ");
            int searchId = Integer.parseInt(scanner.nextLine());

            for (Student student : studentList) {
                if (searchId == student.getId()) {
                    System.out.println(student);
                }
            }

        } else {
            System.out.print("Mời bạn nhập tên sinh viên cần tìm: ");
            String searchName = scanner.nextLine();

            for (Student student : studentList) {
                if (student.getName().toLowerCase().contains(searchName.toLowerCase())) {
                    System.out.println(student);
                }
            }
        }
    }

    @Override
    public void sortByName() {
        boolean isSwap = true;
        for (int i = 0; i < studentList.size() && isSwap; i++) {
            isSwap = false;
            for (int j = 0; j < studentList.size() - 1 - i; j++) {

                if (studentList.get(j).getName().compareTo(studentList.get(j + 1).getName()) > 0) {
                    Collections.swap(studentList, j, j + 1);
                    isSwap = true;
                }

                if (studentList.get(j).getName().compareTo(studentList.get(j + 1).getName()) == 0) {
                    if (studentList.get(j).getId() > studentList.get(j + 1).getId()) {
                        Collections.swap(studentList, j, j + 1);
                    }
                }
            }
        }
    }

    /**
     * Phương thức nhập thông tin học sinh
     *
     * @return trả về thông tin học sinh
     */
    public static Student infoStudent() {
        System.out.println("--NHẬP THÔNG TIN HỌC SINH--");
        System.out.print("Nhập id: ");
        int id = 0;
        while (true) {
            try {
                id = Integer.parseInt(scanner.nextLine());
                System.out.println("ID : " + id);
                for (Student student:studentList){
                    if (student.getId()==id){
                        throw new DuplicateIDException("ID đã có,vui lòng nhập lại");
                    }
                }
                break;
            } catch (NumberFormatException e ) {
                System.out.println("Bạn có chắc mình nhập đúng,hãy nhập lại");
            }
            catch (DuplicateIDException e){
                System.out.println(e.getMessage());
            }
        }

        System.out.print("Nhập name: ");
        String name = scanner.nextLine();
        System.out.print("Nhập ngày sinh: ");
        String dateOfBirth = scanner.nextLine();
        System.out.print("Nhập giới tính: ");
        String sex = scanner.nextLine();
        System.out.print("Nhập Lớp: ");
        String classed = scanner.nextLine();
        System.out.print("Nhập điểm: ");
        int point = 0;
        while (true) {
            try {
                point = Integer.parseInt(scanner.nextLine());
                System.out.println("Điểm: " + point);
                break;
            } catch (NumberFormatException e) {
                System.out.println("Bạn có chắc mình nhập đúng,hãy nhập lại");
            }
        }

        return new Student(id, name, dateOfBirth, sex, classed, point);
    }

}