package com.start;

import java.util.ArrayList;
import java.util.List;

import com.ram.entity.Users;

public class DataInit {
    
	static List<Users> allUsers=new ArrayList<Users>();
	static int loggedInUser;
	
	//registers an user
	static void registerUser(Users user) 
	{
		allUsers.add(user);
	}
	
	//user who log in currently
	static void loginUser(Users user)
    {
     loggedInUser=user.getUser_id()	;
    }
}
