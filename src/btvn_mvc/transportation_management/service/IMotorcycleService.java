package btvn_mvc.transportation_management.service;

public interface IMotorcycleService {
    void addMotorcycle();

    void displayAllMotorcycle();

    void removeMotorcycle(String idSeaOfControl);

    void searchingForTheSeaOfControl(String idSeaOfControl);
}
