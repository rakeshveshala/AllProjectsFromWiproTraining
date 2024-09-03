package myspring.SpringJDBC.service;

import java.util.List;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import myspring.SpringJDBC.dao.UserRepository;
import myspring.SpringJDBC.dto.User;

@Service
public class UserService {
	private Scanner sc;
	public UserService(){
		sc=new Scanner(System.in);
	}
	@Autowired
	private UserRepository userrep;
	public void insert(){
		User u=new User();
		System.out.println("Enter user id ");
		u.setUserid(sc.nextInt());
		System.out.println("Enter Password"); 
		u.setPassword(sc.next());
		System.out.println("Enter username ");
		u.setUsername(sc.next());
		userrep.insert(u);
	}
	public void update(){
		User updateUser=new User();
		System.out.println("Enter user id which u want to update");
		updateUser.setUserid(sc.nextInt());
		System.out.println("Enter new password");
		updateUser.setPassword(sc.next());
		userrep.updateDetails(updateUser);
	}
	public void delete() {
		User delete = new User();
		System.out.println("Enter user id on which you want to delete");
		delete.setUserid(sc.nextInt());
		userrep.deleteDetails(delete);
	}
	public void retreiveData(){
		List<User> userlist=userrep.retreiveDetails(); 
		userlist.forEach(user->{
			System.out.println("User name is "+user.getUsername());
			System.out.println("Password is "+user.getPassword());
		});
	}
	public void retreivebyId(){
		System.out.println("Enter user id for which u want to retreive dtaa");
		int userid = sc.nextInt();
		User u= userrep.findByid(userid);
		System.out.println("User name is "+u.getUsername());
	}
}
