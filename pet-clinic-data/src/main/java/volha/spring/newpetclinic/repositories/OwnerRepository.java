package volha.spring.newpetclinic.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import volha.spring.newpetclinic.model.Owner;

import java.util.List;

/*
 *Created by olga on 22.04.2020
 */
public interface OwnerRepository extends MongoRepository<Owner, Long> {
    Owner findByLastName(String lastName);
    List<Owner> findAllByLastNameLike(String lastName);
}
