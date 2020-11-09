package attributes.persons;

public class Person {

    private String name;
    private String idCard;
    private Adress adress;

    public Person(String name, String idCard) {
        this.name = name;
        this.idCard = idCard;
    }


    public void  moveTo (Adress adress){

        this.adress = adress;

    }

    public Adress getAdress(){
        return adress;
    }

    public void correctData(String name, String idCard) {
        this.name = name;
        this.idCard = idCard;
    }

    public String personToString () {
        return name + " - " + idCard;
    }

    public String getName() {
        return name;
    }

    public String getIdCard() {
        return idCard;
    }

}
