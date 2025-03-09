package com.services;
import java.util.Scanner;

import com.anu.entity.BankAccount;
import com.anu.entity.Users;
import com.app.actionsImp.BankAccountsActionsImp;
public class BankAccountServices {
        public static void startServices(Scanner sc,BankAccountsActionsImp baobj,Users user) {
        	System.out.println("-----------Welcome to Bank Section--------------");
    		System.out.println(
    				"1.Add Bankaccount  2.view BankAccount  3.Edit bankaccount status  4.Remove BankAccount");
    		int choice = sc.nextInt();
    		switch (choice) {
    		case 1:
    			System.out.println("Enter your bankaccountId");
    			long bankAccountId = sc.nextLong();
    			System.out.println("Enter your account number");
    			long accountNumber = sc.nextLong();
    			sc.nextLine();
    			System.out.println("Enter your ifsc code");
    			String ifscCode = sc.nextLine();
    			System.out.println("Enter your account status");
    			String actStatus = sc.nextLine();
    			System.out.println("Enter your bank name");
    			String bankName = sc.nextLine();
    			System.out.println("Enter your branchlocation");
    			String bankAccountBranchLocation = sc.nextLine();
    			BankAccount bankacc = new BankAccount(bankAccountId, accountNumber, ifscCode, actStatus, bankName,
    					bankAccountBranchLocation, user);
    			baobj.addAccounts(bankacc);
    			break;
    		case 2:
    			System.out.println("Enter your Bankname");
    			sc.nextLine();
    			String bname = sc.nextLine();
    			baobj.displayBankDetails(bname, user);
    			break;
    		case 3:
    			System.out.println("Enter bankname to change its status");
    			sc.nextLine();
    			String banknm = sc.nextLine();
    			System.out.println("Enter the status type");
    			String status = sc.nextLine();
    			baobj.updateAccountStatus(status, banknm, user);
    			break;
    		case 4:
    			sc.nextLine();
    			System.out.println("Enter bankname which you want to remove");
    			String bankname = sc.nextLine();
    			baobj.removeAccounts(bankname, user);
    			break;
    		default:
    			System.out.println("Invalid choice");	
    		}
    		
        }
}
