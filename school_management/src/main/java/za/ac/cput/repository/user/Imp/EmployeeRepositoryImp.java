/*  Davin Carstens 220021333
 */
package za.ac.cput.repository.user.Imp;

import org.springframework.stereotype.Repository;
import za.ac.cput.domain.users.Employee;
import za.ac.cput.factory.users.EmployeeFactory;
import za.ac.cput.repository.user.Interfaces.EmployeeRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
@Repository
public class EmployeeRepositoryImp implements EmployeeRepository {

    private final List<Employee> employeeList;
    private EmployeeRepositoryImp() {
        this.employeeList = new ArrayList<>();
    }

    @Override
    public Optional<Employee> read(String staffId) {
        return this.employeeList.stream()
                .filter(s -> s.getStaffId().equalsIgnoreCase(staffId))
                .findFirst();
    }

    @Override
    public Employee save(Employee employee) {
        Optional<Employee> read = read(employee.getStaffId());
        if(read.isPresent())
        {
            delete(read.get());
        }
        this.employeeList.add(employee);
        return employee;
    }

    @Override
    public void delete(Employee employee) {
        this.employeeList.remove(employee);
    }

    @Override
    public List<Employee> readAll() {
        return this.employeeList;
    }
}
