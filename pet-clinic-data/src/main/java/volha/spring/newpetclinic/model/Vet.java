package volha.spring.newpetclinic.model;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.TypeAlias;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.Entity;
import java.util.HashSet;
import java.util.Set;

/*
 *Created by olga on 13.04.2020
 */
@Setter
@Getter
@NoArgsConstructor
@Entity
@Document(collection = "persons")
@TypeAlias("vet")
public class Vet extends Person {


    @DBRef
    private Set<Speciality> specialities = new HashSet<>();

    @Builder
    public Vet(Long id, String firstName, String lastName, Set<Speciality> specialities){
        super(id, firstName, lastName);
        this.specialities = specialities;
    }

    public int getNumberSpecialities(){
        return specialities.size();
    }

}
