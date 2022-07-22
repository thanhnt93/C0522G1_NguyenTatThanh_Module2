package case_study.model;

public class Employee {
    private int employeeCode;
    private String name;
    private String dateOfBirth;
    private String sex;
    private int IDNumber;
    private int phone;
    private String email;
    private String level;
    private String location;
    private double salary;

    public Employee() {
    }

    public Employee(int employeeCode, String name, String dateOfBirth, String sex, int IDNumber, int phone, String email, String level, String location, double salary) {
        this.employeeCode = employeeCode;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.sex = sex;
        this.IDNumber = IDNumber;
        this.phone = phone;
        this.email = email;
        this.level = level;
        this.location = location;
        this.salary = salary;
    }

    public int getEmployeeCode() {
        return employeeCode;
    }

    public void setEmployeeCode(int employeeCode) {
        this.employeeCode = employeeCode;
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

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee {" +
                "employeeCode=" + employeeCode +
                ", name='" + name + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", sex='" + sex + '\'' +
                ", IDNumber=" + IDNumber +
                ", phone=" + phone +
                ", email='" + email + '\'' +
                ", level='" + level + '\'' +
                ", location='" + location + '\'' +
                ", salary=" + salary +
                '}';
    }
}
