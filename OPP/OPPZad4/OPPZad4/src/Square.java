class Square extends Rectangle {

    public Square(String color, boolean isFilled, double size) {
        super(color, isFilled, size, size);
    }

    @Override
    public void setWidth(double width) {
        super.setWidth(width);
        super.setLength(width);
    }

    @Override
    public void setLength(double length) {
        super.setWidth(width);
        super.setLength(length);
    }

    @Override
    public String toString() {
        return  String.format("Square  with  width=%f  and  length=%f which is subclass off %s", width, length, super.toString());
    }
} 