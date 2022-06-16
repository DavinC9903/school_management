package za.ac.cput.service.user.Interfaces;

import za.ac.cput.domain.users.Student;
import za.ac.cput.domain.users.StudentAddress;
import za.ac.cput.service.IService;

import java.util.List;

public interface StudentAddressIServices extends IService<StudentAddress, String>
{
    List<StudentAddress> findAll();
}
