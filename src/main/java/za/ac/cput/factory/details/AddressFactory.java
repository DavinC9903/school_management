//This is a worker class for  Address entity under factory package.
//In this class will implement an entity called Address using a factory pattern.
//This is AddressFactory
package za.ac.cput.factory.details;
import za.ac.cput.domain.details.City;

/**
 * @author Chuma Nxazonke
 * Date: 10 June 2022
 * Student number: 219181187
 */
import za.ac.cput.domain.details.Address;
import za.ac.cput.util.StringHelper;
public class AddressFactory {

public static Address createAddress (String unitNumber,String complexName,String streetNumber, String streetName, int postalCode) {

    if (StringHelper.isEmptyOrNull(streetNumber))
    throw new IllegalArgumentException("Street number is required");

    if(StringHelper.isEmptyOrNull(streetName))
    throw new IllegalArgumentException("Street name is required");

   if(StringHelper.isEmptyOrNull(complexName))
    throw new IllegalArgumentException("Complex name is required");

  if (StringHelper.isEmptyOrNull(unitNumber))
        throw new IllegalArgumentException("Unit number is required");

        Address address = new Address.Builder().UnitNumber(unitNumber)
                .ComplexName(complexName)
                .StreetNumber(streetNumber)
                .StreetName(streetName)
                .PostalCode(postalCode)
                .build();

        return address;

    }

}


