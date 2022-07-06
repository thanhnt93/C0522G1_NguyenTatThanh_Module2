package ss6_inheritance.exercise.circle_and_cylinder;

public class Cylinder extends Circle {
    private double height;

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double volume() {
        return Math.PI * Math.pow(getRadius(), 2) * getHeight();
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                "height=" + height +
                '}';
    }
}
