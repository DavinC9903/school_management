package za.ac.cput.service.user.Imp;

import org.springframework.stereotype.Service;
import za.ac.cput.domain.users.Student;
import za.ac.cput.repository.user.Imp.StudentRepository;
import za.ac.cput.service.user.Interfaces.StudentIServices;

import java.util.List;
import java.util.Optional;

@Service
public class StudentImp implements StudentIServices
{
    private final StudentRepository studentRepository;

    public StudentImp(StudentRepository studentRepository)
    {
        this.studentRepository = studentRepository;
    }


    @Override
    public Student save(Student student)
    {
        return this.studentRepository.save(student);
    }

    @Override
    public Optional<Student> read(String studentId)
    {
        return this.studentRepository.read(studentId);
    }

    @Override
    public void delete(Student student)
    {
        this.studentRepository.delete(student);
    }

    @Override
    public List<Student> findAll()
    {
        return this.studentRepository.findAll();
    }
}
