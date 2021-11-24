package com.example.demoTest.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

     @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args -> {
            Student filip = new Student(
                    "Filip",
                    "filip@gmail.com",
                    LocalDate.of(1976, Month.FEBRUARY, 6)

            );
            Student janko = new Student(
                    "janko",
                    "janko@gmail.com",
                    LocalDate.of(1975, Month.FEBRUARY, 8)

            );
            repository.saveAll(
                    List.of(filip,janko)
            );
        };
    }
}
