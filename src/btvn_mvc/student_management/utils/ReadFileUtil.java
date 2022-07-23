package btvn_mvc.student_management.utils;

import btvn_mvc.student_management.model.Student;
import btvn_mvc.student_management.model.Teacher;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadFileUtil {

    /**
     * Phương thức đọc file
     *
     * @param path: đường dẫn file cần đọc
     * @return Danh sách các dòng đọc trong file
     * @throws IOException: Nếu file không tồn tại thì sẽ ném lỗi này
     */
    private static List<String> readFile(String path) throws IOException {
        File file = new File(path);

        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String line;
        List<String> strings = new ArrayList<>();

//        bufferedReader.readLine(); //Nếu có tiêu đề =>> Line này loại bỏ tiêu đề
        while ((line = bufferedReader.readLine()) != null) {
            strings.add(line);
        }
        bufferedReader.close();

        return strings;
    }

    /**
     * Phương thức đọc file Student
     *
     * @param path: đường dẫn chưa file
     * @return Danh sách student
     * @throws IOException: Nếu file không tồn tại
     */
    public static List<Student> readStudentFile(String path) throws IOException {
        List<String> strings = readFile(path);
        List<Student> students = new ArrayList<>();

        String[] info;
        for (String line : strings) {
            info = line.split(",");
            students.add(new Student(Integer.parseInt(info[0]), info[1], info[2], info[3], info[4], Integer.parseInt(info[5])));
        }

        return students;
    }

    /**
     * Phương thức đọc file Teacher
     * @param path: đường dẫn chứa file
     * @return Danh sách Teacher
     * @throws IOException: Nếu file không tồn tại
     */
    public static List<Teacher> readTeacherFile(String path) throws IOException {
        List<String> strings = readFile(path);
        List<Teacher> teachers = new ArrayList<>();

        String[] info;
        for (String line : strings) {
            info = line.split(",");
            teachers.add(new Teacher(Integer.parseInt(info[0]), info[1], info[2], info[3], info[4]));
        }

        return teachers;
    }
}
