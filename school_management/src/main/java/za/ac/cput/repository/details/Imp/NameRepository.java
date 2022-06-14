/*
 * Name       : Chante Lee Davids
 * Student num: 220246688
 * Description: Responsible for CRUD into a data store
 * */

package za.ac.cput.repository.details.Imp;

import za.ac.cput.domain.details.Name;
import za.ac.cput.factory.details.NameFactory;
import za.ac.cput.repository.details.Interfaces.INameRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class NameRepository implements INameRepository {
    private final List<Name> nameList;
    private static NameRepository NAME_REPOSITORY;

    private NameRepository(){
        this.nameList = new ArrayList<>();
    }

    public static NameRepository nameRepository(){
        if(NAME_REPOSITORY == null)
            NAME_REPOSITORY = new NameRepository();
        return NAME_REPOSITORY;
    }

    //Create and Update
    @Override
    public Name save(Name name) {
        Name.NameId nameId = NameFactory.buildId(name);
        Optional<Name> read = read(nameId);
        if(read.isPresent()){
            delete(read.get());
        }
        this.nameList.add(name);
        return name;
    }

    //Read
    @Override
    public Optional<Name> read(Name.NameId nameId) {

        return this.nameList.stream().filter(name -> name.getFirstName().equalsIgnoreCase(nameId.getFirstName()))
                .filter(name -> name.getMiddleName().equalsIgnoreCase(nameId.getMiddleName()))
                .filter(name -> name.getLastName().equalsIgnoreCase(nameId.getLastName()))
                .findFirst();
    }

    //Delete

    @Override
    public void delete(Name name) {
        this.nameList.remove(name);
    }

    //GetAll
    @Override
    public List<Name> findAll() {
        return this.nameList;
    }
}
