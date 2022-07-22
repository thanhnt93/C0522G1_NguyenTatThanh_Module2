package ss16_io_text_file.exercise.copy_file_text;

import ss16_io_text_file.demo.model.Student;

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
    public static List<String> readFile(String path) throws IOException {
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
}
