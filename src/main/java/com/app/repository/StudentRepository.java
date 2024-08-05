package com.app.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.app.entities.Students;
@Repository
public interface StudentRepository extends JpaRepository<Students, Integer> {

	static List<Students> FindAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
