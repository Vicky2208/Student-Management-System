package com.vikas.sms.services;

import java.util.List;

import com.vikas.sms.entities.Student;

public interface StudentService {
	
	public List<Student> getAllStudent();
	public Student saveStudent(Student st);
	public Student getStudByID(Long id);
	public Student updateStudent(Student st);
	public void deleteStudent(Long id);
}
