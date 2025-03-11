package com.vikas.sms;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.vikas.sms.entities.Student;
import com.vikas.sms.repositories.StudentRepository;

@SpringBootApplication
public class StudentManagementSystemApplication implements CommandLineRunner {
	
	@Autowired
	private StudentRepository studRepo;

	public static void main(String[] args){
		SpringApplication.run(StudentManagementSystemApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
//		Student stud = new Student("Vikas", "Sharma", "vikassharma6886@gmail.com");
//		studRepo.save(stud);
//		Student stud2 = new Student("Vineet", "Saini", "vineetsaini1234@gmail.com");
//		studRepo.save(stud2);
//		Student stud3 = new Student("Mayank", "Aggarwal", "mayankaggr3456@gmail.com");
//		studRepo.save(stud3);
	}

}
