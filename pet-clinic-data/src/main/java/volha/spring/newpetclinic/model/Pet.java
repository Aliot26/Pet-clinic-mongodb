package volha.spring.newpetclinic.model;


import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.TypeAlias;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

/*
 *Created by olga on 13.04.2020
 */
@Setter
@Getter
@NoArgsConstructor
@Entity
@Document(collection = "pets")
@TypeAlias("pet")
public class Pet{
    @Id
    private Long id;

    private String name;

    @DBRef
    private PetType petType;

    @DBRef
    private Owner owner;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate birthDate;

    @DBRef
    private Set<Visit> visits = new HashSet<>();

    @Builder
    public Pet(Long id, String name, PetType petType, Owner owner, LocalDate birthDate, Set<Visit> visits) {
        this.id = id;
        this.name = name;
        this.petType = petType;
        this.owner = owner;
        this.birthDate = birthDate;
        if (visits == null || visits.size() > 0) {
            this.visits = visits;
        }
    }
    public boolean isNew(){
        return this.id == null;
    }
}
