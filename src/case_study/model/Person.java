package case_study.model;

public abstract class Person {
    private int id;
    private String name;
    private String dateOfBirth;
    private String sex;
    private int IDNumber;
    private int phone;
    private String email;

    public Person() {
    }

    public Person(int id, String name, String dateOfBirth, String sex, int IDNumber, int phone, String email) {
        this.id = id;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.sex = sex;
        this.IDNumber = IDNumber;
        this.phone = phone;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    @Override
    public String toString() {
        return "Mã ID: " + id +
                ", Họ và Tên: " + name +
                ", Ngày sinh: " + dateOfBirth +
                ", Giới tính: " + sex +
                ", Số CMND: " + IDNumber +
                ", Số điện thoại: " + phone +
                ", Email: " + email;
    }
}
