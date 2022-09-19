//Napisz program, który jest odpowiedzialny za zwrócenie najdłuższego słowa we wskazanym
// pliku tekstowym.

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {


        String longestWord = new Main().findLongestWords();
        System.out.println(longestWord);
    }
    public String findLongestWords() throws FileNotFoundException {
            String longestWord = "";
            String current;
            Scanner scanner = new Scanner(new File("D:\\SDA\\Moje\\JavaIOZad4\\src\\elo.txt"));

            while (scanner.hasNext()) {
            current = scanner.next();
            if (current.length() > longestWord.length()) {
                longestWord = current;
            }
        }
            return longestWord;
        }
    }





