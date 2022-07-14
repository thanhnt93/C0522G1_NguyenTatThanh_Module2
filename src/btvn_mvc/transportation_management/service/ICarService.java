package btvn_mvc.transportation_management.service;

public interface ICarService {
    void addCar();

    void displayAllCar();

    void removeCar(String idSeaOfControl);

    void searchingForTheSeaOfControl(String idSeaOfControl);

}
