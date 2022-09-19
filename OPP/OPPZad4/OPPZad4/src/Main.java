import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

//        Shape[] shapes = {
//                new Circle("blue", true, 20),
//                new Rectangle("yellow", true, 20, 30),
//                new Square("green", false, 40)
//        };

        Shape circle =new Circle("blue", true, 20);
        Shape rectangle =new Rectangle("yellow", true, 20, 30);
        Shape square =new Square("green", false, 40);


        List<Shape> shapesList = new ArrayList<>();
        shapesList.add(circle);
        shapesList.add(rectangle);
        shapesList.add(square);

        for (Shape shape : shapesList) {
            System.out.println(shape);
            System.out.println(shape.getArea());
            System.out.println(shape.getPerimeter());
        }


    }
}
