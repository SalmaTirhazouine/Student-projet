package com.example.student;

import com.example.student.dao.entities.Student;
import com.example.student.dao.repositories.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class StudentApplication {
    @Autowired
    private StudentRepository studentRepository;
    public static void main(String[] args) {
        SpringApplication.run(StudentApplication.class, args);
    }


    @Bean
    CommandLineRunner start() {
        return args -> {
            List<Student> students = List.of(
                    Student.builder()
                            .name("Salma")
                            .email("salma@gmail.com")
                            .dateNaissance("2001/06/11")
                            .build(),
                    Student.builder()
                            .name("Chaimae")
                            .email("chaimae@gmail.com")
                            .dateNaissance("2003/03/03")
                            .build(),
                    Student.builder()
                            .name("Ilyasse")
                            .email("ilyasse@gmail.com")
                            .dateNaissance("2008/09/12")
                            .build(),
                    Student.builder()
                            .name("Moaad")
                            .email("moaad@gmail.com")
                            .dateNaissance("2009/09/21")
                            .build()
            );
            studentRepository.saveAll(students);
        };
    }
}
