package week03;

public class TelefonszamSzetszedoOsztaly {

    public Phone phoneSplit(String teljesSzamSzetszedendo) {

        String prefix = teljesSzamSzetszedendo.substring(0,2);
        String number = teljesSzamSzetszedendo.substring(3);

        Phone phonepeldany = new Phone(prefix, number);

        return phonepeldany;
    }


}
