/*  Davin Carstens 220021333
*/
package za.ac.cput.factory.users;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import za.ac.cput.domain.users.Employee;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeFactoryTest {


    @Test
    void buildWithSuccess() {
        Employee employee = EmployeeFactory.build("213345", "Davin", "davincarstens@gmail.com");
        System.out.println(employee );
        assertNotNull(employee);
    }

    @Test
    void buildWithError() {
        Exception exception = assertThrows(IllegalArgumentException.class,
                ()-> EmployeeFactory.build("213345", "Davin", null));
        String exceptionMessage = exception.getMessage();
        System.out.println(exceptionMessage);
        assertSame("User email is required", exceptionMessage);
    }
}