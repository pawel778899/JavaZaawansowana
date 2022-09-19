import java.io.*;

//Napisz program, który doda do wskazanego pliku dowolny łańcuch tekstowy.
public class Main {
    public static void main(String[] args) {

      StringBuilder stringBuilder = new StringBuilder();
      String strLine ="";
        try {
            String filename = "D:\\SDA\\Moje\\JavaIOZad3\\src\\elo.txt";
            FileWriter fileWriter = new FileWriter(filename, true);
            fileWriter.write("\nJava I/0 Exercises\n");
            fileWriter.close();
            BufferedReader bufferedReader = new BufferedReader(new FileReader(filename));
            while (strLine != null) {
                stringBuilder.append(strLine);
                stringBuilder.append(System.lineSeparator());
                strLine = bufferedReader.readLine();
                System.out.println(strLine);
            }
            bufferedReader.close();
        }
        catch (IOException ioe) {
            System.err.println("I0Exception: " + ioe.getMessage());
        }

    }
}






