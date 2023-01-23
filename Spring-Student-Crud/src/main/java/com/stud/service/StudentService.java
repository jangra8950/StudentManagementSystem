package com.stud.service;

import java.util.List;

import com.stud.entity.Student;

public interface StudentService {
  
	void insertStudent(Student s);
	void deleteStudent(int sno);
	List<Student> getAll();
	Student getStudent(int sno);
	void updateStudent(int sno,Student s);
}
