import java.io.*;

//Buforowanie strumieni znaków
public class BufferedStreamChar {
    public static void main(String[] args) throws IOException {

        BufferedReader in = null;
        BufferedWriter out = null;

        try {
            in = new BufferedReader(new FileReader("src/user.txt"));
            out = new BufferedWriter(new FileWriter("src/user_output.txt"));

            String line;
            while ((line = in.readLine()) != null) {
                out.write(line);
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