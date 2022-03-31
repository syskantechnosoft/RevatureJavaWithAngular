package com.revature.employeecrud.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.employeecrud.model.Student;
import com.revature.employeecrud.repo.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	StudentRepository studentRepository;

	@Override
	public List<Student> findAll() {
		// TODO Auto-generated method stub
		return studentRepository.findAll();
	}

	@Override
	public Student findById(int id) {
		// TODO Auto-generated method stub
		return studentRepository.getById(id);
	}

	@Override
	public void add(Student student) {
		// TODO Auto-generated method stub
		studentRepository.save(student);
	}

	@Override
	public void update(int id, Student student) {
		// TODO Auto-generated method stub
		studentRepository.save(student);
	}

	@Override
	public void deleteById(int id) {
		// TODO Auto-generated method stub
		studentRepository.deleteById(id);
	}

}
