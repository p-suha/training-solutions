package week13d01;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class CityOperations {

    public String findCityWithMaxLength(BufferedReader reader) {
        String maxCityName = "";
        try {
            String line;
            reader.readLine();//átugorjuk a headert
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(";");
                String name = parts[1];

                if (name.length() > maxCityName.length()) {
                    maxCityName = name;
                }
            }
        } catch (IOException ioe) {
            throw new IllegalStateException("Can not read file", ioe);
        }
        return maxCityName;
    }

    public static void main(String[] args) {
        try (BufferedReader br = Files.newBufferedReader(Path.of("iranyitoszamok-varosok2021.csv"))) {
            String city = new CityOperations().findCityWithMaxLength((br));
            System.out.println(city);
        } catch (IOException ioe) {
            throw new IllegalStateException("Can not read file", ioe);
        }
    }
}
