/*  Davin Carstens 220021333
 */
package za.ac.cput.factory.users;

import za.ac.cput.domain.users.Employee;
import za.ac.cput.util.StringHelper;

public class EmployeeFactory {

    public static Employee build(String staffId, String name, String email){
        staffId = StringHelper.setEmptyIfNull(staffId);
        name = StringHelper.setEmptyIfNull(name);
        email = StringHelper.setEmptyIfNull(email);
        return new Employee.Builder()
                .setStaffId(staffId)
                .setName(name)
                .setEmail(email)
                .build();
    }
}
