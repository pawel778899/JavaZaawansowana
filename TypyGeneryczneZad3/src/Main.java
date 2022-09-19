import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Integer[] tab = {10, 21, 33, 40, 50, 60};
        Character [] tab1 = {'a','b','c','d','e','f'};
        String [] tab2 = {"aaaa","bbbbb","ccccc","dfdfssdfsdf","sdfsdfsdf"};
        ArrayUtils.swap(tab, 2, 5);
        ArrayUtils.swap(tab1, 2, 5);
        ArrayUtils.swap(tab2, 2, 4);
        System.out.println(Arrays.toString(tab));
        System.out.println(Arrays.toString(tab1));
        System.out.println(Arrays.toString(tab2));
    }

}
