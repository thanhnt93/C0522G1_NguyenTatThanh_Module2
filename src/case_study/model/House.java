package case_study.model;

public class House extends Facility {
    private String roomStandard;
    private int numberOfFloors;

    public House() {
    }

    public House(String serviceCode, String serviceName, double areaUse, double rentalCosts, int maxNumberOfPeople,
                 String rentalType, String roomStandard, int numberOfFloors) {
        super(serviceCode, serviceName, areaUse, rentalCosts, maxNumberOfPeople, rentalType);
        this.roomStandard = roomStandard;
        this.numberOfFloors = numberOfFloors;
    }

    public String getRoomStandard() {
        return roomStandard;
    }

    public void setRoomStandard(String roomStandard) {
        this.roomStandard = roomStandard;
    }

    public int getNumberOfFloors() {
        return numberOfFloors;
    }

    public void setNumberOfFloors(int numberOfFloors) {
        this.numberOfFloors = numberOfFloors;
    }

    public String getInfo() {
        return String.format("%s,%s,%s,%s,%s,%s,%s,%s", this.getServiceCode(), this.getServiceName(), this.getAreaUse(),
                this.getRentalCosts(), this.getMaxNumberOfPeople(), this.getRentalType(), this.getRoomStandard(), this.getNumberOfFloors());
    }

    @Override
    public String toString() {
        return "HOUSE: " + super.toString() +
                ", Tiêu chuẩn phòng: " + roomStandard +
                ", Số tầng: " + numberOfFloors;
    }
}
