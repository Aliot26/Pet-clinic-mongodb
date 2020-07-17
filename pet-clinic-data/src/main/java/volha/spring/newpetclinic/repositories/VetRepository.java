package volha.spring.newpetclinic.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import volha.spring.newpetclinic.model.Vet;

/*
 *Created by olga on 22.04.2020
 */
@Repository
public interface VetRepository extends MongoRepository<Vet, Long> {

}
