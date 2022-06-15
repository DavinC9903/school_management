package za.ac.cput.repository.details.Impl;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import za.ac.cput.domain.details.City;
import za.ac.cput.factory.details.CityFactory;
import za.ac.cput.repository.details.Imp.CityRepositoryImpl;
import za.ac.cput.repository.details.Interfaces.CityRepository;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

class CityRepositoryImplTest {
    private City city;
    private CityRepository repository;

    @BeforeEach void setUp(){
        this.city = CityFactory.build("test-id", "test-city");
        this.repository = CityRepositoryImpl.cityRepository();
        City saved = this.repository.save(this.city);
        assertSame(this.city, saved);
    }
    @AfterEach void tearDown(){
        this.repository.delete(this.city);
       List<City> cityList = this.repository.findAll();
        assertEquals(0, cityList.size());
    }


    @Test
    void read() {
        Optional<City> read = this.repository.read(this.city.getId());
        assertTrue(read.isPresent());
        assertSame(this.city, read.get());
    }


    @Test
    void findAll() {
        List<City> cityList = this.repository.findAll();
        assertEquals(1, cityList.size());
    }
}