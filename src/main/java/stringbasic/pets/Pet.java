package stringbasic.pets;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Pet {
    private String name;
    private LocalDate yearOfBirth;
    private Gender gender;
    private String registrationNumber;

    public Pet(String name, LocalDate yearOfBirth, Gender gender, String registrationNumber) {
        this.name = name;
        this.yearOfBirth = yearOfBirth;
        this.gender = gender;
        this.registrationNumber = registrationNumber;
    }

    public String getName() {
        return name;
    }

    public LocalDate getYearOfBirth() {
        return yearOfBirth;
    }

    public Gender getGender() {
        return gender;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }
}
