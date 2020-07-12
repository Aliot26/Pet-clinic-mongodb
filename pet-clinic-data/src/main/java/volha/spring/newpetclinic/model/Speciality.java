package volha.spring.newpetclinic.model;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.Entity;
import javax.persistence.Id;

/*
 *Created by olga on 17.04.2020
 */
@Setter
@Getter
@NoArgsConstructor
@Entity
@Document(collection = "speciality")
public class Speciality{
    @Id
    private Long id;

    private String description;

    @Builder
    public Speciality(Long id, String description) {
        this.id = id;
        this.description = description;
    }
}
