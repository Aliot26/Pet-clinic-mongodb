package volha.spring.newpetclinic.services.springdatajpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
import volha.spring.newpetclinic.model.Vet;
import volha.spring.newpetclinic.repositories.VetRepository;
import volha.spring.newpetclinic.services.VetService;

import java.util.List;

/*
 *Created by olga on 22.04.2020
 */
@Service
@Profile("springdatajpa")
public class VetJpaService implements VetService {
    @Autowired
    private VetRepository vetRepository;

    @Override
    public List<Vet> findAll() {

        return vetRepository.findAll();
    }

    @Override
    public Vet findById(Long aLong) {
        return vetRepository.findById(aLong).orElse(null);
    }

    @Override
    public Vet save(Vet object) {
        return vetRepository.save(object);
    }

    @Override
    public void delete(Vet object) {
        vetRepository.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        vetRepository.deleteById(aLong);
    }
}
