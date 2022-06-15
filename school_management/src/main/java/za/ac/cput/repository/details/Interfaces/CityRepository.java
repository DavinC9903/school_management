package za.ac.cput.repository.details.Interfaces;

import za.ac.cput.domain.details.City;
import za.ac.cput.repository.IRepository;


import java.util.List;

public interface CityRepository extends IRepository<City, String>{
    List<City> findAll();

}
