package com.revature.employeecrud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.revature.employeecrud.model.Student;
import com.revature.employeecrud.service.StudentService;

@Controller
public class StudentController {
	
	@Autowired
	StudentService studentService;

	@RequestMapping("/")
	public String index() {
		return "index";
	}

	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public ModelAndView save(@ModelAttribute Student student) {
		studentService.add(student);		
		List<Student> students =  studentService.findAll();
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("student-data");
		modelAndView.addObject("students", students);
		return modelAndView;
	}
}
