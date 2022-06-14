package za.ac.cput.repository.user.Imp;

import za.ac.cput.domain.user.StudentAddress;
import za.ac.cput.repository.user.Interfaces.studentAddressIRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class studentAddressRepository implements studentAddressIRepository
{
    private final List<StudentAddress> studentAddressList;
    public static studentAddressRepository studentAddressRepository;

    private studentAddressRepository(){this.studentAddressList = new ArrayList<>();}

    public static studentAddressRepository getStudentAddressRepository()
    {
        if(studentAddressRepository == null)
            studentAddressRepository = new studentAddressRepository();
        return studentAddressRepository;
    }

    @Override
    public StudentAddress save(StudentAddress studentAddress)
    {
        Optional<StudentAddress> read = read(studentAddress.getStudentId());
        if(read.isPresent())
            delete(studentAddress);
        this.studentAddressList.add(studentAddress);
        return studentAddress;
    }

    @Override
    public Optional<StudentAddress> read(String studentId) {
        return this.studentAddressList.stream()
                .filter(e -> e.getStudentId().equalsIgnoreCase(studentId))
                .findFirst();
    }

    @Override
    public void delete(StudentAddress studentAddress)
    {
        this.studentAddressList.remove(studentAddress);
    }
}
