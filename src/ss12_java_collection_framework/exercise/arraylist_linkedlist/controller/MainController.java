package ss12_java_collection_framework.exercise.arraylist_linkedlist.controller;


import ss12_java_collection_framework.exercise.arraylist_linkedlist.service.IProductManager;
import ss12_java_collection_framework.exercise.arraylist_linkedlist.service.impl.ProductService;

import java.util.Scanner;

public class MainController {
    public static void menuController() {
        Scanner sc = new Scanner(System.in);
        IProductManager iProductManager = new ProductService();

        do {
            System.out.print("--CHƯƠNG TRÌNH QUẢN LÝ SẢN PHẨM –- \n" +
                    "1. Thêm sản phẩm.\n" +
                    "2. Sửa thông tin sản phẩm \n" +
                    "3. Xóa sản phẩm \n" +
                    "4. Hiển thị danh sách sản phẩm \n" +
                    "5. Tìm kiếm sản phẩm \n" +
                    "6. Sắp xếp sản phẩm \n" +
                    "7. Thoát menu \n" +
                    "Mời bạn nhập lựa chọn: ");

            int choose = Integer.parseInt(sc.nextLine());
            System.out.println("--------------------------------------------");
            switch (choose) {
                case 1: {
                    iProductManager.addProduct();
                    System.out.println("--------------------------------------------");
                    break;
                }
                case 2: {
                    System.out.print("Nhập id sản phẩm cần chỉnh sửa: ");
                    int productID = Integer.parseInt(sc.nextLine());

                    iProductManager.updateProduct(productID);
                    System.out.println("--------------------------------------------");
                    break;
                }
                case 3: {
                    iProductManager.removeProduct();
                    System.out.println("--------------------------------------------");
                    break;
                }
                case 4: {
                    iProductManager.displayAllProduct();
                    System.out.println("--------------------------------------------");
                    break;
                }
                case 5: {
                    System.out.print("Nhập sản phẩm cần tìm kiếm: ");
                    String productName = sc.nextLine();

                    iProductManager.searchProduct(productName);
                    System.out.println("--------------------------------------------");
                    break;
                }
                case 6: {
                    iProductManager.sort();
                    System.out.println("--------------------------------------------");
                    break;
                }
                case 7: {
                    System.out.print("Bạn đã thoát menu.");
                    System.exit(1);
                }
            }
        } while (true);
    }
}
