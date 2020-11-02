package stringtype;

public class UserValidator {

    public boolean isValidUsername(String username) {
        return username != null && !"".equals(username);
    }

    public boolean isValidPassword(String password1, String password2) {
        return password1 !=null && password1.length() >= 8 && password1.equals(password2);
    }

    public boolean isValidEmail(String email) {
        int kukac = email.indexOf('@');
        String domain = email.substring(kukac +1);
        int pont = domain.indexOf('.');

        return kukac >0 && pont>0 && pont < domain.length() -1;
    }
}
