package com.example.StudentApp.Repositories;

import com.example.StudentApp.Entities.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.webmvc.RepositoryRestController;
import org.springframework.stereotype.Repository;

@Repository
@RepositoryRestController
public interface StudentRepository extends JpaRepository<Student, Integer> {
}
