package case_study.model;

public class Room extends Furama{
    private String FreeServiceIncluded;

    public Room() {
    }

    public Room(String serviceName, double usableArea, double rentalCosts, int maximumNumberOfPeople, String rentalType, String freeServiceIncluded) {
        super(serviceName, usableArea, rentalCosts, maximumNumberOfPeople, rentalType);
        FreeServiceIncluded = freeServiceIncluded;
    }

    public String getFreeServiceIncluded() {
        return FreeServiceIncluded;
    }

    public void setFreeServiceIncluded(String freeServiceIncluded) {
        FreeServiceIncluded = freeServiceIncluded;
    }

    @Override
    public String toString() {
        return super.toString() + " Room{" +
                "FreeServiceIncluded='" + FreeServiceIncluded + '\'' +
                '}';
    }
}
