package FileReader.WritingFile;

import java.io.FileWriter;
import java.io.IOException;

public class WriteToFileDemo {
    public static void main(String[] args) {
        String data = "To be or not to be, \nthat is the question";

        try (FileWriter fw = new FileWriter("src/FileReader/WritingFile/dataoutput.txt")) {
            fw.write(data);
        } catch(IOException e) {
            e.printStackTrace();
        }
    }
}