package ss16_io_text_file.exercise.copy_file_text;

import ss16_io_text_file.demo.model.Student;

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
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file, false));
        bufferedWriter.write(data);
        bufferedWriter.close();
    }

    /**
     * Phương thức viết file student
     * @param path: đường dẫn của file
     * @param strings: danh sách string được viết vào
     * @throws IOException: Ném ra ngoại lệ không mong muốn
     */
    public static void writeTest(String path, List<String> strings) throws IOException {
        String data = "";
        for (String string: strings){
            data += string + "\n";
        }

        writeFile(path, data);
    }
}
