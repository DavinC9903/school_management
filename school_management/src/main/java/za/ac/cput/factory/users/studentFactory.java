package za.ac.cput.factory.users;

import za.ac.cput.domain.details.Name;
import za.ac.cput.domain.users.Student;
import za.ac.cput.util.StringHelper;

public class studentFactory
{
    public static Student build(String studentId, String email, Name name)
    {
        StringHelper.checkStringParam("studentId", studentId);
        StringHelper.checkStringParam("email", email);
        return new Student.Builder()
                .setStudentId(studentId)
                .setEmail(email)
                .setName(name)
                .build();
    }
}
