package PojoFiles.Schools;

public class Address {

    private City city;
    private String postalCode;
    private String street;
    private Country country;

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public Country getCountry() {
        return country;
    }

    @Override
    public String toString() {
        return "Address{" +
                "city=" + city +
                ", postalCode='" + postalCode + '\'' +
                ", street='" + street + '\'' +
                ", country=" + country +
                '}';
    }

    public void setCountry(Country country) {
        this.country = country;
    }
}
