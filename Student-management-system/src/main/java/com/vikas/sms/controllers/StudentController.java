package com.vikas.sms.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import com.vikas.sms.entities.Student;
import com.vikas.sms.services.StudentService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.RequestParam;



@Controller
public class StudentController {
	
	@Autowired
	private StudentService studservice;
	
//	handler method to handle students list and return mode and view
	
	
	@GetMapping("/students")
	public String listOfStudents(Model model) {
		model.addAttribute("students", studservice.getAllStudent());
		return "students";
	}
	
	@GetMapping("/students/new")
	public String createStudForm(Model model) {
		model.addAttribute("student", new Student());
		return "create_student";
	}
	@PostMapping("/students")
	public String saveStudent(@ModelAttribute("student") Student stud) {
		studservice.saveStudent(stud);
		return "redirect:/students";
	}
	
	@GetMapping("/students/edit/{id}")
	public String editStudentForm(@PathVariable Long id, Model model) {
		Student std = studservice.getStudByID(id);
		model.addAttribute("student", std);
		return "edit_student";
	}
	
	// Handler method to store the updated student in data
	
	@PostMapping("/students/{id}")
	public String updateStudent(@PathVariable Long id, 
			@ModelAttribute Student student, 
			Model model) {
		
	    Student existingStudent = studservice.getStudByID(id);
	    
	    // check if the student exists before updating
	    if (existingStudent != null) {
	    	existingStudent.setId(id);
	        existingStudent.setFirst_name(student.getFirst_name());
	        existingStudent.setLast_name(student.getLast_name());
	        existingStudent.setPhone_no(student.getPhone_no());
	        existingStudent.setEmail(student.getEmail());

	        // save updated student object to database
	        studservice.updateStudent(existingStudent);
	    } else {
	        model.addAttribute("error", "Student not found!");
	    }

	    return "redirect:/students";
	}
	
//	Handler method to handle delete request of Students
	
	@GetMapping("/students/{id}")
	public String deleteStudent( @PathVariable Long id) {
		studservice.deleteStudent(id);
		return "redirect:/students";
	}
	
}
