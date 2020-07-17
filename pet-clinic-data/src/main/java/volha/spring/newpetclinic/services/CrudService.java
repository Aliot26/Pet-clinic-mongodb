package volha.spring.newpetclinic.services;

import java.util.List;

/*
 *Created by olga on 15.04.2020
 */
public interface CrudService<T, ID> {
    List<T> findAll();
    T findById(ID id);
    T save(T object);
    void delete(T object);
    void deleteById(ID id);
}
