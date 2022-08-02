package case_study.model;

public abstract class Furama {
    private String serviceName;
    private double usableArea;
    private double RentalCosts;
    private int maximumNumberOfPeople;
    private String rentalType;

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public double getUsableArea() {
        return usableArea;
    }

    public void setUsableArea(double usableArea) {
        this.usableArea = usableArea;
    }

    public double getRentalCosts() {
        return RentalCosts;
    }

    public void setRentalCosts(double rentalCosts) {
        RentalCosts = rentalCosts;
    }

    public int getMaximumNumberOfPeople() {
        return maximumNumberOfPeople;
    }

    public void setMaximumNumberOfPeople(int maximumNumberOfPeople) {
        this.maximumNumberOfPeople = maximumNumberOfPeople;
    }

    public String getRentalType() {
        return rentalType;
    }

    public void setRentalType(String rentalType) {
        this.rentalType = rentalType;
    }

    public Furama() {
    }

    public Furama(String serviceName, double usableArea, double rentalCosts, int maximumNumberOfPeople, String rentalType) {
        this.serviceName = serviceName;
        this.usableArea = usableArea;
        RentalCosts = rentalCosts;
        this.maximumNumberOfPeople = maximumNumberOfPeople;
        this.rentalType = rentalType;
    }

    @Override
    public String toString() {
        return "FURAMA: " +
                "Tên dịch vụ: " + serviceName +
                ", Diện tích sử dụng: " + usableArea +
                ", Chi phí thuê: " + RentalCosts +
                ", Số lượng người tối đa: " + maximumNumberOfPeople +
                ", Kiểu thuê: " + rentalType;
    }
}
