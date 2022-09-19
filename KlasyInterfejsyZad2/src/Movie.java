public class Movie {

    private String title;
    private String director;
    private int year0fRelease;
    private String genre;
    private String publisher;

    public Movie(String title, String director, int year0fRelease, String genre, String publisher) {
        this.title = title;
        this.director = director;
        this.year0fRelease = year0fRelease;
        this.genre = genre;
        this.publisher = publisher;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getYear0fRelease() {
        return year0fRelease;
    }

    public void setYear0fRelease(int year0fRelease) {
        this.year0fRelease = year0fRelease;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "title='" + title + '\'' +
                ", director='" + director + '\'' +
                ", year0fRelease=" + year0fRelease +
                ", genre='" + genre + '\'' +
                ", publisher='" + publisher + '\'' +
                '}';
    }
}


