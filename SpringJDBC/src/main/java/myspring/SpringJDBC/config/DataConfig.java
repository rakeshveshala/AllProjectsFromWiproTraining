package myspring.SpringJDBC.config;

import javax.sql.DataSource;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import myspring.SpringJDBC.dao.UserRepository;
import myspring.SpringJDBC.service.UserService;

@Configuration
public class DataConfig {
/* DataSource is an interface which can be used to specify database connection in form of properties./*
* DriverManagerDataSource is class which is implementation of DataSource interface
*/
	@Bean
	public DataSource dataSource(){
		DriverManagerDataSource dataSource=new DriverManagerDataSource();
		dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
		dataSource.setUrl("jdbc:mysql://localhost:3306/ems");
		dataSource.setUsername("root");
		dataSource.setPassword("Rakesh@2000");
		return dataSource;
	}
	@Bean
	public JdbcTemplate jdbcTemplate(){
		return new JdbcTemplate(dataSource());
	}
	@Bean
	public UserRepository userRepo()
	{
	return new UserRepository();
	}
	@Bean
	public UserService userservice()
	{
	return new UserService();
	}
}