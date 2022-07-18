package ss12_java_collection_framework.exercise.arraylist_linkedlist.service.impl;

import ss12_java_collection_framework.exercise.arraylist_linkedlist.model.Product;
import ss12_java_collection_framework.exercise.arraylist_linkedlist.service.IProductManager;

import java.util.LinkedList;
import java.util.Scanner;

public class ProductService implements IProductManager {
    private static LinkedList<Product> productList = new LinkedList<>();
    private static Scanner scanner = new Scanner(System.in);

    static {
        Product product1 = new Product(1, "Bột giặt", "Nặng 0.5kg, Hãng OMO", 20000);
        Product product2 = new Product(2, "Kem đánh răng", "Hình trụ dài, Hãng Ps", 12000);
        Product product3 = new Product(3, "Nước rửa chén", "Màu vàng, Hãng sunlight", 30000);
        Product product4 = new Product(4, "Dầu gội", "Màu xanh, Hãng Clear", 2000);
        Product product5 = new Product(5, "Dầu ăn", "Hãng ông già", 50000);

        productList.add(product1);
        productList.add(product2);
        productList.add(product3);
        productList.add(product4);
        productList.add(product5);
    }

    /**
     * Phương thức thêm sản phẩm
     */
    @Override
    public void addProduct() {
        Product product = infoProduct();
        productList.add(product);
        System.out.println("Thêm mới sản phẩm thành công!. ");
    }

    /**
     * Phương thức chỉnh sửa thông tin sản phẩm dựa trên id sản phẩm
     * @param productID
     */
    @Override
    public void updateProduct(int productID) {
        boolean isFlag = false;
        for (Product product : productList) {
            if (product.getProductID() == (productID)) {
                System.out.println(product);

                System.out.print("Chỉnh sửa thông tin sản phẩm: ");
                String productInformation = scanner.nextLine();
                product.setProductInformation(productInformation);

                System.out.println("Sửa thành công !");
                System.out.println(product);
                isFlag = true;
                break;
            }
        }
        if (!isFlag) {
            System.out.println("Không tìm thấy id sản phẩm");
        }
    }

    /**
     * Phương thức xóa sản phẩm dựa trên id sản phẩm
     */
    @Override
    public void removeProduct() {
        System.out.println("Mời bạn nhập id sản phẩm cần xóa: ");
        int idRemove = Integer.parseInt(scanner.nextLine());
        boolean isFlag = false;
        for (Product product : productList) {
            if (product.getProductID() == idRemove) {
                System.out.println(" Bạn có chắc muốn xóa hay không? \n" +
                        "1. Có \n" +
                        "2. Không");
                int chooseYesNo = Integer.parseInt(scanner.nextLine());
                if (chooseYesNo == 1) {
                    productList.remove(product);
                    System.out.println("Xóa thành công!.");
                }
                isFlag = true;
                break;

            }
        }
        if (!isFlag) {
            System.out.println("Không tìm thấy sản phẩm.");
        }
    }

    /**
     * Phương thức hiển thị tất cả sản phẩm
     */
    @Override
    public void displayAllProduct() {
        for (Product product : productList) {
            System.out.println(product);
        }
    }

    /**
     * Phương thức tìm kiếm sản phẩm dựa trên tên sản phẩm
     * @param productName
     */
    @Override
    public void searchProduct(String productName) {
        boolean isFlag = false;
        for (Product product : productList) {
            if (product.getProductName().equals(productName)) {
                System.out.println(product);
                isFlag = true;
                break;
            }
        }
        if (!isFlag) {
            System.out.println("Không tìm thấy sản phẩm");
        }
    }

    /**
     * Phương thức sắp xếp thứ tự tăng dân hoặc giảm dần
     */
    @Override
    public void sort() {
        System.out.println("Bạn muốn xếp theo thứ tự \n" +
                "1. Tăng dần \n" +
                "2. Giảm dần");
        int choose = Integer.parseInt(scanner.nextLine());
        if (choose == 1) {
            ComparatorAscending comparatorAscending = new ComparatorAscending();
            productList.sort(comparatorAscending);
        } else {
            ComparatorDecrease comparatorDecrease = new ComparatorDecrease();
            productList.sort(comparatorDecrease);
        }
    }

    /**
     * Phương thức nhập tên sản phẩm
     * @return Product
     */
    public static Product infoProduct() {
        System.out.println("--NHẬP THÔNG TIN SẢN PHẨM--");
        System.out.print("Nhập id sản phẩm: ");
        int productID = Integer.parseInt(scanner.nextLine());

        System.out.print("Nhập tên sản phẩm: ");
        String productName = scanner.nextLine();

        System.out.print("Nhập thông tin sản phẩm: ");
        String productInformation = scanner.nextLine();

        System.out.print("Nhập giá sản phẩm: ");
        int price = Integer.parseInt(scanner.nextLine());

        Product product = new Product(productID, productName, productInformation, price);
        return product;
    }
}
