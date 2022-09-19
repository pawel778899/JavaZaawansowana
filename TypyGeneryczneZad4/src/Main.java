import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {


        Library<Book> bookLibrary = new Library<>(new Book[]{
                new Book("Harry Potter","Fantasy")});
        System.out.println(Arrays.toString(bookLibrary.getElements()));

        Library<Movie> movieLibrary = new Library<>(new Movie[]{
                new Movie("5tar Wars", "J.J Ambrams")});
        System.out.println(Arrays.toString(movieLibrary.getElements()));

        Library<Newspaper> newspaperLibrary = new Library<>(
                new Newspaper[]{new Newspaper("NYC", "U5")});
        System.out.println(Arrays.toString(newspaperLibrary.getElements()));

    }


}

