package myspring.SpringJDBC.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.RowMapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import myspring.SpringJDBC.dto.User;

@Repository
public class UserRepository {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	public void insert(User u){
		String sqlquery="insert into users values(?,?,?)";
		int result=jdbcTemplate.update(sqlquery,u.getUserid(),u.getUsername(),u.getPassword()); 
		if (result>0){
			System.out.println("Data inserted");
		}
	}
	public void updateDetails(User u) {
		String updatequery="update Users set password=? where userid=?";
		int result=jdbcTemplate.update(updatequery,u.getPassword(),u.getUserid()); 
		if (result>0) {
			System.out.println("updated succesffull");
		}
	}
	public void deleteDetails(User u) {
		String deletequery = "delete from users where userid=?";
		int result = jdbcTemplate.update(deletequery,u.getUserid());
		if (result>0) {
			System.out.println("deleted succesffull");
		}
	}
	public List<User> retreiveDetails(){
		String retreivequery="select * from users";
		return jdbcTemplate.query(retreivequery, new UserRowMapper());
	}
	public User findByid(int id){
		String query="select * from users where userid=?";
		return jdbcTemplate.queryForObject(query, new Object[] {id}, new UserRowMapper());
	}
}
class UserRowMapper implements RowMapper<User>{
	@Override
	public User mapRow(ResultSet rs, int rowNum) throws SQLException {
		User u=new User();
		u.setUserid(rs.getInt(1));
		u.setUsername(rs.getString(2));
		u.setPassword(rs.getString(3));
		return u;
	}
}
