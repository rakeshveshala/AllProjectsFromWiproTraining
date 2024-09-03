package com.wipro.demo.dao;

import org.springframework.data.jpa.repository. JpaRepository;
import org.springframework.stereotype. Repository;
import com.wipro.demo.model. Department;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Integer> {
	
}
