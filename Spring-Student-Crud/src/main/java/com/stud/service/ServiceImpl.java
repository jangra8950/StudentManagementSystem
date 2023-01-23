package com.stud.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.stud.entity.Student;
import com.stud.repo.StudentRepo;

@Service
public class ServiceImpl implements StudentService{

	private StudentRepo repo;
	
	public ServiceImpl(StudentRepo repo) {
		super();
		this.repo = repo;
	}

	@Override
	public void insertStudent(Student s) {
		repo.save(s);	
	}

	@Override
	public void deleteStudent(int sno) {
		repo.deleteById(sno);
		
	}

	@Override
	public List<Student> getAll() {
		
		return repo.findAll();
	}

	@Override
	public Student getStudent(int sno) {
		
		return repo.findById(sno).orElse(null);
	}

	@Override
	public void updateStudent(int sno, Student s) {
		Student s1=repo.findById(sno).orElse(null);
		s1.setName(s.getName());
		s1.setAddress(s.getAddress());
		s1.setMarks(s.getMarks());
		repo.save(s1);
		
	}

}
