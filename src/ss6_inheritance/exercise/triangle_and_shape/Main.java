package ss6_inheritance.exercise.triangle_and_shape;

public class Main {
    public static void main(String[] args) {
        Triangle triangle = new Triangle(5, 6, 7);
        System.out.println(triangle);

        System.out.println("Chu vi tam giác: " + triangle.getPerimeter());
        System.out.printf("Diện tích hình tam giác: %.2f", triangle.getArea());

    }
}
