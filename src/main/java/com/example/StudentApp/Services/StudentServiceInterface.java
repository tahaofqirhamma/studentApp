package com.example.StudentApp.Services;

import com.example.StudentApp.Dto.StudentRequestDto;
import com.example.StudentApp.Dto.StudentResponseDto;

import java.util.List;

public interface StudentServiceInterface {
    public List<StudentResponseDto> getAllStudents();
    public StudentResponseDto getStudent(Integer id);
    public void addStudent(StudentRequestDto studentRequestDto);
    public void updateStudent(Integer id, StudentRequestDto studentRequestDto);
    public  void deleteStudent(Integer id);
}
