
//This is a worker class for Address entity
 //In this class I will create all the attributes for this entity.
 //In this class I will be creating getters and setters for this entity
 //This is a Address.java

package za.ac.cput.domain.details;

import java.util.Objects;

/**
 * @uthor Chuma Nxazonke
 * Student number: 219181187
 * Date: 10 June 2022
 */

public class Address {

    //Declaring all the objects for this entity
    private String unitNumber;
    private String complexName;
    private String streetNumber;
    private String streetName;
    private int postalCode;
    private City city;

    //Creating parameterized constructor to initialize all the objects
    public Address(Builder builder) {
        this.unitNumber = builder.unitNumber;
        this.complexName = builder.complexName;
        this.streetNumber = builder.streetNumber;
        this.streetName = builder.streetName;
        this.postalCode = builder.postalCode;
        this.city = builder.city;

    }

    public String getUnitNumber() {
        return unitNumber;
    }

    public String getComplexName() {
        return complexName;
    }

    public String getStreetNumber() {
        return streetNumber;
    }

    public String getStreetName() {
        return streetName;
    }

    public int getPostalCode() {
        return postalCode;
    }

    public City getCity() {
        return city;
    }

    public static class Builder{
        //Declaring all the objects for this entity
        private String unitNumber;
        private String complexName;
        private String streetNumber;
        private String streetName;
        private int postalCode;
        private City city;


        public Builder UnitNumber (String unitNumber1){
            this.unitNumber = unitNumber1;
            return this;
        }

        public Builder ComplexName (String complexName1){
            this.complexName = complexName1;
            return this;
        }

        public Builder StreetNumber (String streetNumber1){
            this.streetNumber = streetNumber1;
            return this;
        }

        public Builder StreetName (String streetName1){
            this.streetName = streetName1;
            return this;
        }

        public Builder PostalCode (int postalCode1){
                    this.postalCode = postalCode1;
                    return this;

        }
        public Builder setCity (City city1){
                    this.city = city1;
                    return this;
        }


        public Builder Copy (Address address) {
            this.unitNumber = address.unitNumber;
            this.complexName = address.complexName;
            this.streetNumber = address.streetNumber;
            this.streetName = address.streetName;
            this.postalCode = address.postalCode;
            this.city = address.city;

            return this;
        }

        public Address build(){
            return new Address(this);
        }
    }
@Override
        public boolean equals (Object o){

        if (this == o) return true;
        if (o == null || getClass() == o.getClass()) return false;
        Address address = (Address) o;
        return unitNumber.equals(address.unitNumber);

}

public int hashCode() {
        return Objects.hash(unitNumber);
}


    @Override
    public String toString() {
        return "Address{" +
                "unitNumber='" + unitNumber + '\'' +
                ", complexName='" + complexName + '\'' +
                ", streetNumber='" + streetNumber + '\'' +
                ", streetName='" + streetName + '\'' +
                ", postalCode=" + postalCode +
                ", city=" + city +
                '}';
    }
}
