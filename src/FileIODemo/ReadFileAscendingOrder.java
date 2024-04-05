package FileIODemo;

import java.io.BufferedReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.io.IOException;
import java.io.FileReader;

public class ReadFileAscendingOrder {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<Student>();

        try (BufferedReader reader = new BufferedReader(new FileReader("data.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] column = line.split("\\s+");
                String studentName = column[0];

                for (int i = 1; i < column.length - 1; i++) {
                    studentName += " " + column[i];
                }

                int grades = Integer.parseInt(column[column.length - 1]);

                students.add(new Student(studentName, grades));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        Collections.sort(students, Comparator.comparingInt(Student::getScore));

        for (Student s: students) {
            System.out.println(s.getName() + ": " + s.getScore());
        }
    }
}