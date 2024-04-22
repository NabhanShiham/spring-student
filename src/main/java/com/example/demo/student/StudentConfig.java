package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(
            StudentRepository repository) {
        return args -> {
            Student nabhan = new Student(
                    "Nabhan",
                    "abc@gmail.com",
                    LocalDate.of(2003, Month.SEPTEMBER, 12)
            );
            Student dalissa = new Student(
                    "Dalissa",
                    "lmnop@gmail.com",
                    LocalDate.of(2004, Month.JULY, 10)
            );
            repository.saveAll(
                    List.of(nabhan, dalissa)
            );
        };
    }
}
