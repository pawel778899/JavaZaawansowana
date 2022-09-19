public class Circle extends Shape{

    private float radius;

    public Circle() {
        super();
        this.radius=1;
    }

    public Circle(String color, boolean isFilled, float radius) {
        super(color, isFilled);
        this.radius = radius;
    }

    public float getRadius() {
        return radius;
    }

    public void setRadius(float radius) {
        this.radius = radius;
    }

    public float getArea(){
       return (float) (Math.PI*radius*radius);
    }

    public float getPerimiter(){
        return (float) (2*Math.PI*radius);
    }

    @Override
    public String toString() {
        return String.format(("Circle with radius=%f which is a subclass off %s"),radius,super.toString());
    }
}
