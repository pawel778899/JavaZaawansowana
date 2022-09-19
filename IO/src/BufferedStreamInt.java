import java.io.*;



//Buforowanie strumieni bajtów (intów)
public class BufferedStreamInt {
    public static void main(String[] args) throws IOException {

        BufferedInputStream in = null;
        BufferedOutputStream out = null;

        try {
            in = new BufferedInputStream(new FileInputStream("src/user.txt"));
            out = new BufferedOutputStream(new FileOutputStream("src/user_output.txt"));

            int c;
            while ((c = in.read()) != -1) {
                out.write(c);
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