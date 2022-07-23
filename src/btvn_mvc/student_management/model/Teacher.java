package btvn_mvc.student_management.model;

public class Teacher extends Person{
    private String specialize;

    public Teacher(int id, String name, String dateOfBirth, String sex, String specialize) {
        super(id, name, dateOfBirth, sex);
        this.specialize = specialize;
    }

    public Teacher() {
    }

    public String getInfo() {
        return String.format("%s,%s,%s,%s,%s\n", this.getId(), this.getName(), this.getDateOfBirth(), this.getSex(), this.getSpecialize());
    }

    public String getSpecialize() {
        return specialize;
    }

    public void setSpecialize(String specialize) {
        this.specialize = specialize;
    }

    @Override
    public String toString() {
        return super.toString() + " Teacher{" +
                "specialize='" + specialize + '\'' +
                '}';
    }
}
