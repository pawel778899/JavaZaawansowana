import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        Weekday weekday = Weekday.MONDAY;
        Weekday weekday2 = Weekday.TUESDAY;

        Stream.of(Weekday.values()).forEach(System.out::println);
        System.out.println(Weekday.valueOf("Monday") == Weekday.MONDAY);
        System.out.println(Weekday.MONDAY.name());


        System.out.println(Weekday.SATURDAY.isHoliday());
        System.out.println(Weekday.SATURDAY.isWeekDay());
        System.out.println(Weekday.MONDAY.isWeekDay());
        Weekday.SUNDAY.whichIsGreater(Weekday.WEDNESDAY);
        Weekday.FRIDAY.whichIsGreater(Weekday.SATURDAY);
        Weekday.SUNDAY.whichIsGreater(Weekday.MONDAY);

    }
}
