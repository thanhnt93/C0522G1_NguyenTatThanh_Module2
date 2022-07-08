package ss6_inheritance.exercise.triangle_and_shape.model;

public class Triangle extends Shape {
    public double getArea() {
        return Math.sqrt((getSide1() + getSide2() + getSide3()) * (getSide1() + getSide2() - getSide3()) * (getSide2() + getSide3() - getSide1()) * (getSide3() + getSide1() - getSide2())) / 4;
    }

    public double getPerimeter(){
        return getSide1() + getSide2() + getSide3();
    }

    public Triangle(double side1, double side2, double side3) {
        super(side1, side2, side3);
    }

    public Triangle() {
    }
}
