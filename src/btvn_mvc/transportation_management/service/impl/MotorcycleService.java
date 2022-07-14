package btvn_mvc.transportation_management.service.impl;

import btvn_mvc.transportation_management.model.Motorcycle;
import btvn_mvc.transportation_management.model.Truck;
import btvn_mvc.transportation_management.service.IMotorcycleService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MotorcycleService implements IMotorcycleService {
    private static List<Motorcycle> motorcycleList = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    static {
        Motorcycle motorcycle1 = new Motorcycle("BKSM01", "Yamaha", 2020, "Nguyễn Tất Thành", "10kW");
        Motorcycle motorcycle2 = new Motorcycle("BKSM02", "Honda", 2020, "Bùi Hùng", "10kW");
        Motorcycle motorcycle3 = new Motorcycle("BKSM03", "Sirius", 2020, "Nguyễn Minh Trí", "10kW");
        Motorcycle motorcycle4 = new Motorcycle("BKSM04", "Yamaha", 2020, "Bùi Chí Bảo", "10kW");
        Motorcycle motorcycle5 = new Motorcycle("BKSM05", "Toyota", 2020, "Nguyễn Tất Thành", "10kW");

        motorcycleList.add(motorcycle1);
        motorcycleList.add(motorcycle2);
        motorcycleList.add(motorcycle3);
        motorcycleList.add(motorcycle4);
        motorcycleList.add(motorcycle5);
    }

    @Override
    public void addMotorcycle() {
        Motorcycle motorcycle = infoMotorcycle();
        motorcycleList.add(motorcycle);
        System.out.println("Thêm xe thành công!. ");
    }

    @Override
    public void displayAllMotorcycle() {
        for (Motorcycle motorcycle : motorcycleList) {
            System.out.println(motorcycle);
        }
    }

    @Override
    public void removeMotorcycle(String idSeaOfControl) {
        boolean isFlag = false;
        for (Motorcycle motorcycle : motorcycleList) {
            if (motorcycle.getSeaOfControl().equals(idSeaOfControl)) {
                System.out.println(" Bạn có chắc muốn xóa hay không? \n" +
                        "1. Có \n" +
                        "2. Không");
                int chooseYesNo = Integer.parseInt(scanner.nextLine());
                if (chooseYesNo == 1) {
                    motorcycleList.remove(motorcycle);
                    System.out.println("Xóa thành công!.");
                }
                isFlag = true;
                break;
            }
        }
        if (!isFlag) {
            System.out.println("Không tìm thấy biển số xe");
        }
    }

    @Override
    public void searchingForTheSeaOfControl(String idSeaOfControl) {
        boolean isFlag = false;
        for (Motorcycle motorcycle : motorcycleList) {
            if (motorcycle.getSeaOfControl().equals(idSeaOfControl)) {
                System.out.println(motorcycle);
                isFlag = true;
                break;
            }
        }
        if (!isFlag) {
            System.out.println("Không tìm thấy biển số xe");
        }
    }


    public static Motorcycle infoMotorcycle() {
        System.out.println("--NHẬP THÔNG TIN XE MÁY--");
        System.out.print("Nhập biển kiểm soát: ");
        String seaOfControl = scanner.nextLine();

        System.out.print("Nhập tên hãng sản xuất: ");
        String manufacturersName = scanner.nextLine();

        System.out.print("Nhập năm sản xuất: ");
        int yearOfManufacture = Integer.parseInt(scanner.nextLine());

        System.out.print("Nhập chủ sở hữu: ");
        String owner = scanner.nextLine();

        System.out.print("Nhập công suất: ");
        String wattage = scanner.nextLine();

        Motorcycle motorcycle = new Motorcycle(seaOfControl, manufacturersName, yearOfManufacture, owner, wattage);
        return motorcycle;
    }
}
