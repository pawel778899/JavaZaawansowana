public class main {

    public static void main(String[] args) {

        NumberBox<Double> doubleBox = new NumberBox<>();
        doubleBox.setValue(3.3d);

        NumberBox<Integer> intBox = new NumberBox<>();
        intBox.setValue(10);

        NumberBox<Float> floatBox = new NumberBox<>();
        floatBox.setValue(12.4f);

        NumberBox<Long>longBox = new NumberBox<>();
        longBox.setValue(12L);
        System.out.println(intBox.getValue() + " " + doubleBox.getValue()+ " " +floatBox.getValue());

        System.out.println(longBox.getValue());
    }

}
