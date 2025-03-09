package com.main;
import com.anu.entity.BankAccount;
import com.anu.entity.Users;
import com.app.actionsImp.BankAccountsActionsImp;
import com.app.actionsImp.TransactionsActionImp;
import com.app.actionsImp.UserActionsImp;
import com.services.BankAccountServices;
import com.services.LoginServices;
import com.services.RegistrationServices;
import com.services.TransactionService;

import java.text.ParseException;
import java.util.Scanner;

public class AppMain {
	static void displayMenu() throws ParseException {
		Scanner sc = new Scanner(System.in);
		boolean flag = true;
		UserActionsImp uaobj = new UserActionsImp();
		System.out.println("------------WELCOME TO COMMAND LINE PAYMENT APP------------");
		while (flag) {
			System.out.println("1.Register   2.Login  3.view all users  4.logout");
			System.out.println("Enter your choice:(1/2/3/4)");
			int choice = sc.nextInt();
			switch (choice) {
			case 1:
				RegistrationServices.registration(sc, uaobj);
				break;
			case 2:
				boolean isLogin = LoginServices.loginUsingCredentials(sc,uaobj);
				if (isLogin) {
					while (true) {
						loginMenu(uaobj.loggedin, uaobj);
						System.out.println("Do you want to continue(y/n)");
						char chchoice = sc.nextLine().charAt(0);
						if (chchoice == 'y') {
							continue;
						} else if (chchoice == 'n') {
							break;
						} else {
							System.out.println("invalid choice");
							break;
						}
					}
				}
				break;
			case 3:
				break;
			case 4:
				break;
			default:
				System.out.println("choose a valid option");
			}
			System.out.println("Do you want to continue(y/n)");
			char chchoice = sc.nextLine().charAt(0);
			if (chchoice == 'y') {
				flag = true;
			} else if (chchoice == 'n') {
				flag = false;
			} else {
				System.out.println("invalid choice");
				flag = false;
			}
		}
	}

	static void loginMenu(Users user, UserActionsImp uaobj) throws ParseException {
		System.out.println("-----------Welcome to Bank Section--------------");
		System.out.println("1.profile  2.Bank Accounts  3. make Transactions  4.view transaction");
		Scanner sc = new Scanner(System.in);
		BankAccountsActionsImp baobj = new BankAccountsActionsImp();
		TransactionsActionImp taobj=new TransactionsActionImp();
		int choice = sc.nextInt();
		switch (choice) {
		case 1:
			uaobj.userDisplayProfile(user);
			break;
		case 2:
			BankAccountServices.startServices(sc, baobj, user);
            break;
		case 3:
			TransactionService.transactionData(sc,user,taobj);
			break;
		case 4:
			TransactionService.viewTransactionByDate(sc, taobj);
			break;
		default:
			System.out.println("Enter valid choice");
		}
	}

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		displayMenu();
		System.out.println("Thank you");

	}

}
