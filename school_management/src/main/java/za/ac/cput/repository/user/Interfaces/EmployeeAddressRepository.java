/*  Davin Carstens 220021333
 */
package za.ac.cput.repository.user.Interfaces;

import za.ac.cput.domain.users.EmployeeAddress;
import za.ac.cput.repository.IRepository;

import java.util.List;
import java.util.Optional;

public interface EmployeeAddressRepository extends IRepository<EmployeeAddress, String> {

    List<EmployeeAddress> readAll();
}
