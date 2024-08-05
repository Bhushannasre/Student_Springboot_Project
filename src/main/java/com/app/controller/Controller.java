package com.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.app.entities.Students;
import com.app.service.StudentService;

@org.springframework.stereotype.Controller
public class Controller {

	@Autowired
 private StudentService service;
	
	
	@GetMapping("/home")
	public String home(){
		return "home";
	}
	@GetMapping("/students")
	public String getAllStudents(Model model) {
		model.addAttribute("students",service.getAllStudents());
		return "students";
	}
	@GetMapping("students/new")
	public String createStudentForm(Model model) {
		Students student=new Students (); //hold the student object
		model.addAttribute("student",student);
		return "create-student";
	}
	@PostMapping("/students")
	public String saveStudent(@ModelAttribute("student")Students student) {
		 service.saveStudent(student); // Save the student
		return "redirect:/students";
	}
	@GetMapping("/students/edit/{id}")	
	public String editStudentForm(@PathVariable int id, Model model){
		model.addAttribute("student",service.getById(id));
		return "edit_student";
	}
	@PostMapping("/students/update/{id}")
	public String updateStudentForm(@PathVariable int id, @ModelAttribute("student")Students student) {
		Students exsistingStudent=service.getById(id);
		exsistingStudent.setFirstname(student.getFirstname());
		exsistingStudent.setLastname(student.getLastname());
		exsistingStudent.setEmail(student.getEmail());
		service.saveStudent(exsistingStudent);
		return "redirect:/students";
	}
	@GetMapping("students/{id}")
	public String deleteStudentForm(@PathVariable int id) {
		service.deleteById(id);
		return "redirect:/students";
	}
	}

