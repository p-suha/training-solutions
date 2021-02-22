package exam03retake01;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class OwlCounter {

    private Map<String, Integer> owlsByCounty;

    public OwlCounter() {
        owlsByCounty = new HashMap<>();
    }

    public void readFromFile(BufferedReader reader) throws IOException {
        String line;
        while ((line = reader.readLine()) != null) {
            String[] parts = line.split("=");
            owlsByCounty.put(parts[0], Integer.parseInt(parts[1]));
        }

    }


    public int getNumberOfOwls(String county) {
        return owlsByCounty.get(county);
    }

}

