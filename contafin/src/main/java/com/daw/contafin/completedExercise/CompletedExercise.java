package com.daw.contafin.completedExercise;

import java.util.ArrayList;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.daw.contafin.exercise.Exercise;
import com.daw.contafin.student.Student;

@Entity
public class CompletedExercise {

	@Id
	@GeneratedValue (strategy = GenerationType.AUTO)
	private long id;
	private String name;
	
	@ManyToOne
	private Exercise exercise;
	
	private long errores;
	

	public Exercise getExercise() {
		return exercise;
	}

	public void setExercise(Exercise exercise) {
		this.exercise = exercise;
	}

	public long getErrores() {
		return errores;
	}

	public void setErrores( errores) {
		this.errores = errores;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	@ManyToOne
	private Student student;
	
	public CompletedExercise(String name) {
		this.name=name;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	
}
