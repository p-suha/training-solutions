package ioreadstring.names;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class FileManager {

    private Path myFile;
    private List<Human> humanList = new ArrayList<>();

    public FileManager(String myFilePath) {
        this.myFile = Path.of(myFilePath);
    }

    public List<Human> getHumanList() {
        return humanList;
    }

    public Path getMyFile() {
        return myFile;
    }

    public void readFromFile() {

        try {

            List<String> namesInFile = Files.readAllLines(myFile);
            for (String str : namesInFile) {
                String nameSplit[] = str.split(" ");

                Human human = new Human(nameSplit[0], nameSplit[1]);
                humanList.add(human);
            }


        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
