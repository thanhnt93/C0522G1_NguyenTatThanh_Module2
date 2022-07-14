package btvn_mvc.transportation_management.model;

public class Car extends MeansOfTransportation{
    private int numberOfSeats;
    private String vehicleType;

    @Override
    public String toString() {
        return super.toString() + " Car{" +
                "numberOfSeats=" + numberOfSeats +
                ", vehicleType='" + vehicleType + '\'' +
                '}';
    }

    public Car() {
    }

    public Car(String seaOfControl, String manufacturersName, int yearOfManufacture, String owner, int numberOfSeats, String vehicleType) {
        super(seaOfControl, manufacturersName, yearOfManufacture, owner);
        this.numberOfSeats = numberOfSeats;
        this.vehicleType = vehicleType;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }
}
