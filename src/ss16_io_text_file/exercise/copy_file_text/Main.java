package ss16_io_text_file.exercise.copy_file_text;

import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> list = null;
        try {
            list = ReadFileUtil.readFile("src/ss16_io_text_file/exercise/copy_file_text/sourcefile.txt");
            for (String string : list) {
                System.out.println(string);
            }

            WriteFileUtil.writeTest("src/ss16_io_text_file/exercise/copy_file_text/target.txt", list);
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
