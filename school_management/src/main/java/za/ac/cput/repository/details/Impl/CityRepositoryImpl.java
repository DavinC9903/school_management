package za.ac.cput.repository.details.Impl;

import za.ac.cput.domain.details.City;
import za.ac.cput.repository.details.Iterfaces.CityRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


public class CityRepositoryImpl implements CityRepository{
    private final List<City> cityList;
    private static CityRepositoryImpl CITY_REPOSITORY;

    private CityRepositoryImpl(){
        this.cityList = new ArrayList<>();
    }

    public static CityRepositoryImpl cityRepository(){
        if (CITY_REPOSITORY == null)
            CITY_REPOSITORY = new CityRepositoryImpl();
        return CITY_REPOSITORY;
    }
    public City save(City city){
        Optional<City> read = read(city.getId());
        if(read.isPresent()){
            delete(read.get());
        }
        this.cityList.add(city);
        return city;
    }
    public Optional<City> read(String id){
        return this.cityList.stream().filter(c -> c.getId().equalsIgnoreCase(id)).findFirst();
    }

    public void delete(City city){
        this.cityList.remove(city);
    }

    public List<City> findAll(){
        return this.cityList;
    }
}
