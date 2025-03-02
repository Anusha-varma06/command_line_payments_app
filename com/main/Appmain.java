package com.main;
import com.anu.entity.BankAccount;
import com.anu.entity.Users;
import com.app.actionsImp.Bankaccountsactionsimp;
import com.app.actionsImp.Useractionsimp;
import java.util.Scanner;
public class Appmain {
	static void displayMenu() {                     
		Scanner sc=new Scanner(System.in);
		boolean flag=true;
		
		Useractionsimp uaobj=new Useractionsimp();          
		Users userobj=null;
		System.out.println("------------WELCOME TO COMMAND LINE PAYMENT APP------------");
		while(flag) {
		boolean ischange=true;
		System.out.println("1.Register   2.Login ");
		System.out.println("Enter your choice:(1/2)");
		int choice=sc.nextInt();
		switch(choice) {
		case 1:
			System.out.println("Enter your userId:");
			int user_id=sc.nextInt();
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
			long phone_number=sc.nextLong();
			sc.nextLine();
			System.out.println("Enter your email");
			String email=sc.nextLine();              
			System.out.println("Enter your address");
			String address=sc.nextLine();
			userobj=getUsers(user_id,username,password,firstname,lastname,phone_number,email,address);
			uaobj.userRegistration(userobj);
			uaobj.userDisplayProfile(userobj);
			break;
		case 2:
			sc.nextLine();
			System.out.println("Enter your username:");
			String validateusername=sc.nextLine();
			System.out.println("Enter your password:");
			String validatepassword=sc.nextLine();
			for(Users arr:uaobj.getUserlist()) {
				if(validateusername.equals(arr.getUser_name())&& validatepassword.equals(arr.getPassword())){
					uaobj.userLogin(arr);
					while(ischange) {
					 loginMenu(arr);
					 System.out.println("Do you want to continue(y/n)");
						char chchoice=sc.nextLine().charAt(0);
						if(chchoice=='y') {
							ischange=true;
						}
						else if(chchoice=='n') {
							ischange=false;
						}
						else {
							System.out.println("invalid choice");
							ischange=false;
						}
					}
					
				}
			}
			break;
	  default:
		  System.out.println("choose a valid option");
		
		}
		System.out.println("Do you want to continue(y/n)");
		char chchoice=sc.nextLine().charAt(0);
		if(chchoice=='y') {
			flag=true;
		}
		else if(chchoice=='n') {
			flag=false;
		}
		else {
			System.out.println("invalid choice");
			flag=false;
		}
	  }	
	}
	static Users getUsers(int user_id,String username,String password,String firstname,String lastname,long phone_number,String email,String address) {
		Users uobj=new Users(user_id,username,password,firstname,lastname,phone_number,email,address);
		return uobj;
	}
	static void loginMenu(Users user) {
		System.out.println("-----------Welcome to Bank Section--------------");
		System.out.println("1.add bank account  2.Remove bank account  3.edit bank account status  4.display bank details");
		Scanner sc=new Scanner(System.in);
		Bankaccountsactionsimp baobj=new Bankaccountsactionsimp();
		int choice=sc.nextInt();
		switch(choice) {
		  case 1:
			  System.out.println("Enter your bankaccountId");
			  long bankAccountId=sc.nextLong();
			  System.out.println("Enter your account number");
			  long accountNumber=sc.nextLong();
			  sc.nextLine();
			  System.out.println("Enter your ifsc code");
			  String ifscCode=sc.nextLine();
			  System.out.println("Enter your account status");
			  String actStatus=sc.nextLine();
			  System.out.println("Enter your bank name");
			  String bankName=sc.nextLine();
			  System.out.println("Enter your branchlocation");
			  String bankAccountBranchLocation=sc.nextLine();
			  BankAccount bankacc=new BankAccount(bankAccountId,accountNumber,ifscCode,actStatus,bankName,bankAccountBranchLocation,user);
			  baobj.addAccounts(bankacc);
			  break;
		  case 2:
			  System.out.println("Enter bankname which you want to remove");
			  String bankname=sc.nextLine();
			  baobj.removeAccounts(bankname,user);
			  break;
		  case 3:
			  System.out.println("Enter bankname to change its status");
			  sc.nextLine();
			  String banknm=sc.nextLine();
			  System.out.println("Enter the status type");
			  String status=sc.nextLine();
			  baobj.updateAccountStatus(status,banknm,user);
			  break;
		  case 4:
			  System.out.println("Enter your Bankname");
			  sc.nextLine();
			  String bname=sc.nextLine();
			  baobj.displayBankDetails( bname, user);
			  break;
		default:
			System.out.println("Enter valid choice");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      displayMenu();
      System.out.println("Thank you");
      
	}

}
