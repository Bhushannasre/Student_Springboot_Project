package com.app.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.entities.Students;
import com.app.repository.StudentRepository;
import com.app.service.StudentService;

@Service
public class ServiceImpl implements StudentService {
	
	@Autowired
	StudentRepository studentrepository;

	@Override
	public List<Students> getAllStudents() {
		List<Students> List=studentrepository.findAll();
		return List;
	}
	
	public Students saveStudent(Students student) {
	
	return studentrepository.save(student);
	
}

	@Override
	public Students getById(int id) {
		// TODO Auto-generated method stub
		return studentrepository.findById(id).get();
	}

	@Override
	public void deleteById(int id) {
		
		 studentrepository.deleteById(id);
		
	}
}
