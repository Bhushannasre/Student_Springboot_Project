package com.app.service;

import java.util.List;

import com.app.entities.Students;

public interface StudentService {

public	List<Students> getAllStudents();
		public Students saveStudent(Students student);
		public Students getById(int id);
		public void deleteById(int id);
	}

