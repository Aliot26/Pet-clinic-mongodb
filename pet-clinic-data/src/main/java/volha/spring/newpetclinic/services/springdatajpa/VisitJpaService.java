package volha.spring.newpetclinic.services.springdatajpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
import volha.spring.newpetclinic.model.Visit;
import volha.spring.newpetclinic.repositories.VisitRepository;
import volha.spring.newpetclinic.services.VisitService;

import java.util.List;

/*
 *Created by olga on 24.04.2020
 */
@Service
@Profile("springdatajpa")
public class VisitJpaService implements VisitService {
    private final VisitRepository visitRepository;
    @Autowired
    public VisitJpaService(VisitRepository visitRepository) {
        this.visitRepository = visitRepository;
    }

    @Override
    public List<Visit> findAll() {
        return visitRepository.findAll();
    }

    @Override
    public Visit findById(Long aLong) {
        return visitRepository.findById(aLong).orElse(null);
    }

    @Override
    public Visit save(Visit visit) {
        return visitRepository.save(visit);
    }

    @Override
    public void delete(Visit visit) {
        visitRepository.delete(visit);
    }

    @Override
    public void deleteById(Long aLong) {
        visitRepository.deleteById(aLong);
    }
}
