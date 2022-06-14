package za.ac.cput.factory.details.Impl;

import org.junit.jupiter.api.Test;
import za.ac.cput.domain.details.City;
import za.ac.cput.factory.details.CityFactory;

import static org.junit.jupiter.api.Assertions.*;

class CityFactoryTest {

    @Test public void buildWithSuccess(){
        City city = CityFactory.build("hjhbjhbjhvbv","Cape Town");
        System.out.println(city);
        assertNotNull(city);
    }
    /*@Test public void buildWithError(){
        Exception exception = assertThrows(IllegalArgumentException.class, () ->
                CityFactory.build(null,"Cape Town"));

        String exceptionMessage = exception.getMessage();
        assertSame("id and/or name is required", exceptionMessage);
    }*/


}