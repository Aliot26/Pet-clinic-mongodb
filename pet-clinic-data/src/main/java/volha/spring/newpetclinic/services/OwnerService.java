package volha.spring.newpetclinic.services;

import volha.spring.newpetclinic.model.Owner;

import java.util.List;

/*
 *Created by olga on 15.04.2020
 */
public interface OwnerService extends CrudService<Owner, Long> {
    Owner findByLastName(String lastName);

    List<Owner> findAllByLastNameLike(String lastName);
}
