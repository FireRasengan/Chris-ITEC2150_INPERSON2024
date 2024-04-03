package FileReader;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.io.FileReader;

public class ReverseRetrieve {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        try (BufferedReader reader = new BufferedReader(new FileReader("src/hamlet.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                list.add(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        for (int i = list.size() - 1; i >= 0; i--) {
            System.out.println(list.get(i));
        }
    }
}