package stringtype;

import javax.sound.midi.Soundbank;

public class StringTypeMain {

    public static void main(String[] args) {

        String prefix ="Hello";
        String name ="John Doe";
        String message = prefix + name;
        message = message +  444;
        boolean b = message.equals("Hello John Doe");
        boolean c = message.equals("Hello John Doe444");

        System.out.println(""+"");

        String szoveg ="Abcde";

        System.out.println(szoveg.length());
        System.out.println(szoveg.charAt(0) + ", "+ szoveg.charAt(2));
        System.out.println(szoveg.substring(0,3));

    }
}
