import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BookService {

    private final List<Book> books = new ArrayList<>();

    public void add(Book book) {
        books.add(book);
    }
    public void remove(Book book) {
        books.remove(book);
    }
    public List<Book> getAll() {
        return books;
    }

    public List<Book> findByGenre(Genre genre) {
        List<Book> results = new ArrayList<>();
        for (Book book : books) {
        if (book.getGenre() == genre) {
            results.add(book);
        }
    }
        return results;
    }
    public List<Book> findByYear(int yearOfRelease) {
        List<Book> results = new ArrayList<>();
        for (Book book : books) {
            if (book.getYearOfRelease() == yearOfRelease) {
                results.add(book);
            }
        }
        return results;
    }

    public Book findMostExpensiveBook() {
        Book result = null;
        for (Book book : books) {
            if (result == null || result.getPrice() < book.getPrice()) {
                result = book;
            }
        }
        return result;
    }
    public Book findCheapestBook() {
        Book result = null;
        for (Book book : books) {
            if (result == null || result.getPrice() > book.getPrice()) {
                result = book;
            }
        }
        return result;
    }

    public List<Book> findByNumberOfAuthors(int numberOfAuthors) {
        List<Book> results = new ArrayList<>();
        for (Book book : books) {
            if (book.getAuthors().size() == numberOfAuthors) {
                results.add(book);
            }
        }
        return results;
    }
    public List<Book> sortByTitleAsc() {
        Collections.sort(books);
        return books;
    }

    public List<Book> sortByTitleDsc() {
        Collections.reverse(books);
        return books;
    }
    public boolean isBookInRepo(Book book) {
        return books.contains(book);
    }
    public List<Book> findByAuthor(Author author) {
        List<Book> results = new ArrayList<>();
        for (Book book : books) {
        if (book.getAuthors().contains(author)) {
            results.add(book);
        }
    }
        return results;
    }

}
