package com.wipro.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.wipro.demo.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Integer>{
	public List<Employee> findByOrderBySalaryAsc();
	
	public List<Employee> findByDepartmentname(String name);
	
	public List<Employee> findTop3ByOrderBySalaryDesc();
	
	public List<Employee> findByEmpidAndEmpname(int id,String name);
	
	@Query
	("select e from Employee e where e.salary between 30000 and 40000")
	public List<Employee> getDetails();
	
}