package com.javaproject.sms.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.javaproject.sms.entity.Student;
import com.javaproject.sms.respository.StudentRepository;
import com.javaproject.sms.service.Studentservice;


@Service
public class StudentserviceImpl implements Studentservice {
	
	private  StudentRepository  studentRepository;
	
	public StudentserviceImpl(StudentRepository studentRepository) {
		super();
		this.studentRepository = studentRepository;
	}




	@Override
	public List<Student> getAllStudents() {
		return studentRepository.findAll();
	}




	@Override
	public Student saveStudent(Student student) {
		return studentRepository.save(student);
	}




	@Override
	public Student getStudentById(Long id) {
		return studentRepository.findById(id).get();
	}




	@Override
	public Student updateStudent(Student student) {
		return studentRepository.save(student);
	}




	@Override
	public void deleteStudentById(Long id) {
		studentRepository.deleteById(id);
		
	}

}
