package week15d04;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CovidMax {


    private List<CovidCases> weeklyCases;

    Path file = Path.of("data.csv");

    public List<String> readFile(Path path) {

        try (BufferedReader br = Files.newBufferedReader(file)) {

            String line;
            br.readLine();
            List<CovidCases> weeklyCases = new ArrayList<>();

            while ((line = br.readLine()) != null) {
                String[] temp = line.split(",");
                String week = temp[1];
                int cases = Integer.parseInt(temp[2]);

                if (line.contains("Hungary")) {
                    weeklyCases.add(new CovidCases(cases, week));
                }
            }

            Collections.sort(weeklyCases);
            List<String> weeks = new ArrayList<>();

            for (int i = weeklyCases.size() - 1; i > weeklyCases.size() - 4; i--) {
                weeks.add(weeklyCases.get(i).getWeek());
            }
            return weeks;

        } catch (IOException ioe) {
            throw new IllegalArgumentException("Cannot read file");
        }


    }

    public static void main(String[] args) {
        CovidMax c = new CovidMax();

        System.out.println(c.readFile(Path.of("data.csv")));
    }
}
