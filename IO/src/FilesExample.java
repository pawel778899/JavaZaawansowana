import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class FilesExample {

    public static void main(String[] args) throws IOException {
        Path path = Paths.get("src/user.txt");
        Path pathToCopy = Paths.get("src/data_copy.txt");


        Files.delete(path);
        Files.createFile(path);


        Files.write(path, "test data\n".getBytes(), StandardOpenOption.WRITE);
        Files.write(path, "first line\n".getBytes(), StandardOpenOption.APPEND); // APPEND dodaje tekst do istniejącej zawartości
        Files.write(path, "second line\n".getBytes(), StandardOpenOption.APPEND);

        for (String line : Files.readAllLines(path)){
            System.out.println(line);
        }

        Files.copy(path, pathToCopy);
        Files.delete(pathToCopy);
    }
}