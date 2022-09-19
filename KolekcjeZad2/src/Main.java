import java.util.Arrays;
public class Main {

    public static void main(String[] args) {

        Author author1 = new Author("John", "Smith", 'M');
        Author author2 = new Author("Jessica", "Albana", 'F');
        Author author3 = new Author("Roger", "Moore", 'M');
        Author author4 = new Author("Catherin", "Nadie", 'F');

        Book book1 = new Book("Book 1", 34, 2000, Arrays.asList(author1), Genre.FANTASY);
        Book book2 = new Book("Book 2", 56, 1999, Arrays.asList(author2, author4), Genre.ACTION);
        Book book3 = new Book("Book 3", 108, 1970, Arrays.asList(author3, author4), Genre.CRIME);

        BookService bookService = new BookService();
        bookService.add(book1);
        bookService.add(book2);
        bookService.add(book3);

        //System.out.println(bookService.findByGenre(Genre.CRIME));
        //System.out.println(bookService.findByYear(2000));
        //System.out.println(bookService.findMostExpensiveBook());
        //System.out.println(bookService.findCheapestBook());
        //System.out.println(bookService.findByNumberOfAuthors(2));
        System.out.println(bookService.sortByTitleAsc());
        System.out.println("\n");
        System.out.println(bookService.sortByTitleDsc());







    }
}
