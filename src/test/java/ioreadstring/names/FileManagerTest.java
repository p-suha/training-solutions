package ioreadstring.names;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FileManagerTest {


    private FileManager fm = new FileManager("src/main/resources/names.txt");

    @Test
    public void createClassTest() {
        assertEquals("names.txt", fm.getMyFile().getFileName().toString());
        assertEquals(0, fm.getHumanList().size());
    }


    @Test
    public void readFromFileTest() {
        fm.readFromFile();
        assertEquals(4, fm.getHumanList().size());
        assertEquals("Kis", fm.getHumanList().get(0).getFirstName());
        assertEquals("Lajos", fm.getHumanList().get(1).getLastName());
    }

}