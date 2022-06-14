/*  Davin Carstens 220021333
 */
package za.ac.cput.repository.user.Imp;

import za.ac.cput.domain.users.Employee;
import za.ac.cput.domain.users.EmployeeAddress;
import za.ac.cput.factory.users.EmployeeAddressFactory;
import za.ac.cput.repository.user.Interfaces.EmployeeAddressRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class EmployeeAddressRepositoryImp implements EmployeeAddressRepository {

    private final List<EmployeeAddress> employeeAddressList;
    private EmployeeAddressRepositoryImp(){
        this.employeeAddressList = new ArrayList<>();
    }

    @Override
    public Optional<EmployeeAddress> read(String staffId) {
        return this.employeeAddressList.stream()
                .filter(s -> s.getStaffId().equalsIgnoreCase(staffId))
                .findFirst();
    }

    @Override
    public EmployeeAddress save(EmployeeAddress employeeAddress) {
        Optional<EmployeeAddress> read = read(employeeAddress.getStaffId());
        if(read.isPresent())
        {
            delete(read.get());
        }
        this.employeeAddressList.add(employeeAddress);
        return employeeAddress;
    }

    @Override
    public void delete(EmployeeAddress employeeAddress) {
        this.employeeAddressList.remove(employeeAddress);
    }

    @Override
    public List<EmployeeAddress> readAll() {
        return this.employeeAddressList;
    }
}
