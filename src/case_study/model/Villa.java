package case_study.model;

public class Villa extends Facility{
    private String roomStandard;
    private double areaPool;
    private int numberOfFloors;

    public Villa() {
    }

    public Villa(String serviceCode, String serviceName, double areaUse, double rentalCosts, int maxNumberOfPeople, String rentalType, String roomStandard, double areaPool, int numberOfFloors) {
        super(serviceCode, serviceName, areaUse, rentalCosts, maxNumberOfPeople, rentalType);
        this.roomStandard = roomStandard;
        this.areaPool = areaPool;
        this.numberOfFloors = numberOfFloors;
    }

    public String getRoomStandard() {
        return roomStandard;
    }

    public void setRoomStandard(String roomStandard) {
        this.roomStandard = roomStandard;
    }

    public double getAreaPool() {
        return areaPool;
    }

    public void setAreaPool(double areaPool) {
        this.areaPool = areaPool;
    }

    public int getNumberOfFloors() {
        return numberOfFloors;
    }

    public void setNumberOfFloors(int numberOfFloors) {
        this.numberOfFloors = numberOfFloors;
    }

    public String getInfo() {
        return String.format("%s,%s,%s,%s,%s,%s,%s,%s,%s", this.getServiceCode(), this.getServiceName(), this.getAreaUse(), this.getRentalCosts(), this.getMaxNumberOfPeople(), this.getRentalType(), this.getRoomStandard(), this.getAreaPool(), this.getNumberOfFloors());
    }

    @Override
    public String toString() {
        return "VILAA: " + super.toString() +
                ", Tiêu chuẩn phòng: " + roomStandard +
                ", Diện tích hồ bơi: " + areaPool +
                ", Số tầng: " + numberOfFloors;
    }
}
