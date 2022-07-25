package ss17_binary_file_serialization.exercise.coppy_binary_file;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        writeFile();

        List<String> readFile = readFile();
        System.out.println(readFile);

        coppyFile(readFile);
    }

    /**
     * Phương thức coppy file từ soucre sang target
     * @param fileCoppy: file cần sao chép
     * @throws IOException: lỗi ngoại lệ
     */
    public static void coppyFile(List<String> fileCoppy) throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream("src/ss17_binary_file_serialization/exercise/coppy_binary_file/target_file.txt");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);

        objectOutputStream.writeObject(fileCoppy);
        objectOutputStream.close();
    }

    /**
     * Phương thức đọc file
     * @return Danh sách data trong file
     * @throws IOException: Lỗi
     * @throws ClassNotFoundException: Lỗi
     */
    public static List<String> readFile() throws IOException, ClassNotFoundException {
        FileInputStream fileInputStream = new FileInputStream("src/ss17_binary_file_serialization/exercise/coppy_binary_file/source_file.txt");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

        List<String> list = (List<String>) objectInputStream.readObject();

        objectInputStream.close();
        return list;
    }

    /**
     * Phương thức viết file
     */
    private static void writeFile() {
            List<String> strings = new ArrayList<>();
            strings.add("1,Nguyễn Tất Thành,01-01-2000,Nam,C0522G1,7");
            strings.add("2,Nguyễn Tấn Huân,01-01-2000,Nữ,C0522G1,9");
            strings.add("3,Bùi Chí Bảo,01-01-2000,Nam,C0522G1,7");
            strings.add("4,Nguyễn Minh Tiến,01-01-2000,Nữ,C0522G1,6");
            strings.add("5,Đặng Thị Thủy Tiên,01-01-2000,Nữ,C0522G1,4");

            try {
                FileOutputStream fileOutputStream = new FileOutputStream("src/ss17_binary_file_serialization/exercise/coppy_binary_file/source_file.txt");
                ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);

                objectOutputStream.writeObject(strings);
                objectOutputStream.close();
            }catch (IOException e){
                e.printStackTrace();
            }
        }
}
