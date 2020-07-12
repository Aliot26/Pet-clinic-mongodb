package volha.spring.newpetclinic.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

/*
 *Created by olga on 13.04.2020
 */
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@MappedSuperclass
@Document(collection = "persons")
public abstract class Person{
    @Id
    private Long id;

    private String firstName;

    private String lastName;
}
