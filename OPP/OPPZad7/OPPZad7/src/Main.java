public class Main {

    public static void main(String[] args) {

    Circle circle = new Circle(14);
        System.out.println(circle.getArea());
        System.out.println(circle.getPerimeter());
        System.out.println(circle);

    Resizable resizable = new ResizableCircle(40);
    resizable.resize(30);
    System.out.println(resizable);

    }



}
