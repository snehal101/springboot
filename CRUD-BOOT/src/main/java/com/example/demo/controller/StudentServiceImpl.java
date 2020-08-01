package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements IStudentService {

	@Autowired
	StudentRepository repo;

	@Override
	public void addStudent(Student student) {
		repo.save(student);
	}

	@Override
	public Student getStudent(int id) {
		return repo.findById(id).orElse(null);
	}

	@Override
	public void deleteStudent(int id) {
		repo.deleteById(id);
		System.out.println("Deleted Successfully");
	}

	@Override
	public void updateStudent(Student student) {
		// TODO Auto-generated method stub

	}

	@Override
	public void changeStudentName(String name, int id) {
		// TODO Auto-generated method stub

	}

	@Override
	public ResponseEntity<List<Student>> getGreaterThan(int id) {
		
		List<Student> list = repo.findByIdGreaterThan(id);
		return ResponseEntity.ok(list);
	}

}
