package za.ac.cput.repository.user.Imp;

import za.ac.cput.domain.users.Student;
import za.ac.cput.repository.user.Interfaces.studentIRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


public class StudentRepository implements studentIRepository
{
    private final List<Student> studentList;
    public static StudentRepository studentRepository;

    private StudentRepository(){ this.studentList = new ArrayList<>();}

    public static StudentRepository getStudentRepository()
    {
        if(studentRepository == null)
            studentRepository = new StudentRepository();
        return studentRepository;
    }

    @Override
    public Student save(Student student)
    {
        Optional<Student> read = read(student.getStudentId());
        if(read.isPresent())
            delete(student);
        this.studentList.add(student);
        return student;
    }

    @Override
    public Optional<Student> read(String studentId)
    {
        return this.studentList.stream()
                .filter(e -> e.getStudentId().equalsIgnoreCase(studentId))
                .findFirst();
    }

    @Override
    public void delete(Student student)
    {
        this.studentList.remove(student);
    }

    @Override
    public List<Student> findAll(){return this.studentList;}
}


