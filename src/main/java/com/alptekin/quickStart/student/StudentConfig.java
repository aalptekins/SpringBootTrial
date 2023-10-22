package com.alptekin.quickStart.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository studentRepository) {
        return args -> {
            Student abdu = new Student(
                    "Abdurrahman ALptekin",
                    "alptekin1137@gmail.com",
                    LocalDate.of(1998, Month.SEPTEMBER, 12));

            Student ali = new Student(
                    "Ali Elmas",
                    "elmasali@gmail.com",
                    LocalDate.of(1968, Month.SEPTEMBER, 12));

            studentRepository.saveAll(List.of(abdu,ali));

        };
    }
}
