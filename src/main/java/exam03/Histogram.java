package exam03;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Histogram {

    public String createHistogram(String file) {
        Path path = Path.of(file);
        try (BufferedReader reader = Files.newBufferedReader(path)) {
            StringBuilder sb = new StringBuilder();
            String line;
            while ((line = reader.readLine()) != null) {

                int numFromText = Integer.parseInt(line);
                for (int i = 0; i < numFromText; i++) {
                    sb.append("*");
                }
                sb.append("\n");

            }
            return sb.toString();
        } catch (IOException e) {
            throw new IllegalArgumentException("Can not read file", e);
        }
    }

    public static void main(String[] args) {
        Histogram h = new Histogram();
        System.out.println(h.createHistogram("histogram.txt"));
    }
}
