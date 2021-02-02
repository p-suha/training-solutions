package ioreadwritebytes;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class TemperaturesReader {

    public Temperatures readTemperatures(String pathstring) {
        Path path = Path.of(pathstring);

        byte[] temperaturesArray = new byte[0];
        try {
            temperaturesArray = Files.readAllBytes(path);
        } catch (IOException e) {
            throw new IllegalArgumentException("Can't read file", e);
        }
        return new Temperatures(temperaturesArray);

    }
}
