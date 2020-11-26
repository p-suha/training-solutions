package week05d04;

import org.junit.jupiter.api.Test;
import week05d4.Product;
import week05d4.Store;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ProductsTest {

    @Test

    public void ProductGetNameTest() {
        //GIVEN
        String name = "Termek";
        //When
        name = new Product("Termek", 2020, 10, 10).getName();

        //then
        assertEquals("Termek", name);
    }

    @Test
    public void GetExpireDateTest() {


        //
        LocalDate expireDate = new Product("Termek1", 2020, 04, 04).getExpire();
        assertEquals("2020-04-04", expireDate.toString());
    }

    @Test
    public void GetNumberOfExpired() {

        Product pr1 = new Product("Elso", 2020, 10, 06);
        Product pr2 = new Product("Masodik", 2010, 07, 07);
        Product pr3 = new Product("Masodik", 2022, 07, 07);

        List<Product> termekek = new ArrayList<>();
        termekek.add(pr1);
        termekek.add(pr2);
        termekek.add(pr3);
        Store store = new Store(termekek);


        assertEquals(2, store.getNumberOfExpired());
    }

}