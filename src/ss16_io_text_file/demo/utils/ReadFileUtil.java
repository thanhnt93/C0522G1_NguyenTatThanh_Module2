package ss16_io_text_file.demo.utils;

import ss16_io_text_file.demo.model.Student;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadFileUtil {

    /**
     * Phương thức đọc file
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

        bufferedReader.readLine(); //Nếu có tiêu đề =>> Line này loại bỏ tiêu đề
        while ((line = bufferedReader.readLine()) != null){
            strings.add(line);
        }
        bufferedReader.close();

        return strings;
    }

    /**
     * Phương thức đọc file Student
     * @param path: đường dẫn chưa file
     * @return Danh sách student
     * @throws IOException: Nếu file không tồn tại
     */
    public static List<Student> readStudentFile(String path) throws IOException {
        List<String> strings = readFile(path);
        List<Student> students = new ArrayList<>();

        String[] info;
        for(String line : strings){
            info = line.split(",");
            students.add(new Student(Integer.parseInt(info[0]), info[1], Double.parseDouble(info[2])));
        }

        return students;
    }
}
