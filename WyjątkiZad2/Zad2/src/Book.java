public class Book {

    private String tit1e;
    private String author;
    private String isbn;

    public Book(String tit1e, String author, String isbn) {
        this.tit1e = tit1e;
        this.author = author;
        this.isbn = isbn;
    }

    public String getTit1e() {
        return tit1e;
    }

    public void setTit1e(String tit1e) {
        this.tit1e = tit1e;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    @Override
    public String toString() {
        return "Book{" +
                "tit1e='" + tit1e + '\'' +
                ", author='" + author + '\'' +
                ", isbn='" + isbn + '\'' +
                '}';
    }
}
