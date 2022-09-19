import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

    Point2D point2D = new Point2D(10,20);
        System.out.println(point2D);

        System.out.println(point2D.getX());
        System.out.println(point2D.getY());
        System.out.println(Arrays.toString(point2D.getXY()));

        point2D.setX(11);
        System.out.println(point2D);
        point2D.setY(21);
        System.out.println(point2D);
        point2D.setXY(12,22);
        System.out.println(point2D);

        Point3D point3D = new Point3D(10,20,30);
        point3D.setXYZ(11,22,33);
        System.out.println(point3D);

    }

}
