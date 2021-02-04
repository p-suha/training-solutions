package genericsusage;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;


class LibraryWithoutGenericsTest {

    @Test
    public void shouldThrowExceptionIfArgumentIsNull() {
        assertThrows(NullPointerException.class, () -> new LibraryWithoutGenerics().getFirstBookWithoutGenerics(null));
    }

    @Test
    public void shouldThrowExceptionIfArgumentIsEmptyList() {
        Exception ex = assertThrows(IllegalArgumentException.class, () -> new LibraryWithoutGenerics().getFirstBookWithoutGenerics(new ArrayList()));
        assertEquals("Argument should not be empty!", ex.getMessage());
    }

    @Test
    public void shouldThrowExceptionAddingDifferentObjects() {
        LibraryWithoutGenerics library = new LibraryWithoutGenerics();
        Exception ex = assertThrows(ClassCastException.class, () -> library.getFirstBookWithoutGenerics(Arrays.asList("", "", "")));
        assertEquals("Not a book", ex.getMessage());
    }

    @Test
    public void shouldReturnFirst() {
        assertEquals("Egri Csillagok", new LibraryWithoutGenerics().getFirstBookWithoutGenerics(Arrays.asList(new Book("Egri Csillagok"), new Book("Antigoné"))).getTitle());
    }
}

