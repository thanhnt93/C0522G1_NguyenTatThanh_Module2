package case_study.model;

public class Employee extends Person {
    private String level;
    private String location;
    private int salary;

    public Employee() {
    }

    public Employee(int id, String name, String dateOfBirth, String sex, int IDNumber, int phone, String email, String level, String location, int salary) {
        super(id, name, dateOfBirth, sex, IDNumber, phone, email);
        this.level = level;
        this.location = location;
        this.salary = salary;
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

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getInfo() {
        return String.format("%s,%s,%s,%s,%s,%s,%s,%s,%s,%s\n", this.getId(), this.getName(), this.getDateOfBirth(), this.getSex(), this.getIDNumber(), this.getPhone(), this.getEmail(), this.getLevel(), this.getLocation(), this.getSalary());
    }

    @Override
    public String toString() {
        return "NHÂN VIÊN: " + super.toString() +
                ", Trình độ: " + level +
                ", Vị trí: " + location +
                ", Lương: " + salary;
    }
}
