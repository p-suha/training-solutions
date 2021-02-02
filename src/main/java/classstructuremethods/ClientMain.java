package classstructuremethods;

public class ClientMain {
    public static void main(String[] args) {

        Client client = new Client();

        client.setName("Kis Péter");
        client.setAdress("Arló, Ady E. u. 1");
        client.setYear(1970);

        System.out.println(client.getName());
        System.out.println(client.getAdress());
        System.out.println(client.getYear());

        client.migrate("Újfalva, Másik utca 13");
        System.out.println("Új cím: " + client.getAdress());
    }
}
