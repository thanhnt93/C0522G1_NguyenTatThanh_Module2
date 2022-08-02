package case_study.model;

public class Customer extends Person {
    private String typeOfGuest;
    private String address;

    public Customer() {
    }

    public Customer(int id, String name, String dateOfBirth, String sex, int IDNumber, int phone, String email, String typeOfGuest, String address) {
        super(id, name, dateOfBirth, sex, IDNumber, phone, email);
        this.typeOfGuest = typeOfGuest;
        this.address = address;
    }

    public String getTypeOfGuest() {
        return typeOfGuest;
    }

    public void setTypeOfGuest(String typeOfGuest) {
        this.typeOfGuest = typeOfGuest;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getInfo() {
        return String.format("%s,%s,%s,%s,%s,%s,%s,%s,%s\n", this.getId(), this.getName(), this.getDateOfBirth(), this.getSex(), this.getIDNumber(), this.getPhone(), this.getEmail(), this.getTypeOfGuest(), this.getAddress());
    }

    @Override
    public String toString() {
        return "KHÁCH HÀNG: " + super.toString() +
                ", Loại khách: " + typeOfGuest +
                ", Địa chỉ: " + address;
    }
}
