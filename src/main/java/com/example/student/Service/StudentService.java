package com.example.student.Service;

import com.example.student.dto.StudentDTO;

import java.time.LocalDate;
import java.util.List;

public interface StudentService {

    public StudentDTO saveStudent(StudentDTO studentDto);

    public List<StudentDTO> getStudentByDateNaissance(String dateNaissance);

}
