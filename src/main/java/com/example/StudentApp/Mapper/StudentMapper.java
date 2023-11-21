package com.example.StudentApp.Mapper;

import com.example.StudentApp.Dto.StudentRequestDto;
import com.example.StudentApp.Dto.StudentResponseDto;
import com.example.StudentApp.Entities.Student;
import org.springframework.stereotype.Component;

@Component
public class StudentMapper implements StudentMapperInterface{
    @Override
    public Student studentReqToStudent(StudentRequestDto studentRequestDto) {
        Student s = new Student();
        s.setFirstName(studentRequestDto.getFirstName());
        s.setLastName(studentRequestDto.getLastName());
        s.setLevel(studentRequestDto.getLevel());

        return  s;
    }

    @Override
    public StudentResponseDto studentToStudentRes(Student student) {
        StudentResponseDto studentResponseDto = new StudentResponseDto();
        studentResponseDto.setStudentId(student.getStudentId());
        studentResponseDto.setFirstName(student.getFirstName());
        studentResponseDto.setLastName(student.getLastName());
        studentResponseDto.setLevel(student.getLevel());

        return studentResponseDto;
    }
}
