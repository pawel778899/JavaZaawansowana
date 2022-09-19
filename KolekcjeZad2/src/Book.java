import java.util.List;
import java.util.Objects;

public class Book implements Comparable<Book>{

    private String title;
    private float price;
    private int yearOfRelease;
    private List<Author> authors;
    private Genre genre;

    public Book(String title, float price, int yearOfRelease, List<Author> authors, Genre genre) {
        this.title = title;
        this.price = price;
        this.yearOfRelease = yearOfRelease;
        this.authors = authors;
        this.genre = genre;

    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getYearOfRelease() {
        return yearOfRelease;
    }

    public void setYearOfRelease(int yearOfRelease) {
        this.yearOfRelease = yearOfRelease;
    }

    public List<Author> getAuthors() {
        return authors;
    }

    public void setAuthors(List<Author> authors) {
        this.authors = authors;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, price, yearOfRelease, authors, genre);
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public String toString() {
            return
            "Booktitle = " + title +"\n"+
            "price = " + price +"\n" +
            "yearOfRelease  =" + yearOfRelease +"\n" +
            "authors = " + authors +"\n" +
            "genre = " + genre + '.';
    }

    @Override
    public int compareTo(Book o) {
        return o.getTitle().compareTo(title);
    }
}






