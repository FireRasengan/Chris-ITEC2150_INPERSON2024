package FileReader.WeatherAnalysis;

import java.io.*;

public class Weather {
    public static void computeData(String input, String output) {
        final int NUM_OF_DAYS = 10;
        final int NUM_OF_HOURS = 24;

        try (
                BufferedReader br = new BufferedReader(new FileReader(input));
                BufferedWriter bw = new BufferedWriter(new FileWriter(output));
                ) {
            for (int i = 0; i < NUM_OF_DAYS; i++) {
                double sumTem = 0;
                double sumHum = 0;

                for (int j = 0; j < NUM_OF_HOURS; j++) {
                    String line = br.readLine();
                    if (line == null) {
                        break;
                    }
                    String[] element = line.split(" ");
                    double tem = Double.parseDouble(element[2]);
                    double hum = Double.parseDouble(element[3]);
                    sumTem += tem;
                    sumHum += hum;
                }
                double avgTem = sumTem/NUM_OF_HOURS;
                double avgHum = sumHum/NUM_OF_DAYS;
                bw.write(String.format("Day%2d's avg temperature is %3.2f\n", (i + 1), avgTem));
                bw.write(String.format("Day%2d's avg humidity is %3.2f\n\n", (i + 1), avgHum));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        computeData("src/FileReader/WeatherAnalysis/weather.txt",
                "src/FileReader/WeatherAnalysis/report.txt");
    }
}
