package ontap_final.controller;

import java.io.*;

public class ReadFileStudy {
    public static void main(String[] args) throws IOException {
        File file = new File("src/ss16_io_text/input.txt");

        FileReader fileReader = new FileReader(file);

        BufferedReader bufferedReader = new BufferedReader(fileReader);

//        System.out.println(bufferedReader.readLine());
//        System.out.println(bufferedReader.readLine());
//        System.out.println(bufferedReader.readLine());

//        String line;
//        while (true) {
//            line = bufferedReader.readLine();
//
//            if (line == null) {
//                break;
//            }
//            System.out.println(line);
//        }

//        String line;
//        while ((line = bufferedReader.readLine()) != null) {
//            System.out.println(line);
//        }
        bufferedReader.close();
    }
}
