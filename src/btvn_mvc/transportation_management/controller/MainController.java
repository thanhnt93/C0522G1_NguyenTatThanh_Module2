package btvn_mvc.transportation_management.controller;

import btvn_mvc.transportation_management.service.ICarService;
import btvn_mvc.transportation_management.service.IMotorcycleService;
import btvn_mvc.transportation_management.service.ITruckService;
import btvn_mvc.transportation_management.service.impl.CarService;
import btvn_mvc.transportation_management.service.impl.MotorcycleService;
import btvn_mvc.transportation_management.service.impl.TruckService;

import java.util.Scanner;

public class MainController {
    private static Scanner sc = new Scanner(System.in);

    private static ICarService iCarService = new CarService();
    private static ITruckService iTruckService = new TruckService();
    private static IMotorcycleService iMotorcycleService = new MotorcycleService();

    public static void menuController() {

        AddCarController addCarController = new AddCarController();
        DisplayCarController displayCarController = new DisplayCarController();

        do {
            System.out.print("--CHƯƠNG TRÌNH QUẢN LÝ PHƯƠNG TIỆN GIAO THÔNG –- \n" +
                    "1. Thêm mới phương tiện\n" +
                    "2. Hiển thị phương tiện \n" +
                    "3. Xóa phương tiện \n" +
                    "4. Tìm kiếm theo biển kiểm soát \n" +
                    "5. Thoát chương tình ! \n" +
                    "Mời bạn nhập lựa chọn: ");

            int choose = Integer.parseInt(sc.nextLine());
            System.out.println("--------------------------------------------");
            switch (choose) {
                case 1: {
                    addCarController.menuAddCar();
                    break;
                }
                case 2: {
                    displayCarController.menuDisplayCar();
                    break;
                }
                case 3: {
                    checkLicensePlate();
                    break;
                }
                case 4: {
                    searchingForTheSeaOfControl();
                    break;
                }
                case 5: {
                    System.exit(1);
                }
            }
        } while (true);
    }


    private static void checkLicensePlate() {
        do {
            System.out.print("Nhập biển số xe cần xóa: ");
            String seaOfControl = sc.nextLine();

            char index = seaOfControl.charAt(3);

            switch (index) {
                case 'C':
                    iCarService.removeCar(seaOfControl);
                    return;
                case 'T':
                    iTruckService.removeTruck(seaOfControl);
                    return;
                case 'M':
                    iMotorcycleService.removeMotorcycle(seaOfControl);
                    return;
                default:
                    System.out.println("Định dạng biển số xe sai, mời nhập lại!!! ");
            }
        } while (true);
    }

    private static void searchingForTheSeaOfControl() {
        do {
            System.out.print("Nhập biển số xe cần tìm kiếm: ");
            String seaOfControl = sc.nextLine();

            char index = seaOfControl.charAt(3);
            switch (index) {
                case 'C':
                    iCarService.searchingForTheSeaOfControl(seaOfControl);
                    return;
                case 'T':
                    iTruckService.searchingForTheSeaOfControl(seaOfControl);
                    return;
                case 'M':
                    iMotorcycleService.searchingForTheSeaOfControl(seaOfControl);
                    return;
                default:
                    System.out.println("Biển số xe sai, mời nhập lại!!! ");
            }
        } while (true);
    }
}
