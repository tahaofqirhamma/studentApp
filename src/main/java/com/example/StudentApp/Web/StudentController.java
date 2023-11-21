package com.example.StudentApp.Web;

import com.example.StudentApp.Dto.StudentRequestDto;
import com.example.StudentApp.Dto.StudentResponseDto;
import com.example.StudentApp.Services.StudentServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class StudentController {
    @Autowired
    StudentServiceInterface studentServiceInterface;

    @GetMapping("/students")
    public List<StudentResponseDto> getAllStudents(){
      return studentServiceInterface.getAllStudents();
    }

    @GetMapping("/students/{id}")
    public StudentResponseDto getStudent(@PathVariable("id") Integer id){
        return studentServiceInterface.getStudent(id);
    }

    @PostMapping("/students")
    public void addStudent(@RequestBody StudentRequestDto studentRequestDto){
        studentServiceInterface.addStudent(studentRequestDto);
    }

    @PutMapping("/students/{id}")
    public void updateStudent(@PathVariable("id") Integer id, @RequestBody StudentRequestDto studentRequestDto){
        studentServiceInterface.updateStudent(id, studentRequestDto);
    }

    @DeleteMapping("/students/{id}")
    public void deleteStudent(@PathVariable("id") Integer id){
        studentServiceInterface.deleteStudent(id);
    }

}
