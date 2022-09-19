import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

//Strumień znaków
public class CharacterStreamChar {
    public static void main(String[] args) throws IOException {

        FileReader in = null;
        FileWriter out = null;

        try {
            in = new FileReader("src/user.txt");
            out = new FileWriter("src/user_output.txt");

            int nextChar;
            while ((nextChar = in.read()) != -1) {
                out.append((char) nextChar);
            }
        } finally {
            if (in != null) {
                in.close();
            }
            if (out != null) {
                out.close();
            }
        }
    }
}