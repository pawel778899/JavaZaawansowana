public class Main {

    public static void main(String[] args) {


        Shape shape = new Shape("red", false);
        System.out.println(shape);

        Shape circle = new Circle("blue",true,20);
        System.out.println(circle);

        Shape rectangle = new Rectangle("yellow",true,20,30);
        System.out.println(rectangle);

        Shape square = new Square("green",false,40);
        System.out.println(square);




    }

}
