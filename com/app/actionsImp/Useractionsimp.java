package com.app.actionsImp;
import java.util.ArrayList;
import java.util.List;
import com.anu.entity.Users;
import com.app.actionsInterfaces.Useractionsinterface;
public class Useractionsimp implements Useractionsinterface{
	List<Users> userlist=new ArrayList<>(); 
	Users loggedin;
	public void userRegistration(Users user) {
		// TODO Auto-generated method stub
		userlist.add(user);
		System.out.println("Registered successfully");
	}
	public void userLogin(Users user) {
		// TODO Auto-generated method stub
		loggedin=user;
		System.out.println("Logged in successfully");
	}
	public void userDisplayProfile(Users user) {
		// TODO Auto-generated method stub
		System.out.println(user);
	}
	public List<Users> getUserlist() {
		return userlist;
	}
}
