import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

//Napisz program, który odczyta i wyświetli cały dowolny plik linia po linii.

public class Main {
    public static void main(String[] args) {


        try {
            BufferedReader in = new BufferedReader(new FileReader("D:\\SDA\\Moje\\JavaIOZad2\\src\\elo.txt"));

            String strLine;

            while ((strLine = in.readLine()) != null) {
                System.out.println(strLine);
            }
            in.close();
        }
        catch (FileNotFoundException e) {
            System.err.println("File not found");
        }
         catch (IOException e) {
            System.err.println("Unable to read the file.");
        }
    }
}
