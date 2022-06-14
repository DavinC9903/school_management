package za.ac.cput.factory.details;

import za.ac.cput.domain.details.City;
import za.ac.cput.util.StringHelper;

public class CityFactory {
    public static City build(String id, String name){
        StringHelper.checkStringParam("id", id);
        StringHelper.checkStringParam("name", name);
        if(StringHelper.isEmptyOrNull(id) || StringHelper.isEmptyOrNull(name))
            throw new IllegalArgumentException("id and/or name is required");
        return new City.Builder().id(id).name(name).build();
    }


}
