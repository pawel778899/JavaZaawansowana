import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Serialize {
    public static void main(String[] args) {

        try {
            Movie movieToSerialize = new Movie(1123, "Star Wars", "Start Wars IX");
            FileOutputStream fileOutputStream = new FileOutputStream("movies.txt");
            ObjectOutputStream out = new ObjectOutputStream(fileOutputStream);
            out.writeObject(movieToSerialize);
            out.flush();
            out.close();
        } catch (Exception e) {
            System.err.println(e);
        }
    }
}


