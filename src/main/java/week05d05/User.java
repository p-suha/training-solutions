package week05d05;

public class User {

    private String firstName;
    private String lastName;
    private String email;

    public User(String firstName, String lastName, String email) {
        this.firstName = firstName;
        this.lastName = lastName;

        if (!email.contains("@") || !email.contains(".") || email.lastIndexOf(".") < email.lastIndexOf("@")) {

            throw new IllegalArgumentException("Not valid email!");
        }
        this.email = email;
    }

    public String getFullName() {
        return firstName + " " + lastName;
    }

    public static void main(String[] args) {
        User user = new User("Kiss", "Pista", "valami.gza@email.hu");
        System.out.println(user.getFullName());
    }
}
