package btvn_mvc.transportation_management.model;

public class Truck extends MeansOfTransportation{
    private String loadWeight;

    @Override
    public String toString() {
        return super.toString() + " Truck{" +
                "loadWeight='" + loadWeight + '\'' +
                '}';
    }

    public Truck() {
    }

    public Truck(String seaOfControl, String manufacturersName, int yearOfManufacture, String owner, String loadWeight) {
        super(seaOfControl, manufacturersName, yearOfManufacture, owner);
        this.loadWeight = loadWeight;
    }

    public String getLoadWeight() {
        return loadWeight;
    }

    public void setLoadWeight(String loadWeight) {
        this.loadWeight = loadWeight;
    }
}
