package za.ac.cput.repository;

import java.util.Optional;

/**
 * @author Chuma Nxazonke
 * Student number: 219181187
 * Date: 13 June 2022
 */

public interface IRepository<T, ID> {

    T save (T t);
    Optional<T> read(ID id);
    void delete(T t);
}

