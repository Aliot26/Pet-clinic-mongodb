package volha.spring.newpetclinic.model;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/*
 *Created by olga on 13.04.2020
 */
@Setter
@Getter
@NoArgsConstructor
@Document(collection = "vet")
public class Vet implements Serializable {
    @Id
    private Long id;

    private String firstName;

    private String lastName;


    private List<Speciality> specialities;

    @Builder
    public Vet(Long id, String firstName, String lastName, List<Speciality> specialities){
        this.id = id;
        this.firstName = firstName;
        this.lastName =lastName;
        this.specialities = new ArrayList<>();
        this.specialities = specialities;
    }

    public int getNumberSpecialities(){
        return specialities.size();
    }

    @Override
    public String toString() {
        return "Vet{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", specialities=" + specialities +
                '}';
    }
}
