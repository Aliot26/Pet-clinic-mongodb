package volha.spring.newpetclinic;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})
public class NewPetClinicApplication {

    public static void main(String[] args) {
        SpringApplication.run(NewPetClinicApplication.class, args);
    }

}
