import java.io.File;

//Napisz program, który wyświetli wszystkie pliki/katalogi zawarte w danym katalogu.


public class Main {

    public static void main(String[] args) {

        File file = new File("D:\\SDA\\Moje\\JavaIOZada1\\.idea");
        String [] fileList = file.list();
        for (String name : fileList) {
            System.out.println(name);
        }

    }


}
