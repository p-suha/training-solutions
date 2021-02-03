package iofiles;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.nio.file.StandardOpenOption;

public class Installer {

    private static final String SOURCE_DIRECTORY = "/install/";

    public void install(String dir) {

        Path target = Path.of(dir);
        if (!Files.exists(target) || !Files.isDirectory(target)) {

            throw new IllegalArgumentException("The given directory doesn't exist");
        }

        try (BufferedReader br = new BufferedReader(new InputStreamReader(this.getClass().getResourceAsStream("/install/install.txt")))) {

            String line;

            while ((line = br.readLine()) != null) {

                if (line.endsWith("/")) {
                    Files.createDirectories(target.resolve(line));
                } else {
                    Files.copy(this.getClass().getResourceAsStream(SOURCE_DIRECTORY + line), target.resolve(line), StandardCopyOption.REPLACE_EXISTING);
                }

            }

        } catch (IOException ioe) {
            throw new IllegalStateException("Can not copy files", ioe);
        }
    }
}
