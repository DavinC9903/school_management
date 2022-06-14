/*
 * Name       : Chante Lee Davids
 * Student num: 220246688
 * Description: Responsible for testing CRUD into a data store
 * */

package za.ac.cput.repository.details.Imp;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import za.ac.cput.domain.details.Name;
import za.ac.cput.factory.details.NameFactory;
import za.ac.cput.repository.details.Imp.NameRepository;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

class NameRepositoryTest {
    private Name name;
    private Name.NameId nameId;
    private NameRepository repository;

    @BeforeEach void setUp(){
        this.name = NameFactory.build("Mary","Kate", "James");
        this.nameId = NameFactory.buildId(name);
        this.repository = NameRepository.nameRepository();

        Name saved = this.repository.save(this.name);
        assertSame(this.name, saved);
    }

    @AfterEach void tearDown(){
        this.repository.delete(this.name);
        List<Name> nameList = this.repository.findAll();
        assertEquals(0, nameList.size());
    }

    @Test
    void read() {
        Optional<Name> read = this.repository.read(nameId);
        System.out.println(read);
        assertTrue(read.isPresent());
        assertSame(this.name, read.get());
    }

    @Test
    void findAll() {
        List<Name> nameList = this.repository.findAll();
        assertEquals(1, nameList.size());
    }
}