package btvn_mvc.transportation_management.controller;

import btvn_mvc.transportation_management.service.IMotorcycleService;
import btvn_mvc.transportation_management.service.ITruckService;
import btvn_mvc.transportation_management.service.impl.CarService;
import btvn_mvc.transportation_management.service.ICarService;
import btvn_mvc.transportation_management.service.impl.MotorcycleService;
import btvn_mvc.transportation_management.service.impl.TruckService;

import java.util.Scanner;

public class DisplayCarController {
    private Scanner sc = new Scanner(System.in);

    ICarService iCarService = new CarService();
    ITruckService iTruckService = new TruckService();
    IMotorcycleService iMotorcycleService = new MotorcycleService();

    public void menuDisplayCar() {
        do {
            System.out.print("--HIỂN THỊ PHƯƠNG TIỆN-- \n" +
                    "1. Hiển thị xe tải \n" +
                    "2. Hiển thị ô tô \n" +
                    "3. Hiển thị xe máy \n" +
                    "4. Quay về menu chính. \n" +
                    "Mời bạn nhập lựa chọn: ");
            int choose = Integer.parseInt(sc.nextLine());
            System.out.println("--------------------------------------------");
            switch (choose) {
                case 1:
                    iTruckService.displayAllTruck();
                    System.out.println("--------------------------------------------");
                    break;
                case 2:
                    iCarService.displayAllCar();
                    System.out.println("--------------------------------------------");
                    break;
                case 3:
                    iMotorcycleService.displayAllMotorcycle();
                    System.out.println("--------------------------------------------");
                    break;
                case 4:
                    return;
            }
        } while (true);
    }
}
