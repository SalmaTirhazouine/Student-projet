package com.example.student.Service;

import com.example.student.dao.entities.Student;
import com.example.student.dao.repositories.StudentRepository;
import com.example.student.dto.StudentDTO;
import com.example.student.mapper.StudentMapper;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
@Service
@AllArgsConstructor
public class StudentManager implements StudentService{
    private StudentRepository studentRepository;
    private StudentMapper studentMapper;

    @Override
    public StudentDTO saveStudent(StudentDTO studentDto) {
        Student student = studentMapper.fromStudentDtoToStudent(studentDto);
        student = studentRepository.save(student);
        studentDto = studentMapper.fromStudentToStudentDto(student);
        return studentDto;

    }

    @Override
    public List<StudentDTO> getStudentByDateNaissance(String dateNaissance) {
        return null;
    }
}
