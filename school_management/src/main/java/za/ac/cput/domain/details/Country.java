package za.ac.cput.domain.details;
/**
 * Name - Onele Tomson
 * Student number - 219483280
 * Country Entity
 * Date - 11 June 2022
 */

import java.util.Objects;

public class Country {

    private final String id, name;


    public Country(Builder builder) {
        this.id = builder.id;
        this.name = builder.name;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public static class Builder {
        private String id, name;

        public Builder id(String id) {
            this.id = id;
            return this;
        }

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Country.Builder copy(Country country) {
            this.id = country.id;
            this.name = country.name;
            return this;
        }


        public Country build() {
            return new Country(this);
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Country country = (Country) o;
            return id.equals(country.id);
        }

        @Override
        public int hashCode() {
            return Objects.hash(id);
        }

        @Override
        public String toString() {
            return "Country{" +
                    "id='" + id + '\'' +
                    ", name='" + name + '\'' +
                    '}';
        }

    }
}
