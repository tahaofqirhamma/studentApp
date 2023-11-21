package com.example.StudentApp.Services;

import com.example.StudentApp.Dto.StudentRequestDto;
import com.example.StudentApp.Dto.StudentResponseDto;
import com.example.StudentApp.Entities.Student;
import com.example.StudentApp.Mapper.StudentMapperInterface;
import com.example.StudentApp.Repositories.StudentRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@Transactional
public class StudentService implements StudentServiceInterface {
    @Autowired
    StudentRepository studentRepository;
    @Autowired
    StudentMapperInterface studentMapperInterface;

    @Override
    public List<StudentResponseDto> getAllStudents() {
        List<Student> stds = new ArrayList<>();
        stds = studentRepository.findAll();
        List<StudentResponseDto> allStudents = new ArrayList<>();
        for(Student s:stds){
            allStudents.add(studentMapperInterface.studentToStudentRes(s));
        }
        return allStudents;
    }

    @Override
    public StudentResponseDto getStudent(Integer id) {
        Student student = studentRepository.findById(id).get();
        return studentMapperInterface.studentToStudentRes(student);
    }

    @Override
    public void addStudent(StudentRequestDto studentRequestDto) {
        Student student = studentMapperInterface.studentReqToStudent(studentRequestDto);
        studentRepository.save(student);
    }

    @Override
    public void updateStudent(Integer id, StudentRequestDto studentRequestDto) {
        Student student = studentRepository.findById(id).get();
        if(studentRequestDto.getFirstName() != null) student.setFirstName(studentRequestDto.getFirstName());
        if(studentRequestDto.getLastName() != null) student.setLastName(studentRequestDto.getLastName());
        if(studentRequestDto.getLevel() != null) student.setLevel(studentRequestDto.getLevel());
        studentRepository.save(student);

    }

    @Override
    public void deleteStudent(Integer id) {
        studentRepository.deleteById(id);

    }
}
