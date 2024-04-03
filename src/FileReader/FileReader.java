package FileReader;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.File;

public class FileReader {
    public static void main(String[] args) {
        try {
            File file = new File("src/hamlet.txt");
            Scanner input = new Scanner(file);

            while (input.hasNextLine()) {
                String line = input.nextLine();
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}