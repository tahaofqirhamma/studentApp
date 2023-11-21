package com.example.StudentApp.Mapper;

import com.example.StudentApp.Dto.StudentRequestDto;
import com.example.StudentApp.Dto.StudentResponseDto;
import com.example.StudentApp.Entities.Student;

public interface StudentMapperInterface {

    public Student studentReqToStudent(StudentRequestDto studentRequestDto);
    public StudentResponseDto studentToStudentRes(Student student);

}
