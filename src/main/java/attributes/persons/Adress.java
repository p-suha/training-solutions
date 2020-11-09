package attributes.persons;

public class Adress {

    private  String country;
    private String city;
    private String streetAndNumber;
    private String zipCode;

    public String adressToString() {
        return getCountry() + ", " + getCity() + ", " + getStreetAndNumber() + ", " + getZipCode();
    }

    public Adress (String country, String city, String streetAndNumber, String zipCode) {
        this.country = country;
        this.city = city;
        this.streetAndNumber = streetAndNumber;
        this.zipCode = zipCode;

    }

    public void correctData (String country, String city, String streetAndNumber, String zipCode) {
        this.country = country;
        this.city = city;
        this.streetAndNumber = streetAndNumber;
        this.zipCode = zipCode;

    }



    public String getCountry() {
        return country;
    }

    public String getCity() {
        return city;
    }

    public String getStreetAndNumber() {
        return streetAndNumber;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setStreetAndNumber(String streetAndNumber) {
        this.streetAndNumber = streetAndNumber;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }
}
