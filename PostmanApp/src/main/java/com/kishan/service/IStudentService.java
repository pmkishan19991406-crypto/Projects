package com.kishan.service;

import java.util.List;

import com.kishan.model.Student;

public interface IStudentService {
	
	public Student save(Student std);

	public 	Student findById(Integer sid);

	public String deleteById(Integer sid);

	public Student editById(Integer sid, Student student);

	public List<Student> getAll();

	public void inputlist(List<Student> student);

	public void count();

	public void check(Integer sid);



}
