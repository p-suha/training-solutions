package iowritebytes;

import java.io.BufferedOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class StringToBytes {


    public void writeAsBytes(List<String> words, Path path) {
        try (BufferedOutputStream bos = new BufferedOutputStream(Files.newOutputStream(path))) {

            for (String word : words) {
                if (!word.startsWith("_")) {
                    bos.write(word.getBytes());
                }
            }

        } catch (IOException ioe) {
            throw new IllegalStateException("Can not write file", ioe);
        }
    }
}
