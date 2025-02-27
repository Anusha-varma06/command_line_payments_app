package com.actions;
import com.anu.entity.Users;
public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Users us=new Users();
        Useraction.registerUser(us);
        Useraction.logginUser(us);
	}

}
