package week04d01;

import javax.naming.Name;

public class NameChanger {

    private String fullName;

    public NameChanger(String fullName) {
        if (fullName == null || fullName == "") {
            throw new IllegalStateException("Invalid name: " + fullName);
        }
        this.fullName = fullName;
    }

    public void changeFirstName(String firstName) {

        StringBuilder sbName = new StringBuilder();

        String[] temp = fullName.split(" ");

        sbName.append(firstName + " " + temp[1]);

        this.fullName = sbName.toString();
    }

    public static void main(String[] args) {

        NameChanger n = new NameChanger("Kiss Géza");
        System.out.println(n.fullName);
        n.changeFirstName("Nagy");
        System.out.println(n.fullName);
    }
}
