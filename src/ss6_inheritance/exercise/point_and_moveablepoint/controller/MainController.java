package ss6_inheritance.exercise.point_and_moveablepoint.controller;

import ss6_inheritance.exercise.point_and_moveablepoint.model.MoveablePoint;

public class MainController {
    public static void main(String[] args) {
        MoveablePoint moveablePoint = new MoveablePoint(1.0f, 2.0f, 5.0f,10.0f);
        System.out.println(moveablePoint);

        MoveablePoint move = moveablePoint.move();
        System.out.print(move);
    }
}
