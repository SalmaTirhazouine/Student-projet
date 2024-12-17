package com.example.student.web;

import com.example.student.Service.StudentService;
import com.example.student.dto.StudentDTO;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
@AllArgsConstructor
public class StudentGraphQLController {


    private StudentService studentService;

    @MutationMapping
    public StudentDTO saveStudent(@Argument StudentDTO studentDto) {
        return studentService.saveStudent(studentDto);
    }

    @QueryMapping
    public List<StudentDTO> getStudentByDateNaissance(@Argument String dateNaissance) {
        return studentService.getStudentByDateNaissance(dateNaissance);
    }
}
