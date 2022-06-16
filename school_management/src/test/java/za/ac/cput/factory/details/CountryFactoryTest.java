package za.ac.cput.factory.details;
/**
 * Name - Onele Tomson
 * Student number - 219483280
 * CountryFactoryTest
 * Date: 13 June 2022
 */
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import za.ac.cput.domain.details.Country;
import za.ac.cput.factory.details.CountryFactory;


class CountryFactoryTest {

    @Test
    public void build() {
        Country country = CountryFactory.build("219483280", "South Africa");
        System.out.println(country);
        assertNotNull(country);
    }
}
   /** @Test public void buildError() {
       Exception exception=assertThrows(IllegalArgumentException.class, () ->
               CountryFactory.build(id: null, name: "South Africa"));

                String exceptionMessage = exception.getMessage();
                assertSame(expected: "Please enter Country id", exceptionMessage);
   }

}*/