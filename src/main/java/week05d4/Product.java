package week05d4;

import java.time.LocalDate;

public class Product {

    private String name;
    private LocalDate expire;

    public Product(String name, int year, int month, int day) {
        this.name = name;
        this.expire = LocalDate.parse(year + "-" + stringFormatter(month) + "-" + stringFormatter(day));
    }

    public String getName() {
        return name;
    }

    public LocalDate getExpire() {
        return expire;
    }

    private String stringFormatter(int tostring) {

        String formattedString = Integer.toString(tostring);
        if (tostring < 10) {
            formattedString = "0" + tostring;
        }

        return formattedString;
    }

}
