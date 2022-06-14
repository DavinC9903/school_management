package za.ac.cput.service;

import java.util.Optional;

public interface IService<T, ID> {
    Optional<T> read(ID id);
    T save(T t);
    void delete(T t);
}
