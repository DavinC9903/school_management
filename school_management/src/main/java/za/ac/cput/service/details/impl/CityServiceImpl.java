package za.ac.cput.service.details.impl;

import za.ac.cput.domain.details.City;
import za.ac.cput.repository.details.Iterfaces.CityRepository;
import za.ac.cput.repository.details.Impl.CityRepositoryImpl;
import za.ac.cput.service.details.Interfaces.CityService;
import java.util.Optional;

public class CityServiceImpl implements CityService {
    private final CityRepository repository;
    private static CityService SERVICE;

    private CityServiceImpl(){
        this.repository = CityRepositoryImpl.cityRepository();
    }

    public static CityService getService(){
        if (SERVICE == null)
            SERVICE = new CityServiceImpl();
        return SERVICE;
    }
    @Override
    public City save(City city) {
        return this.repository.save(city);
    }

    @Override
    public Optional<City> read(String s) {
        return this.repository.read(s);
    }

    @Override
    public void delete(City city) {
        this.repository.delete(city);

    }
}
