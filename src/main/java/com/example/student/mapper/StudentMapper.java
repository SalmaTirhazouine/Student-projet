package com.example.student.mapper;

import com.example.student.dao.entities.Student;
import com.example.student.dto.StudentDTO;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class StudentMapper {

    private final ModelMapper mapper = new ModelMapper();
    public Student fromStudentDtoToStudent(StudentDTO studentDto){
        return mapper.map(studentDto, Student.class);
    }

    public StudentDTO fromStudentToStudentDto(Student student){
        return mapper.map(student, StudentDTO.class);
    }

}

