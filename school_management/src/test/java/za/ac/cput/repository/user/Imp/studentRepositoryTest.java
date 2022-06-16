package za.ac.cput.repository.user.Imp;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import za.ac.cput.domain.details.Name;
import za.ac.cput.domain.users.Student;
import za.ac.cput.factory.details.NameFactory;
import za.ac.cput.factory.users.studentFactory;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

class studentRepositoryTest
{
    private Name name;
    private Student student;
    private StudentRepository studentRepository;

    @BeforeEach
    void setUp()
    {
        this.name = NameFactory.build("Duncan",
                "Benjamin"
                ,"Harris");
        this.student = studentFactory.build("220110530",
                "dummyEmail@gmail.com"
                ,name);
        this.studentRepository = StudentRepository.getStudentRepository();
        Student saved = this.studentRepository.save(student);
        assertSame(student, saved);
    }

    @AfterEach
    void tearDown()
    {
        this.studentRepository.delete(student);
        List<Student> studentList = this.studentRepository.findAll();
        assertEquals(0, studentList.size());
    }

    @Test
    void read()
    {
        Optional<Student> read = this.studentRepository.read(this.student.getStudentId());
        assertAll
                (
                        () -> assertTrue(read.isPresent()),
                        () -> assertEquals(this.student, read.get())
                );

    }

    @Test
    void readAll()
    {
        this.studentRepository.save(this.student);
        List<Student> studentList = this.studentRepository.findAll();
        assertEquals(1, studentList.size());
    }
}