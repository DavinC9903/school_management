package za.ac.cput.service.user.Imp;

import org.springframework.stereotype.Service;
import za.ac.cput.domain.users.StudentAddress;
import za.ac.cput.repository.user.Imp.StudentAddressRepository;
import za.ac.cput.service.user.Interfaces.StudentAddressIServices;

import java.util.List;
import java.util.Optional;

@Service
public class StudentAddressImp implements StudentAddressIServices
{
    private final StudentAddressRepository studentAddressRepository;

    public StudentAddressImp(StudentAddressRepository studentAddressRepository)
    {
        this.studentAddressRepository = studentAddressRepository;
    }


    @Override
    public StudentAddress save(StudentAddress studentAddress)
    {
        return this.studentAddressRepository.save(studentAddress);
    }

    @Override
    public Optional<StudentAddress> read(String studentId)
    {
        return this.studentAddressRepository.read(studentId);
    }

    @Override
    public void delete(StudentAddress studentAddress)
    {
        this.studentAddressRepository.delete(studentAddress);
    }

    @Override
    public List<StudentAddress> findAll() {
        return this.studentAddressRepository.findAll();
    }
}
