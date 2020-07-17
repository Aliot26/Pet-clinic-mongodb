package volha.spring.newpetclinic.model;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.LocalDate;

/*
 *Created by olga on 17.04.2020
 */
@Setter
@Getter
@NoArgsConstructor
@Entity
@Document
public class Visit{
    @Id
    private Long id;

    private LocalDate date;

    private String description;

    @DBRef
    private Pet pet;

    @Builder
    public Visit(Long id, LocalDate date, String description, Pet pet){
        this.id = id;
        this.date = date;
        this.description = description;
        this.pet = pet;
    }

}
