package za.ac.cput.factory.details;

/**
 * Name - Onele Tomson
 * Student number - 219483280
 * Country Factory
 * Date: 12 June 2022
 */
import za.ac.cput.domain.details.Country;
import za.ac.cput.util.StringHelper;

public class CountryFactory {

    public static Country build(String id, String name) {
        if (id == null || id.isEmpty())
            throw new IllegalArgumentException("Please enter Country id");
        if (name == null || name.isEmpty())
            throw new IllegalArgumentException("Please enter Country name");

                return new Country.Builder().id(id).name(name).build();
    }

}
