package Point;

public class Main {
    public static void main(String[] args) {

        Point2D point2D = new Point2D(10, 20);
        System.out.println(point2D);
        point2D.setXY(43, 65);
        System.out.println(point2D);
        Point3D point3D = new Point3D(10, 20, 30);
        System.out.println(point3D);
        point3D.setXYZ(43, 64, 2);
        System.out.println(point3D);



        Point2D point2D_1 = new Point2D(1, 2);
        Point2D point2D_2 = new Point2D(5, 8);
        Point2D point2D_3 = new Point2D(5, 11);
        Point2D point2D_4 = new Point2D(10, 15);


        Point2D[] pointsArray = new Point2D[4];
        pointsArray[0] = point2D_1;
        pointsArray[1] = point2D_2;
        pointsArray[2] = point2D_3;
        pointsArray[3] = point2D_4;
        //Arrays.sort(pointsArray);
        for (Point2D point : pointsArray) {
            System.out.println(point);


        }
    }
}