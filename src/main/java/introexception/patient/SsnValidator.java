package introexception.patient;

public class SsnValidator {

    public boolean isValidSsn(String ssn) {
        if (ssn.length() != 9 || !SsnValidator.onlyDigits(ssn))
            return false;

        try {

            int sum = 0;
            int verificationNum = Integer.parseInt(Character.toString(ssn.charAt(ssn.length() - 1)));

            for (int i = 0; i < ssn.length() - 1; i++) {

                int num = Integer.parseInt(Character.toString(ssn.charAt(i)));

                if ((i + 1) % 2 != 0) {

                    num *= 3;
                    sum += num;
                } else {

                    num *= 7;
                    sum += num;
                }

            }
            return sum % 10 == verificationNum;

        }
        catch (IllegalArgumentException illegalArgumentException) {
            return false;
        }
    }


    private static boolean onlyDigits(String ssn) {

        for (int i = 0; i < ssn.length(); i++) {

            if (Character.isDigit(ssn.charAt(i))) {
                return true;
            } else {
                return false;
            }
        }

        return false;
    }
}

