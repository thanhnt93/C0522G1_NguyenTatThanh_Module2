package btvn_mvc.student_management.utils;



import btvn_mvc.student_management.model.Student;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class WriteFileUtil {

    /**
     * Phương thức viết file
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
     * Phương thức viết file student
     * @param path: đường dẫn của file
     * @param students: danh sách student được viết vào
     * @throws IOException: Ném ra ngoại lệ không mong muốn
     */
    public static void writeStudentFile(String path, List<Student> students) throws IOException {
        String data = "";
        for (Student student: students){
            data += student.getInfo();
        }

        writeFile(path, data);
    }
}
