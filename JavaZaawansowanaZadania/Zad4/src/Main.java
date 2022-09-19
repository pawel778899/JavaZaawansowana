public class Main {
    public static void main(String[] args) {

        Storage storage = new Storage();

        storage.addToStorage("0", "value0");
        storage.addToStorage("1", "value1");
        storage.addToStorage("2", "value2.1");
        storage.addToStorage("2", "value2.2");
        storage.addToStorage("3", "value3");

        storage.printValues("2");
        storage.printValues("0");
        storage.printValues("3");


        storage.getValues("2");
    }
}