package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.http.ResponseEntity;

public interface StudentRepository extends JpaRepository<Student, Integer> {

	List<Student> findByIdGreaterThan(int id);
	
	
	Student getBhyName();

}
