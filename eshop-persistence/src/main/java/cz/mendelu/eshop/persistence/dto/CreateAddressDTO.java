package cz.mendelu.eshop.persistence.dto;

import java.util.Objects;

public class CreateAddressDTO {

    private String street;
    private String city;
    private Integer postCode;
    private String country;

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Integer getPostCode() {
        return postCode;
    }

    public void setPostCode(Integer postCode) {
        this.postCode = postCode;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CreateAddressDTO that = (CreateAddressDTO) o;
        return Objects.equals(street, that.street) && Objects.equals(city, that.city) && Objects.equals(postCode, that.postCode) && Objects.equals(country, that.country);
    }

    @Override
    public int hashCode() {
        return Objects.hash(street, city, postCode, country);
    }

    @Override
    public String toString() {
        return "CreateAddressDTO{" +
                "street='" + street + '\'' +
                ", city='" + city + '\'' +
                ", postCode=" + postCode +
                ", country='" + country + '\'' +
                '}';
    }
}
