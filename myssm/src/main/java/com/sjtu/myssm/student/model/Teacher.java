package com.sjtu.myssm.student.model;

import java.util.LinkedList;
import java.util.List;

public class Teacher implements Cloneable{

	private Long id;
	private String name;
	private List<Student> students = new LinkedList<Student>();
	
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public List<Student> getStudents() {
		return students;
	}

	public void setStudents(List<Student> students) {
		this.students = students;
	}

	@Override
	public String toString() {
		return "Teacher [id=" + id + ", name=" + name + ", list=" + students + "]";
	}
	
	@Override
	public Object clone(){
		Teacher o =null; 
		try {
			o=(Teacher) super.clone();
//			o.list  = new LinkedList<Student>(list);
			o.students  = new LinkedList<Student>();
			for (Student student : students) {
				student = (Student) student.clone();
				o.students.add(student);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return o;
	}
}
