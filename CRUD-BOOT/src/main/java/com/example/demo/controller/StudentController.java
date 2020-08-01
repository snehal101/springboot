package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "student")
public class StudentController {

	@Autowired
	IStudentService service;

	@PostMapping("/add-student")
	public ResponseEntity<String> addStudent(@RequestBody Student student) {
		service.addStudent(student);
		return ResponseEntity.status(HttpStatus.OK).body("Added");

	}
	
	
	@GetMapping("/get-student")
	public ResponseEntity<Student> getStudentInfo(@RequestParam("id") int id ){
		
		return ResponseEntity.status(HttpStatus.OK).body(service.getStudent(id));
	}
	
	@DeleteMapping("/delete-student")
	public ResponseEntity deleteStudent(@RequestBody Student student) {
		System.out.println("##########################################");
		System.out.println(student.getId());
		System.out.println("##########################################");
		service.deleteStudent(student.getId());
		return ResponseEntity.noContent().build();
	}
	
	@GetMapping("/greater-than")
	public ResponseEntity<List<Student>> getGreaterThan(@RequestBody Student student){
		return service.getGreaterThan(student.getId());
		
	}
	

}
