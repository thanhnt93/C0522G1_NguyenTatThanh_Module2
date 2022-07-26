package case_study.model;

public class Customer {
    private int CustomerCode;
    private String name;
    private String dateOfBirth;
    private String sex;
    private int IDNumber;
    private int phone;
    private String email;
    private String typeOfGuest;
    private String address;

    public Customer() {
    }

    public Customer(int customerCode, String name, String dateOfBirth, String sex, int IDNumber, int phone, String email, String typeOfGuest, String address) {
        CustomerCode = customerCode;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.sex = sex;
        this.IDNumber = IDNumber;
        this.phone = phone;
        this.email = email;
        this.typeOfGuest = typeOfGuest;
        this.address = address;
    }

    public int getCustomerCode() {
        return CustomerCode;
    }

    public void setCustomerCode(int customerCode) {
        CustomerCode = customerCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getIDNumber() {
        return IDNumber;
    }

    public void setIDNumber(int IDNumber) {
        this.IDNumber = IDNumber;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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
        return String.format("%s,%s,%s,%s,%s,%s,%s,%s,%s\n",
                this.getCustomerCode(),
                this.getName(),
                this.getDateOfBirth(),
                this.getSex(),
                this.getIDNumber(),
                this.getPhone(),
                this.getEmail(),
                this.getTypeOfGuest(),
                this.getAddress());
    }

    @Override
    public String toString() {
        return "Customer{" +
                "CustomerCode=" + CustomerCode +
                ", name='" + name + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", sex='" + sex + '\'' +
                ", IDNumber=" + IDNumber +
                ", phone=" + phone +
                ", email='" + email + '\'' +
                ", typeOfGuest='" + typeOfGuest + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
