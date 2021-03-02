package vizsga3megoldasok;

import java.io.BufferedReader;
import java.io.IOException;

public class Histogram {

    public String createHistogram(BufferedReader reader) {

        try {
            StringBuilder sb = new StringBuilder();
            String line;
            while ((line = reader.readLine()) != null) {
                int number = Integer.parseInt(line);
                sb.append("*".repeat(number));
                sb.append("\n");
            }
            return sb.toString();
        } catch (IOException e) {
            throw new IllegalArgumentException("Ill");
        }
    }
}
