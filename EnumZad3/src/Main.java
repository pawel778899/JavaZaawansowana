public class Main {
    public static void main(String[] args) {

        float convertedTemp1 = TemperatureConvert.convertTemperature('C', 'K', 1f);
        System.out.println(convertedTemp1);
        float convertedTemp2 = TemperatureConvert.convertTemperature('F', 'K', 1f);
        System.out.println(convertedTemp2);
    }
}
