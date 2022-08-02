package ontap_final.utils;

import ontap_final.model.Student;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;
import java.util.Set;

public class WriteFileUtil {
    private static void writeFile(String path, String data) throws IOException {
        File file = new File(path);
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file));
        bufferedWriter.write(data);
        bufferedWriter.close();
    }


    public static void writeStudentFile(String path, Map<Student, Integer> students) throws IOException {
        String data = "";

        Set<Student> studentSet = students.keySet();

        for (Student student : studentSet) {
            data += student.getInfo() + "," + students.get(student) + "\n";
        }
        writeFile(path, data.substring(0, data.length() - 1));
    }
}
