package FileReader.WritingFile;

import java.io.*;

public class WithoutAutoClosurePrintWriter {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        PrintWriter pw = new PrintWriter(new File("data.txt"));
        pw.print("Sultan T Nolan");
        pw.println(91);
        pw.print("Ian McGregor");
        pw.println(98);
        pw.print("Chris Jung");
        pw.println(100);
        pw.print("Daniel M Schultz");
        pw.println(94);
        pw.print("Dylan V Roberts");
        pw.println(100);

        pw.close();

        FileWriter fw = new FileWriter("data.txt");
        fw.write("New DATA is entered");
        fw.write("What would be happening");
        fw.close();
    }
}
