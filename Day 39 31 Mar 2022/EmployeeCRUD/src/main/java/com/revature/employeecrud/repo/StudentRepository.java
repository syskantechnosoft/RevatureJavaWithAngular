package com.revature.employeecrud.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.revature.employeecrud.model.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {

}
