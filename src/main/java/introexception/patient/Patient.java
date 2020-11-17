package introexception.patient;

public class Patient {

    public static final int MIN_YEAR = 1900;

    private String name;
    private String socialSecurityNumber;
    private int yearOfBirth;


    public Patient(String name, String ssn, int year) {

        if (name == null || name.isEmpty()) {

            throw new IllegalArgumentException("Name most not empty");
        }
        this.name = name;

        if (!new SsnValidator().isValidSsn(ssn)) {
            throw new IllegalArgumentException("Invalid Social Security Number: " + ssn);
        }
        this.socialSecurityNumber = ssn;

        if (year < MIN_YEAR) {
            throw new IllegalArgumentException("Invalid year of birth: " + year);
        }
        this.yearOfBirth = year;


    }

    public String getName() {
        return name;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }
}
