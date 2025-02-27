package com.actions;
import java.util.ArrayList;
import java.util.List;
import com.anu.entity.Users;
public class Useraction {
	static List<Users> userList=new ArrayList<>();
	static Users logginUser;
  public static void registerUser(Users user) {
	  userList.add(user);
  }
  public static void logginUser(Users user) {
	  logginUser=user;
  }
}
