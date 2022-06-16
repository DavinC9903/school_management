package za.ac.cput.repository.details.Imp;

//This is a worker class for Address entity under repository package.
//In this class we will be performing CRUD operations
//This is a AddressRepository.Java

import java.util.*;
import za.ac.cput.domain.details.Address;
import za.ac.cput.repository.details.Interfaces.IAddress;

/**
 * @author Chuma Nxazonke
 * Student number: 219181187
 * Date: 13 June 2022
 */


public class AddressRepository implements IAddress {

private final List<Address> addressList;

private static AddressRepository AddressRepo;

private AddressRepository (){
    this.addressList = new ArrayList();
}

public static AddressRepository addressRepository(){
    if (AddressRepo == null)
        AddressRepo = new AddressRepository();
    return AddressRepo;
}

public Address save (Address address){
    Optional<Address> read = read(address.getUnitNumber());
    if(read.isPresent()){
        delete(read.get());
    }

    this.addressList.add(address);
    return address;
}

public Optional<Address> read (String unitNumber){
    return this.addressList.stream().filter(c -> c.getUnitNumber().equalsIgnoreCase(unitNumber)).findAny();

}

public void delete(Address address){
    this.addressList.remove(address);
}

public List<Address> findAll(){
    return this.addressList;
}


}
