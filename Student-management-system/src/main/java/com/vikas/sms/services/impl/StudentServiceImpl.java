package com.vikas.sms.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vikas.sms.entities.Student;
import com.vikas.sms.repositories.StudentRepository;
import com.vikas.sms.services.StudentService;

@Service
public class StudentServiceImpl  implements StudentService{
	
	@Autowired
	private StudentRepository studRepo;

	@Override
	public List<Student> getAllStudent() {
		return studRepo.findAll();
	}

	@Override
	public Student saveStudent(Student st) {
		return studRepo.save(st);
	}

	@Override
	public Student getStudByID(Long id) {
		return studRepo.findById(id).get();
	}

	@Override
	public Student updateStudent(Student st) {
		return studRepo.save(st);
	}

	@Override
	public void deleteStudent(Long id) {
		
		studRepo.deleteById(id);
	}
	

}
