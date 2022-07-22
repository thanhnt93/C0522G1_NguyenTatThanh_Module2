package ss16_io_text_file.demo.service.impl;

import ss16_io_text_file.demo.model.Student;
import ss16_io_text_file.demo.service.IStudentService;
import ss16_io_text_file.demo.utils.ReadFileUtil;
import ss16_io_text_file.demo.utils.WriteFileUtil;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class StudentService implements IStudentService {
    private static final String PATH = "";
    private static Scanner sc = new Scanner(System.in);

    @Override
    public void add() throws IOException {
        List<Student> students = ReadFileUtil.readStudentFile(PATH);

        System.out.print("Nhập id: ");
        int id = Integer.parseInt(sc.nextLine());

        System.out.print("Nhập name: ");
        String name = sc.nextLine();

        System.out.print("Nhập score: ");
        int score = Integer.parseInt(sc.nextLine());

        Student s = new Student(id, name, score);
        students.add(s);

        WriteFileUtil.writeStudentFile(PATH, students);
    }

    @Override
    public List<Student> findAll() {
        return null;
    }
}
