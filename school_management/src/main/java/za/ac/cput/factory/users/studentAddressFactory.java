package za.ac.cput.factory.users;

import za.ac.cput.domain.details.Address;
import za.ac.cput.domain.users.StudentAddress;
import za.ac.cput.util.StringHelper;

public class studentAddressFactory
{
    public static StudentAddress build(String studentId, Address address)
    {
        StringHelper.checkStringParam("studentId", studentId);
        return new StudentAddress.Builder()
                .setStudentId(studentId)
                .setAddress(address)
                .build();
    }
}
