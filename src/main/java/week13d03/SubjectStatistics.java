package week13d03;

import java.io.BufferedReader;
import java.io.IOException;
import java.lang.reflect.Array;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class SubjectStatistics {

    private List<Subject> data = new ArrayList<>();


    public void readFromFile(String fileName) {

        try (BufferedReader br = Files.newBufferedReader(Path.of(fileName))) {

            String[] block = new String[4];
            while ((block[0] = br.readLine()) != null) {

                data.add(processBlock(br, block));
            }


        } catch (IOException ioe) {
            throw new IllegalStateException("Something went wrong", ioe);
        }
    }

    private Subject processBlock(BufferedReader br, String[] block) throws IOException {
        for (int i = 1; i < 4; i++) {
            block[i] = br.readLine();
        }
        return new Subject(block[0], block[1], block[2], Integer.parseInt(block[3]));
    }

    public int weekWork(String name) {
        int sumHours = 0;
        for (Subject t : data) {
            if (t.getName().equals(name)) {
                sumHours = +t.getNumberOfLessons();
            }
        }
        return sumHours;
    }


    public static void main(String[] args) {
        SubjectStatistics st = new SubjectStatistics();
        st.readFromFile("beosztas.txt");
        System.out.println(st.weekWork("Antilop Anett"));
    }
}
