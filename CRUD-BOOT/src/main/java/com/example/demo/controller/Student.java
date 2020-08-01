package com.example.demo.controller;

import javax.persistence.Entity;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonProperty;

import net.bytebuddy.implementation.bind.annotation.IgnoreForBinding;

@Entity
public class Student {

	@Id
	@JsonProperty("idd")
	private int id;

//	@JsonProperty("name")
	private String name;

//	@JsonProperty("course")
	private String course;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

}
