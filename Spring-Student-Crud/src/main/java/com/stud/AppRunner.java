package com.stud;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.stud.entity.Student;
import com.stud.service.ServiceImpl;

@Component
public class AppRunner implements CommandLineRunner  {
   
	@Autowired
	private ServiceImpl service;
	@Override
	public void run(String... args) throws Exception {
//		Student s1=new Student();
//		s1.setName("sahil");
//		s1.setAddress("panipat");
//		s1.setMarks(89);
//		Student s2=new Student();
//		s2.setName("jangra");
//		s2.setAddress("Haryana");
//		s2.setMarks(95);
//		service.insertStudent(s2);
//		service.insertStudent(s1);
//		
	}

}
