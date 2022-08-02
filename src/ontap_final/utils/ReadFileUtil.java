package ontap_final.utils;

import ontap_final.model.Student;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class ReadFileUtil {
    private static List<String> readFile(String path) throws IOException {
        File file = new File(path);
        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String line;
        List<String> strings = new ArrayList<>();
//        bufferedReader.readLine();//Loại bỏ tiêu đề
        while ((line = bufferedReader.readLine()) != null) {
            strings.add(line);
        }
        bufferedReader.close();

        return strings;
    }

    public static Map<Student, Integer> readStudentFile(String path) throws IOException {
        List<String> strings = readFile(path);
        Map<Student, Integer> students = new LinkedHashMap<>();
        String[] info;
        for (String line : strings) {
            info = line.split(",");
            Student student = new Student(Integer.parseInt(info[0]), info[1], Double.parseDouble(info[2]));
            students.put(student, Integer.parseInt(info[3]));
        }

        return students;
    }
}
