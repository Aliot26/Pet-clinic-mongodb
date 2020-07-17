package volha.spring.newpetclinic.services.springdatajpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
import volha.spring.newpetclinic.model.Pet;
import volha.spring.newpetclinic.repositories.PetRepository;
import volha.spring.newpetclinic.services.PetService;

import java.util.List;

/*
 *Created by olga on 22.04.2020
 */
@Service
@Profile("springdatajpa")
public class PetJpaService implements PetService {
    private final PetRepository petRepository;

    @Autowired
    public PetJpaService(PetRepository petRepository) {
        this.petRepository = petRepository;
    }

    @Override
    public List<Pet> findAll() {
        return petRepository.findAll();
    }

    @Override
    public Pet findById(Long aLong) {
        return petRepository.findById(aLong).orElse(null);
    }

    @Override
    public Pet save(Pet object) {
        return petRepository.save(object);
    }

    @Override
    public void delete(Pet object) {
        petRepository.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        petRepository.deleteById(aLong);
    }
}
