package Movable;

import lombok.Data;

@Data
public class Main {
    public static void main(String[] args) {
        MovablePoint movablePoint = new MovablePoint(10, 10, 3, 3);
        System.out.println(movablePoint);
        movablePoint.moveRight();
        movablePoint.moveUp();
        System.out.println(movablePoint);
        Movable movableCircle = new MovablePoint(20, 30, 4, 4);
        System.out.println(movableCircle);
        movableCircle.moveRight();
        movableCircle.moveUp();
        System.out.println(movableCircle);
        Movable movableCircle2 = new MovableCircle(5,4,1,2,5);
        movableCircle2.moveDown();
        movableCircle2.moveLeft();
        System.out.println(movableCircle2);

    }
}