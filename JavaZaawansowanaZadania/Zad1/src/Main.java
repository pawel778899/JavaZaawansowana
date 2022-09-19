import java.util.*;
import java.util.stream.Collectors;
import java.util.Comparator;

public class Main {


    public static void main(String[] args) {

        List<String> unsorted = List.of("a", "B", "b", "X", "C","A", "z", "B", "D", "C","X", "Z", "B", "W", "c");

        System.out.println(sortUsingAnonymousClass(unsorted));
        System.out.println(sortUsingLambda(unsorted));
        System.out.println(sortUsingStream(unsorted));

    }






    /**
     *compareTo zwraca:
     * 0, gdy o1 równe o2
     * <0, gdy o2 większe od o1, tzn. A jest przed B
     * >0, gdy o1 większe od o2, tzn. B jest przed A
     */

    public static List<String> sortUsingAnonymousClass(final List<String> unsorted) {
        List<String> sorted = new ArrayList<>(unsorted);
        Collections.sort(sorted, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.compareToIgnoreCase(o1);
            }
        });
        return sorted;
    }

    public static List<String> sortUsingOwnComparator(final List<String> unsorted) {
        List<String> sorted = new ArrayList<>(unsorted);
        Collections.sort(sorted, new MyComparator());
        return sorted;
    }

    public static List<String> sortUsingLambda(final List<String> unsorted) {
        List<String> sorted = new ArrayList<>(unsorted);
        Collections.sort(sorted, (o1,o2) -> o2.compareToIgnoreCase(o1) );
        return sorted;
    }

    public static List<String> sortUsingStream(final List<String> unsorted) {
        List<String> sorted = new ArrayList<>(unsorted);
        return sorted.stream()
                .sorted((o1,o2)->o1.compareToIgnoreCase(o2)).
                collect(Collectors.toList());
    }

    public static List<String> sortUsingSortOnList(final List<String> unsorted) {
        List<String> sorted = new ArrayList<>(unsorted);
        sorted.sort(Comparator.reverseOrder());
        return sorted;
    }
}
