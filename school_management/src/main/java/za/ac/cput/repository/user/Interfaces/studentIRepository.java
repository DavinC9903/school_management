package za.ac.cput.repository.user.Interfaces;

import za.ac.cput.domain.users.Student;
import za.ac.cput.repository.IRepository;

import java.util.List;

public interface studentIRepository extends IRepository<Student, String>
{
    List<Student> findAll();
}
