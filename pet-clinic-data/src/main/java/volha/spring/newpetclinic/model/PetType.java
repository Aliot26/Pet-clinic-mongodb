package volha.spring.newpetclinic.model;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.Entity;
import javax.persistence.Id;

/*
 *Created by olga on 13.04.2020
 */
@Setter
@Getter
@NoArgsConstructor
@Entity
@Document(collection = "pettype")
public class PetType{
    @Id
    private Long id;

    private String name;

    @Builder
    public PetType(Long id, String name){
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return  name;
    }
}
