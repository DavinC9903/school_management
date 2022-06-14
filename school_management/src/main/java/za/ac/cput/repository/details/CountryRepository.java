package za.ac.cput.repository.details;
/**
 * Name - Onele Tomson
 * Student number - 219483280
 * CountryRepository
 * Date: 13 June 2022
 */
import za.ac.cput.domain.details.Country;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class CountryRepository {
    private final List<Country> ListOfCountry;

    private static CountryRepository CountryRepo;

    private CountryRepository() {
        this.ListOfCountry = new ArrayList<>();
    }

    public static CountryRepository countryRepository() {
        if (CountryRepo == null)
            CountryRepo = new CountryRepository();
            return CountryRepo;
    }

    public Country create(Country country) {
        this.ListOfCountry.add(country);
        return country;
    }

    public Optional<Country> read(String id) {
        return this.ListOfCountry.stream().filter(country -> country.getId().equalsIgnoreCase(id)).findFirst();
    }

    public Country update(Country country) {
        Optional<Country> read = read(country.getId());
            if (read.isPresent()) {
                delete(read.get());
                create(country);
            }
        return country;
    }

    public void delete (Country country) {
        this.ListOfCountry.remove(country);
    }

    public List<Country> findAll() {
        return this.ListOfCountry;
    }

}
