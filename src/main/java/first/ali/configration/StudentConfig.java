package first.ali.configration;

import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import first.ali.model.Students;
import first.ali.repositories.StudentsRepositories;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentsRepositories studentsRepositories){
        return args -> {
            var ali = new Students("ALI", "AMER", 20);
            var jeff = new Students("JEFF", "AMERSION", 20);
            studentsRepositories.saveAll(
               List.of(jeff,ali) );

        };
       
    }
    
}
