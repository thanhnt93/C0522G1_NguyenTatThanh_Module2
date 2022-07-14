package btvn_mvc.transportation_management.service.impl;

import btvn_mvc.transportation_management.model.Truck;
import btvn_mvc.transportation_management.service.ITruckService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TruckService implements ITruckService {
    private static List<Truck> truckList = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    static {

        Truck truck1 = new Truck("BKST01", "Isuzu", 2019, "Nguyễn Tất Thành", "10T");
        Truck truck2 = new Truck("BKST02", "MITSUBISHI FUSO", 2019, "Bùi Hùng", "10T");
        Truck truck3 = new Truck("BKST03", "Isuzu", 2019, "Nguyễn Minh Trí", "10T");
        Truck truck4 = new Truck("BKST04", "THACO KIA", 2019, "Bùi Chí Bảo", "10T");
        Truck truck5 = new Truck("BKST05", "Isuzu", 2019, "Nguyễn Tất Thành", "10T");

        truckList.add(truck1);
        truckList.add(truck2);
        truckList.add(truck3);
        truckList.add(truck4);
        truckList.add(truck5);
    }

    @Override
    public void addTruck() {
        Truck truck = infoTruck();
        truckList.add(truck);
        System.out.println("Thêm xe thành công!. ");
    }

    @Override
    public void displayAllTruck() {
        for (Truck truck : truckList) {
            System.out.println(truck);
        }
    }

    @Override
    public void removeTruck(String idSeaOfControl) {
        boolean isFlag = false;
        for (Truck truck : truckList) {
            if (truck.getSeaOfControl().equals(idSeaOfControl)) {
                System.out.println(" Bạn có chắc muốn xóa hay không? \n" +
                        "1. Có \n" +
                        "2. Không");
                int chooseYesNo = Integer.parseInt(scanner.nextLine());
                if (chooseYesNo == 1) {
                    truckList.remove(truck);
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
        for (Truck truck : truckList) {
            if (truck.getSeaOfControl().equals(idSeaOfControl)) {
                System.out.println(truck);
                isFlag = true;
                break;
            }
        }
        if (!isFlag) {
            System.out.println("Không tìm thấy biển số xe");
        }
    }

    private static Truck infoTruck() {
        System.out.println("--NHẬP THÔNG TIN XE TẢI--");
        System.out.print("Nhập biển kiểm soát: ");
        String seaOfControl = scanner.nextLine();

        System.out.print("Nhập tên hãng sản xuất: ");
        String manufacturersName = scanner.nextLine();

        System.out.print("Nhập năm sản xuất: ");
        int yearOfManufacture = Integer.parseInt(scanner.nextLine());

        System.out.print("Nhập chủ sở hữu: ");
        String owner = scanner.nextLine();

        System.out.print("Nhập trọng tải: ");
        String loadWeight = scanner.nextLine();

        Truck truck = new Truck(seaOfControl, manufacturersName, yearOfManufacture, owner, loadWeight);
        return truck;
    }
}
