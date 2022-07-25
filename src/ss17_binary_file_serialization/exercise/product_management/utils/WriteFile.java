package ss17_binary_file_serialization.exercise.product_management.utils;

import ss17_binary_file_serialization.exercise.product_management.model.Product;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class WriteFile {

    /**
     * Phương thức ghi file Product
     * @param path: đường dẫn của file
     * @param products: danh sách sản phẩm
     * @throws IOException: lỗi
     */
    public static void writeProductFile(String path, List<Product> products) throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream(path);
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);

        objectOutputStream.writeObject(products);

        fileOutputStream.close();
        objectOutputStream.close();

    }

    /**
     * Phương thức thêm data vào file
     */
    public static List<Product> writeDataFileProduct() {
        List<Product> products = new ArrayList<>();
        products.add(new Product(1,"Dầu gội","Clear",5000,"Không"));
        products.add(new Product(2,"Dầu gội","Clear",5000,"Không"));
        products.add(new Product(3,"Dầu gội","Clear",5000,"Không"));
        try {
            FileOutputStream fileOutputStream = new FileOutputStream("src/ss17_binary_file_serialization/exercise/product_management/data/product.txt");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);

            objectOutputStream.writeObject(products);
            objectOutputStream.close();
        }catch (IOException e){
            e.printStackTrace();
        }
        return products;
    }
}
