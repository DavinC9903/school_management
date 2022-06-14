/*  Davin Carstens 220021333
 */
package za.ac.cput.repository.user.Interfaces;

import za.ac.cput.domain.users.Employee;
import za.ac.cput.repository.IRepository;

import java.util.List;

public interface EmployeeRepository extends IRepository<Employee, String> {

    List<Employee> readAll();

}
