package btvn_mvc.transportation_management.service.impl;


import btvn_mvc.transportation_management.model.Car;
import btvn_mvc.transportation_management.model.Truck;
import btvn_mvc.transportation_management.service.ICarService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CarService implements ICarService {
    private static List<Car> carList = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    static {
        Car car1 = new Car("BKSC01", "Mercedes", 2020, "Nguyễn Tất Thành", 4, "Du lịch");
        Car car2 = new Car("BKSC02", "Lexus", 2020, "Nguyễn Tấn Huân", 6, "Du lịch");
        Car car3 = new Car("BKSC03", "Mercedes", 2020, "Bùi Hùng", 4, "Du lịch");
        Car car4 = new Car("BKSC04", "Porsche", 2020, "Bùi Chí Bảo", 10, "Du lịch");
        Car car5 = new Car("BKSC05", "Mercedes", 2020, "Nguyễn Minh Trí", 4, "Du lịch");

        carList.add(car1);
        carList.add(car2);
        carList.add(car3);
        carList.add(car4);
        carList.add(car5);
    }

    @Override
    public void addCar() {
        Car car = infoCar();
        carList.add(car);
        System.out.println("Thêm xe thành công!. ");
    }

    @Override
    public void displayAllCar() {
        for (Car car : carList) {
            System.out.println(car);
        }
    }

    @Override
    public void removeCar(String idSeaOfControl) {
        boolean isFlag = false;
        for (Car car : carList) {
            if (car.getSeaOfControl().equals(idSeaOfControl)) {
                System.out.println(" Bạn có chắc muốn xóa hay không? \n" +
                        "1. Có \n" +
                        "2. Không");
                int chooseYesNo = Integer.parseInt(scanner.nextLine());
                if (chooseYesNo == 1) {
                    carList.remove(car);
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
        for (Car car : carList) {
            if (car.getSeaOfControl().equals(idSeaOfControl)) {
                System.out.println(car);
                isFlag = true;
                break;
            }
        }
        if (!isFlag) {
            System.out.println("Không tìm thấy biển số xe");
        }
    }

    public static Car infoCar() {
        System.out.println("--NHẬP THÔNG TIN XE Ô TÔ--");
        System.out.print("Nhập biển kiểm soát: ");
        String seaOfControl = scanner.nextLine();

        System.out.print("Nhập tên hãng sản xuất: ");
        String manufacturersName = scanner.nextLine();

        System.out.print("Nhập năm sản xuất: ");
        int yearOfManufacture = Integer.parseInt(scanner.nextLine());

        System.out.print("Nhập chủ sở hữu: ");
        String owner = scanner.nextLine();

        System.out.print("Nhập số chỗ ngồi: ");
        int numberOfSeats = Integer.parseInt(scanner.nextLine());

        System.out.print("Nhập kiểu xe: ");
        String vehicleType = scanner.nextLine();
        Car car = new Car(seaOfControl, manufacturersName, yearOfManufacture, owner, numberOfSeats, vehicleType);
        return car;
    }
}
