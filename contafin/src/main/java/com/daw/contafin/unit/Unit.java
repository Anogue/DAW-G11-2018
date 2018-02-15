package com.daw.contafin.unit;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.daw.contafin.lesson.Lesson;

@Entity
public class Unit {

	@Id
	@GeneratedValue (strategy = GenerationType.AUTO)
	
	private long id;
	private String name;
	
	@OneToMany (mappedBy = "unit")
	private List<Lesson> lessons;
	
	public Unit() {}
	public Unit(String name) {
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
