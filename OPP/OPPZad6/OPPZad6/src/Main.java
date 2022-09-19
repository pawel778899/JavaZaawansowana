public class Main {

    public static void main(String[] args) {


        Movable movablePoint = new MovablePoint(10,10,5,2);
        System.out.println(movablePoint);
        movablePoint.moveLeft();
        movablePoint.moveDown();
        System.out.println(movablePoint);

        Movable movableCircle = new MovableCircle(2, 20, 30, 4,4);
        System.out.println(movableCircle);
        movableCircle.moveRight();
        movableCircle.moveUp();
        System.out.println(movableCircle);


        Movable movable = new Movable() {
            @Override
            public void moveUp() {

            }

            @Override
            public void moveDown() {

            }

            @Override
            public void moveLeft() {

            }

            @Override
            public void moveRight() {

            }
        };
        System.out.println(movable);
    }
}
