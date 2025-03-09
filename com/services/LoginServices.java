package com.services;
import java.util.Scanner;
import com.anu.entity.Users;
import com.app.actionsImp.UserActionsImp;
public class LoginServices {
     public static boolean loginUsingCredentials(Scanner sc,UserActionsImp uaobj){
    	 System.out.println("welcome to login");
    	 sc.nextLine();
    	 System.out.println("Enter your username:");
		 String name=sc.nextLine();
		 System.out.println("Enter your password:");
		 String password=sc.nextLine();
		 return userLogin(name,password,uaobj);
     }
     public static boolean userLogin(String name,String password,UserActionsImp uaobj) {
    	 boolean isLogin=false;
    	 for(Users user:uaobj.getUserlist()) {
				if(name.equals(user.getUser_name())&& password.equals(user.getPassword())){
					uaobj.userLogin(user);
					isLogin=true;	
				}
			}
    	 if(!isLogin) {
    		 System.out.println("invalid credentials");
    	 }
    	 return isLogin;
     }
}
