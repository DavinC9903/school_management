
package za.ac.cput.factory;

import org.junit.jupiter.api.Test;
import za.ac.cput.domain.details.Address;
import za.ac.cput.factory.details.AddressFactory;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Chuma Nxazonke
 * Date: 10 June 2022
 * Student number: 219181187
 */
class AddressFactoryTest {

    @Test

    public void creatAddress() {
        Address address = AddressFactory.createAddress(
                "125B",
                "South Point",
                "23 BC Book",
                "Barack street",
                8001

        );

        System.out.println(address.toString());
        assertNotNull(address);
    }

    @Test public void creatAddressWithError(){
        Exception exception = assertThrows(IllegalArgumentException.class, () ->
                        AddressFactory
                                .createAddress(null, "Zuma complex", "256 DR","Samora Machell",8001)

                );
        String exceptionMessage = exception.getMessage();
        System.out.println(exceptionMessage);
        assertSame("Unit number is required", exceptionMessage);

    }



}