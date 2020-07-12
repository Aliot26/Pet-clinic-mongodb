package volha.spring.newpetclinic.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import volha.spring.newpetclinic.model.Vet;

/*
 *Created by olga on 22.04.2020
 */
public interface VetRepository extends MongoRepository<Vet, Long> {
}
