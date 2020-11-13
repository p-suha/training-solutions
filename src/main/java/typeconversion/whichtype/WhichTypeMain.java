package typeconversion.whichtype;

public class WhichTypeMain {
    public static void main(String[] args) {
        WichType valami = new WichType();


        System.out.println(valami.wichType("9"));
        System.out.println(valami.wichType("9999"));
        System.out.println(valami.wichType("9999999999"));
        System.out.println(valami.wichType("999999999999999999"));
        System.out.println("A lehetséges legnagyobb szám: " +
                Long.toString(Long.MAX_VALUE) +
                valami.wichType(Long.toString(Long.MAX_VALUE-1)));
    }
}
