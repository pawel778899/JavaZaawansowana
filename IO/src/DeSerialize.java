import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class DeSerialize {

    public static void main(String[] args) {
        try {
            FileInputStream fileIn = new FileInputStream("movies.txt");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            Movie movieToDeserialize = (Movie) in.readObject();
            in.close();
            fileIn.close();
            System.out.println(movieToDeserialize);
        } catch (Exception e) {
            System.err.println(e);
        }
    }
}
