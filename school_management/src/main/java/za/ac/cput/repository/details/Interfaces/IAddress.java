//This is an interface for the address entity
package za.ac.cput.repository.details.Interfaces;
import za.ac.cput.domain.details.Address;
import za.ac.cput.repository.IRepository;

import java.util.List;

/**
 * @author Chuma Nxazonke
 * Student number: 219181187
 * Date: 13 June 2022
 */

public interface IAddress extends IRepository<Address, String> {

    //Perform certain crud operations
    List<Address> findAll();
}
