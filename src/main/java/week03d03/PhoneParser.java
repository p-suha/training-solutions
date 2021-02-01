package week03d03;

public class PhoneParser {

    public Phone parse(String number) {

        String str[] = number.split("-");

        return new Phone(str[0], str[1]);
    }


    public static void main(String[] args) {
        PhoneParser parser = new PhoneParser();
        String str = "10-2345677";
        Phone phone = parser.parse(str);
        System.out.println(phone.toString());
    }
}


