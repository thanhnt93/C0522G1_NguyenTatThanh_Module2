package ontap_final.controller;

import java.io.*;

public class WriteFileStudy {
    public static void main(String[] args) throws IOException {
        File file = new File("src/ss16_io_text/output.txt");

        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file));


        bufferedWriter.write("Nguyễn Tấn Huân");
        bufferedWriter.newLine();
        bufferedWriter.write("Nguyễn Tất Thành");

        bufferedWriter.close();

    }
}
