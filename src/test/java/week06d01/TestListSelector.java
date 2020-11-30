package week06d01;

import org.junit.jupiter.api.Test;
import stringscanner.StringScanner;
import wek06d01.ListSelector;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class TestListSelector {

    @Test

    public void listSelectorTest() {

        ListSelector ls = new ListSelector();
        assertEquals("[elso, harmadik]", ls.listSelector(new ArrayList<>(Arrays.asList("elso", "masodik", "harmadik"))));
    }

    @Test

    public void emptylistSelectorTest() {

        ListSelector ls = new ListSelector();
        assertEquals("", ls.listSelector(new ArrayList<>(Arrays.asList())));
    }

    @Test

    public void nullListSelectorTest() {
        ListSelector ls = new ListSelector();
        Exception ex = assertThrows(NullPointerException.class, () -> ls.listSelector(null));
        assertEquals("List can not be null!", ex.getMessage());
    }
}

