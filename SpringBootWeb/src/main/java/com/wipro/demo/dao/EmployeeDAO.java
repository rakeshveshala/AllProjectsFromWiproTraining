package com.wipro.demo.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core. JdbcTemplate; 
import org.springframework.stereotype. Repository;
import com.wipro.demo.model. Employee;
@Repository
public class EmployeeDAO {
	@Autowired
	JdbcTemplate jdbctemp;//we don't have to implement the JDBCTemplate class in spring boot itll directly come if we use @Autowired
	public void insertEmployee(Employee e){
			String insertQuery="insert into employees values(?,?,?)";
				int result=jdbctemp.update(insertQuery,e.getEmpid(),e.getEmpname(),e.getSalary());
				if (result>0) {
					System.out.println("Data inserted");
				}
	}
}