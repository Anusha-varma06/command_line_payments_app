package com.services;
import java.util.Scanner;
import com.anu.entity.Users;
import com.app.actionsImp.UserActionsImp;
public class RegistrationServices {
	public static void registration(Scanner sc,UserActionsImp uaobj){
		sc.nextLine();
		System.out.println("Enter your name");
		String username=sc.nextLine();
		System.out.println("Enter your password");
		String password=sc.nextLine();
		System.out.println("Enter your firstname");
		String firstname=sc.nextLine();
		System.out.println("Enter your lastname");
		String lastname=sc.nextLine();
		System.out.println("Enter your mobile number");
		String phone_number=sc.nextLine();
		System.out.println("Enter your email");
		String email=sc.nextLine();              
		System.out.println("Enter your address");
		String address=sc.nextLine();
		Users uobj=new Users(username,password,firstname,lastname,phone_number,email,address);
		uaobj.userRegistration(uobj);
		uaobj.userDisplayProfile(uobj);	
	}
}
