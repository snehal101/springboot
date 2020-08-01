package com.example.demo.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;

public interface IStudentService {

	void addStudent(Student student);

	Student   getStudent(int id);

	void deleteStudent(int id);

	void updateStudent(Student student);

	void changeStudentName(String name, int id);

	ResponseEntity<List<Student>> getGreaterThan(int id);
}
