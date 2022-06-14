/*
 * Name       : Chante Lee Davids
 * Student num: 220246688
 * Description:
 * */

package za.ac.cput.repository.details.Interfaces;

import za.ac.cput.domain.details.Name;
import za.ac.cput.repository.IRepository;

import java.util.List;

public interface INameRepository extends IRepository<Name, Name.NameId> {

   List<Name> findAll();
}
