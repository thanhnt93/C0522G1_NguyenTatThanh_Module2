package btvn_mvc.transportation_management.model;

public abstract class MeansOfTransportation {
    private String seaOfControl;
    private String manufacturersName;
    private int yearOfManufacture;
    private String owner;

    @Override
    public String toString() {
        return "MeansOfTransportation{" +
                "seaOfControl='" + seaOfControl + '\'' +
                ", manufacturersName='" + manufacturersName + '\'' +
                ", yearOfManufacture=" + yearOfManufacture +
                ", owner='" + owner + '\'' +
                '}';
    }

    public MeansOfTransportation() {
    }

    public MeansOfTransportation(String seaOfControl, String manufacturersName, int yearOfManufacture, String owner) {
        this.seaOfControl = seaOfControl;
        this.manufacturersName = manufacturersName;
        this.yearOfManufacture = yearOfManufacture;
        this.owner = owner;
    }

    public String getSeaOfControl() {
        return seaOfControl;
    }

    public void setSeaOfControl(String seaOfControl) {
        this.seaOfControl = seaOfControl;
    }

    public String getManufacturersName() {
        return manufacturersName;
    }

    public void setManufacturersName(String manufacturersName) {
        this.manufacturersName = manufacturersName;
    }

    public int getYearOfManufacture() {
        return yearOfManufacture;
    }

    public void setYearOfManufacture(int yearOfManufacture) {
        this.yearOfManufacture = yearOfManufacture;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }
}
