package za.ac.cput.factory.users;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import za.ac.cput.domain.details.Name;
import za.ac.cput.domain.users.Student;
import za.ac.cput.factory.details.NameFactory;

import static org.junit.jupiter.api.Assertions.*;

class studentFactoryTest
{
    private Name name;

    @Test
    void buildWithSuccess()
    {
        Name name = NameFactory.build("Duncan"
                , "Benjamin"
                , "Harris");
        assertNotNull(name);
        Student student = studentFactory.build("220110530"
                , "dummyEmail@gmail.com"
                ,name);
        System.out.println(student);
        assertNotNull(student);
    }

    @Test
    void buildWithFailure()
    {
        Name name = NameFactory.build("Duncan"
                , "Benjamin"
                , "Harris");
        Exception exception = assertThrows(IllegalArgumentException.class, () ->
                studentFactory.build(null
                        , "dummyEmail@gmail.com"
                        ,name));
        String exceptionMessage = exception.getMessage();
        System.out.println(exceptionMessage);
    }
}