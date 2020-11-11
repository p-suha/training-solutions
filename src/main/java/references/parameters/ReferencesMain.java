package references.parameters;

public class ReferencesMain {

    public static void main(String[] args) {
        Person var1;
        Person var2;

        Person person = new Person("Lajos", 30);
        var1 = person;
        var2 = var1;
        var2.setName("Ödön");

        System.out.println(var1.getName());
        System.out.println(var2.getName());

        int number = 24;
        int anotherNumber = number;
        anotherNumber ++;


        System.out.println(number);
        System.out.println(anotherNumber);


        Person person2 = new Person("pista", 40);
        var2 = person2;



        System.out.println(person2.getName());
        System.out.println(var2.getName());
        System.out.println(var1.getName());
    }
}
