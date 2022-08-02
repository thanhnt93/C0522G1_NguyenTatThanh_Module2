package ontap_final.controller;

import ontap_final.model.Student;
import ontap_final.utils.ReadFileUtil;
import ontap_final.utils.WriteFileUtil;

import java.io.IOException;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class ReadFileStudent2 {
    private static final String PATH = "src/ontap_final/student.txt";

    public static void main(String[] args) throws IOException {
        add();
    }


    public static void add() throws IOException {
        // Phải đọc dữ liệu từ file

        Map<Student, Integer> students = ReadFileUtil.readStudentFile(PATH);

        //Xuất ra những thanh niên có tiền nộp phạt >= 10k
        Set<Student> studentSet = students.keySet();

        for (Student student : studentSet) {
            students.put(student, students.get(student) + 5000);
            if (students.get(student) >= 10000) {
                System.out.println(student + " - " + students.get(student));
            }
        }

//
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập vào id: ");
        int id = Integer.parseInt(scanner.nextLine());

        System.out.print("Nhập vào name: ");
        String name = scanner.nextLine();

        System.out.print("Nhập vào score: ");
        double score = Double.parseDouble(scanner.nextLine());
        Student s = new Student(id, name, score);
        students.put(s, 0);
//
//        // Phải add xuống lại file
        WriteFileUtil.writeStudentFile(PATH, students);
    }


}