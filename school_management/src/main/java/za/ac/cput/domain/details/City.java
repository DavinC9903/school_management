package za.ac.cput.domain.details;

import java.util.Objects;

public class City {
    private final String id;
    private final String name;
    private final Country country;

    public City(Builder builder){
        this.id =builder.id;
        this.name = builder.name;
        this.country = builder.country;
    }


    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }



    public static class Builder{
        private String id,name;
        private Country country;

        public Builder id(String id){
            this.id = id;
            return this;
        }
        public Builder name(String name){
            this.name = name;
            return this;
        }
        public Builder country(Country country){
            this.country = country;
            return this;
        }

        public Builder copy(City city){
            this.id = city.id;
            this.name = city.name;
            this.country = city.country;
            return this;
        }

        public City build(){
            return new City(this);
        }
        @Override
        public boolean equals(Object obj){
            if(this == obj)
                return true;
            if (obj == null || getClass() != obj.getClass())
                return false;
            City city = (City) obj;
            return id.equals(city.id);
        }
        @Override
        public int hashCode(){
            return Objects.hash(id);
        }

    }

    @Override
    public String toString() {
        return "City{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", country=" + country +
                '}';
    }
}