package btvn_mvc.student_management.utils;



import btvn_mvc.student_management.model.Student;
import btvn_mvc.student_management.model.Teacher;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class WriteFileUtil {

    /**
     * Phương thức viết file không ghi đè
     * @param path: đường dẫn của file
     * @param data: dữ liệu được viết vào
     * @throws IOException: Ném ra ngoại lệ không mong muốn
     */
    private static void writeFile(String path, String data) throws IOException {
        File file = new File(path);
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file, true));
        bufferedWriter.write(data);
        bufferedWriter.close();
    }

    /**
     * Phương thức viết file có ghi đè
     * @param path: đường dẫn của file
     * @param data: dữ liệu được viết vào
     * @throws IOException: Ném ra ngoại lệ không mong muốn
     */
    private static void writeFileRemove(String path, String data) throws IOException {
        File file = new File(path);
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file, false));
        bufferedWriter.write(data);
        bufferedWriter.close();
    }

    /**
     * Phương thức viết file student (không ghi đè)
     * @param path: đường dẫn của file
     * @param students: danh sách student được viết vào
     * @throws IOException: Ném ra ngoại lệ không mong muốn
     */
    public static void writeStudentFile(String path, List<Student> students) throws IOException {
        StringBuilder data = new StringBuilder();
        for (Student student: students){
            data.append(student.getInfo());
        }

        writeFile(path, data.toString());
    }

    /**
     * Phương thức viết file Student (Dùng để update ghi đè lên)
     * @param path: đường dẫn của file
     * @param students: danh sách student được viết vào
     * @throws IOException: Ném ra ngoại lệ không mong muốn
     */
    public static void writeStudentFileRemove(String path, List<Student> students) throws IOException {
        StringBuilder data = new StringBuilder();
        for (Student student: students){
            data.append(student.getInfo());
        }

        writeFileRemove(path, data.toString());
    }

    /**
     * Phương thức viết file teacher (không ghi đè)
     * @param path: đường dẫn của file
     * @param teachers: danh sách teacher được viết vào
     * @throws IOException: Ném ra ngoại lệ không mong muốn
     */
    public static void writeTeacherFile(String path, List<Teacher> teachers) throws IOException {
        StringBuilder data = new StringBuilder();
        for (Teacher teacher: teachers){
            data.append(teacher.getInfo());
        }

        writeFile(path, data.toString());
    }

    /**
     * Phương thức viết file Teacher (Dùng để update ghi đè lên)
     * @param path: đường dẫn của file
     * @param teachers: danh sách teacher được viết vào
     * @throws IOException: Ném ra ngoại lệ không mong muốn
     */
    public static void writeTeacherFileRemove(String path, List<Teacher> teachers) throws IOException {
        StringBuilder data = new StringBuilder();
        for (Teacher teacher: teachers){
            data.append(teacher.getInfo());
        }

        writeFileRemove(path, data.toString());
    }
}
