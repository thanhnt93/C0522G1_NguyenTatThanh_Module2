package ss17_binary_file_serialization.exercise.product_management.controller;

import ss17_binary_file_serialization.exercise.product_management.service.IProductService;
import ss17_binary_file_serialization.exercise.product_management.service.impl.ProductService;

import java.util.Scanner;

public class MainController {
    private static Scanner sc = new Scanner(System.in);
    private static IProductService iProductService = new ProductService();

    public static void menuController() {
        do {
            System.out.print("--CHƯƠNG TRÌNH QUẢN LÝ SẢN PHẨM –- \n" +
                    "1. Thêm sản phẩm\n" +
                    "2.Hiển thị sản phẩm\n" +
                    "3.Tìm kiếm sản phẩm\n" +
                    "Mời bạn nhập lựa chọn: ");

            int choose = Integer.parseInt(sc.nextLine());
            System.out.println("--------------------------------------------");
            switch (choose) {
                case 1:
                    iProductService.add();
                    break;
                case 2:
                    iProductService.displayAll();
                    break;
                case 3:
                    iProductService.search();
                    break;
                case 4:
                    System.exit(1);

            }
        } while (true);
    }
}
