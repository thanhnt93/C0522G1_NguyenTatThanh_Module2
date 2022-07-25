package ss17_binary_file_serialization.exercise.product_management.utils;

import ss17_binary_file_serialization.exercise.product_management.model.Product;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadFile {

    /**
     * Phương thức đọc file
     * @param path: đường dẫn của file
     * @return danh sách file
     * @throws IOException: lỗi
     * @throws ClassNotFoundException: lỗi
     */
    public static List<Product> readFile(String path) throws IOException, ClassNotFoundException {
        FileInputStream fileInputStream = new FileInputStream(path);
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

        List<Product> list = (List<Product>) objectInputStream.readObject();

        objectInputStream.close();
        return list;
    }

}
