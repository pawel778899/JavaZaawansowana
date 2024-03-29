public class MovablePoint implements Movable{

    private int x, y;
    private int xSpeed, ySpeed;

    public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    @Override
    public void moveUp() {
        y=y+ySpeed;
    }

    @Override
    public void moveDown() {
        y=y-ySpeed;
    }

    @Override
    public void moveLeft() {
    x=x-xSpeed;
    }

    @Override
    public void moveRight() {
    x=x+xSpeed;
    }

    @Override
    public String toString() {
        return "MovablePoint{" +
                "x=" + x +
                ", y=" + y +
                ", xSpeed=" + xSpeed +
                ", ySpeed=" + ySpeed +
                '}';
    }
}
