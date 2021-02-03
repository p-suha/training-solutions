package week12d05;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class WordCounter {

    public int wordCounter(String word) {
        Path path = Path.of("src/main/resources/index.html");

        try (BufferedReader br = Files.newBufferedReader(path)) {
            String line;
            int counter = 0;

            while ((line = br.readLine()) != null) {
                if (line.toLowerCase().contains(word)) {
                    counter++;
                }

            }
            return counter;

        } catch (IOException ioe) {
            throw new IllegalStateException("Can not read file", ioe);

        }

    }

    public static void main(String[] args) {
        int result = new WordCounter().wordCounter("koronavírus");
        System.out.println(result);
    }
}
