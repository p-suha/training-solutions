package attributes.persons;

public class PersonMain {

    public static void main(String[] args) {

        Person person = new Person("Emberünk neve", "Az12345");

        System.out.println(person.personToString());
        Adress adress = new Adress("Magyarország", "Alsópetény", "Ady u. 12", "9987");
        person.moveTo(adress);
        System.out.println(person.personToString());
        person.correctData("Kiss Péter", "mm222");
        System.out.println(person.personToString());
        System.out.println(person.getAdress().adressToString());

        adress.correctData("Magyarország", "Cibakháza", "Petőfi út", "6776");
        System.out.println(person.personToString());
        System.out.println(adress.adressToString());
        System.out.println(adress.getStreetAndNumber());
        person.moveTo(adress);

        System.out.println(person.personToString() +" // " + adress.adressToString());
    }
}
