package ss7_abstract_class_interface.exercise.interface_colorable.controller;

import ss7_abstract_class_interface.exercise.interface_colorable.model.Circle;
import ss7_abstract_class_interface.exercise.interface_colorable.model.Rectangle;
import ss7_abstract_class_interface.exercise.interface_colorable.model.Shape;
import ss7_abstract_class_interface.exercise.interface_colorable.model.Square;

public class ColorableController {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(10.0);
        shapes[1] = new Rectangle(10.0,5.0);
        shapes[2] = new Square(10.0);

        for (Shape shape : shapes) {
            System.out.println(shape);
            if (shape instanceof Square) {
                ((Square) shape).howToColor();
            }
        }
    }
}
