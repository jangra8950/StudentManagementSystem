package com.stud.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.stud.entity.Student;
import com.stud.service.ServiceImpl;

@Controller
public class StudentController {

	private ServiceImpl service;

	public StudentController(ServiceImpl service) {
		super();
		this.service = service;
	}
	@GetMapping("/")
	public String listStudents(Model model)
	{
		model.addAttribute("students", service.getAll());
		return "index";
	}
	
	@GetMapping("/showNewForm")
	public String showForm(Model model)
	{
		Student s=new Student();
		model.addAttribute("student", s);
		return "newStudent";
	}
	
	@PostMapping("/addStudent")
	public String addStudent(@ModelAttribute("student") Student s)
	{
		service.insertStudent(s);
		return "redirect:/";
	}
	
	@GetMapping("/showFormUpdate/{no}")
	public String updateStudent(@PathVariable(value = "no") int no, Model model)
	{
		Student s=service.getStudent(no);
		model.addAttribute("student", s);
		return "updateStudent";
	}
	
	@GetMapping("/deleteStudent/{no}")
    public String deleteEmployee(@PathVariable("no") int no) {
        service.deleteStudent(no);
        return "redirect:/";
    }
}
