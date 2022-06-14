package za.ac.cput.repository.details;
import org.junit.jupiter.api.*;
import za.ac.cput.factory.details.AddressFactory;
import za.ac.cput.domain.details.Address;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Chuma Nxazonke
 * Student number: 219181187
 * Date: 13 June 2022
 */

class AddressRepositoryTest {

    private Address address;
    private AddressRepository repository;

    @BeforeEach
    void setup() {
        this.address = AddressFactory.createAddress("AD25", "Plain street", "2023", "Plain street", 8001);
        this.repository = AddressRepository.addressRepository();
        Address saved = this.repository.save(this.address);
        assertSame(this.address, saved);

        System.out.println("Data successfully saved in the database");

    }

    @AfterEach
    void tearDown(){

        this.repository.delete(this.address);
        List<Address> addressList = this.repository.findAll();
        assertEquals(0, addressList.size());

        System.out.println("Record successfully deleted the information");

    }

@Test
    void read(){
    Optional<Address> read = this.repository.read(this.address.getUnitNumber());
    assertTrue(read.isPresent());
    assertSame(this.address, read.get());
}

@Test
    void findAll(){
        List<Address> addressList = this.repository.findAll();
        assertEquals(1, addressList.size());
}

}