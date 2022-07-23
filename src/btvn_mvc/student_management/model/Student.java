package btvn_mvc.student_management.model;

public class Student extends Person {
    private String classed;
    private int point;


    @Override
    public String toString() {
        return super.toString() + " Student{" +
                "classed='" + classed + '\'' +
                ", point=" + point +
                '}';
    }

    public Student() {
    }

    public Student(int id, String name, String dateOfBirth, String sex, String classed, int point) {
        super(id, name, dateOfBirth, sex);
        this.classed = classed;
        this.point = point;
    }

    public String getInfo() {
        return String.format("%s,%s,%s,%s,%s,%s\n", this.getId(), this.getName(), this.getDateOfBirth(), this.getSex(), this.getClassed(), this.getPoint());
    }

    public int getPoint() {
        return point;
    }

    public void setPoint(int point) {
        this.point = point;
    }

    public String getClassed() {
        return classed;
    }

    public void setClassed(String classed) {
        this.classed = classed;
    }
}