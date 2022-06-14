package za.ac.cput.repository;

import java.util.Optional;

public interface IRepository<T, ID> {
    Optional<T> read(ID id);
    T save(T t);
    void delete(T t);
}

