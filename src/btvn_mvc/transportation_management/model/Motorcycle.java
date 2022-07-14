package btvn_mvc.transportation_management.model;

public class Motorcycle extends MeansOfTransportation{
    private String wattage;

    @Override
    public String toString() {
        return super.toString() + " Motorcycle{" +
                "wattage='" + wattage + '\'' +
                '}';
    }

    public Motorcycle() {
    }

    public Motorcycle(String seaOfControl, String manufacturersName, int yearOfManufacture, String owner, String wattage) {
        super(seaOfControl, manufacturersName, yearOfManufacture, owner);
        this.wattage = wattage;
    }

    public String getWattage() {
        return wattage;
    }

    public void setWattage(String wattage) {
        this.wattage = wattage;
    }
}
