package week03;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TelefonszamSzetszedoOsztalyTeszt {

    @Test
    void testParse() {

        TelefonszamSzetszedoOsztaly telefonszamSzetszedo = new TelefonszamSzetszedoOsztaly();
        String s ="70-666666";


        Phone phone = telefonszamSzetszedo.phoneSplit(s);

        assertEquals("70 666666", phone.getPrefix() + " " +phone.getNumber());
    }
}
