package ss4_class_and_object_in_java.exercise.class_quadratic_equation;

public class QuadraticEquation {
    private double a, b, c;

    public QuadraticEquation() {
    }

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    private double getA() {
        return a;
    }

    private double getB() {
        return b;
    }

    private double getC() {
        return c;
    }

    public double getDiscriminant() {
        return getB() * 2 - 4 * getA() * getC();
    }

    public double getRoot1() {
        if (getDiscriminant() >= 0) {
            return (-getB() - Math.sqrt(Math.pow(getB(), 2) - 4 * getA() * getC())) / (2 * getA());
        } else {
            return 0;
        }
    }

    public double getRoot2() {
        if (getDiscriminant() >= 0) {
            return (-getB() + Math.sqrt(Math.pow(getB(), 2) - 4 * getA() * getC())) / (2 * getA());
        } else {
            return 0;
        }
    }

}
