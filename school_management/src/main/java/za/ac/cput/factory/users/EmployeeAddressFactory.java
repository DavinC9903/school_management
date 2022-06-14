/*  Davin Carstens 220021333
 */
package za.ac.cput.factory.users;

import za.ac.cput.domain.users.EmployeeAddress;
import za.ac.cput.util.StringHelper;

public class EmployeeAddressFactory {
    public static EmployeeAddress build(String staffId, String address) {
        staffId = StringHelper.setEmptyIfNull(staffId);
        address = StringHelper.setEmptyIfNull(address);
        return new EmployeeAddress.Builder()
                .setStaffId(staffId)
                .build();
    }
}
