package com.main.studentmanagementsystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.main.studentmanagementsystem.entity.Student;
import com.main.studentmanagementsystem.service.StudentService;

@RestController
@RequestMapping("/api/students")
public class StudentRestController {

	@Autowired
	StudentService service;
	
	@GetMapping
	public List<Student> getAllStudent(){
		
		return service.getAllStudents();
	}
	
	
	@GetMapping("/{id}")
	public Student getStudentById(@PathVariable int id) {
		
		return service.getById(id);
	}
	
	
	@PostMapping
	public Student createStudent(@RequestBody Student std) {
		
		return service.saveStudent(std);
	}
	
	
	@PutMapping("/{id}")
	public Student updateStudent(@PathVariable int id, @RequestBody Student std) {
		
		return service.updateStudent(id, std);
	}
	
	
	@DeleteMapping("/{id}")
	public void deleteStudent(@PathVariable int id) {
		
		service.deleteById(id);
	}
	
	@GetMapping("/test")
	public String test() {
		return "Rest Api is working";
	}
	
}
