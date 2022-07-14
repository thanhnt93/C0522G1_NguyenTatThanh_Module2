package btvn_mvc.transportation_management.service;

public interface ITruckService {
    void addTruck();

    void displayAllTruck();

    void removeTruck(String idSeaOfControl);

    void searchingForTheSeaOfControl(String idSeaOfControl);
}
