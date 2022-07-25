package ss17_binary_file_serialization.exercise.product_management.service.impl;

import btvn_mvc.student_management.exception.DuplicateIDException;

import btvn_mvc.student_management.model.Student;
import btvn_mvc.student_management.utils.ReadFileUtil;
import ss17_binary_file_serialization.exercise.product_management.model.Product;
import ss17_binary_file_serialization.exercise.product_management.service.IProductService;
import ss17_binary_file_serialization.exercise.product_management.utils.ReadFile;
import ss17_binary_file_serialization.exercise.product_management.utils.WriteFile;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductService implements IProductService {
    private static List<Product> productList = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);
    private static final String PATH = "src/ss17_binary_file_serialization/exercise/product_management/data/product.txt";

    /*static {
        productList = WriteFile.writeDataFileProduct();
    }*/
    @Override
    public void add() {


        try {
            productList = ReadFile.readFile(PATH);
            Product product = infoProduct();
            productList.add(product);

            WriteFile.writeProductFile(PATH, productList);
            System.out.println("Thêm mới thành công!. ");

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void displayAll() {
        try {
            productList = ReadFile.readFile(PATH);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        for (Product product : productList) {
            System.out.println(product);
        }
    }

    @Override
    public void search() {
        System.out.print("Bạn muốn tìm kiếm theo tên hay id! \n" +
                "1. Tìm kiếm theo id. \n" +
                "2. Tìm kiếm theo tên. \n" +
                "Lựa chọn của bạn: ");
        int choose = Integer.parseInt(scanner.nextLine());
        try {
            productList = ReadFile.readFile(PATH);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        if (choose == 1) {
            System.out.print("Mời bạn nhập id sản phẩm cần tìm: ");
            int searchId = Integer.parseInt(scanner.nextLine());

            for (Product product : productList) {
                if (searchId == product.getProductCode()) {
                    System.out.println(product);
                }
            }

        } else {
            System.out.print("Mời bạn nhập tên sản phẩm cần tìm: ");
            String searchName = scanner.nextLine();

            for (Product product : productList) {
                if (product.getProductName().toLowerCase().contains(searchName.toLowerCase())) {
                    System.out.println(product);
                }
            }
        }
    }

    public static Product infoProduct() {
        System.out.println("--NHẬP THÔNG TIN SẢN PHẨM--");
        System.out.print("Nhập mã sản phẩm: ");
        int productCode = 0;
        while (true) {
            try {
                productCode = Integer.parseInt(scanner.nextLine());
                System.out.println("ID : " + productCode);
                for (Product product : productList) {
                    if (product.getProductCode() == productCode) {
                        throw new DuplicateIDException("Mã sản phẩm đã có,vui lòng nhập lại");
                    }
                }
                break;
            } catch (NumberFormatException e) {
                System.out.println("Bạn có chắc mình nhập đúng,hãy nhập lại");
            } catch (DuplicateIDException e) {
                System.out.println(e.getMessage());
            }
        }

        System.out.print("Nhập tên sản phẩm: ");
        String productName = scanner.nextLine();

        System.out.print("Nhập hãng sản xuất: ");
        String manufacturer = scanner.nextLine();

        System.out.print("Nhập giá: ");
        int price = Integer.parseInt(scanner.nextLine());

        System.out.print("Nhập mô tả: ");
        String otherDescription = scanner.nextLine();


        return new Product(productCode, productName, manufacturer, price, otherDescription);
    }
}
