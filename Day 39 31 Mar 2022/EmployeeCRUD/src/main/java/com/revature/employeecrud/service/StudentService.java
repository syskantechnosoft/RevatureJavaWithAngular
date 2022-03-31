package com.revature.employeecrud.service;

import java.util.List;

import com.revature.employeecrud.model.Student;

public interface StudentService {

	public List<Student> findAll();

	public Student findById(int id);

	public void add(Student student);

	public void update(int id, Student student);

	public void deleteById(int id);

}
