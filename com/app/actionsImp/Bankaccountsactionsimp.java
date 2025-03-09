package com.app.actionsImp;
import com.anu.entity.BankAccount;
import com.anu.entity.Users;
import com.app.actionsInterfaces.BankAccountActionsInterface;
public class BankAccountsActionsImp implements BankAccountActionsInterface {
	public void addAccounts(BankAccount ba) {
		// TODO Auto-generated method stub
		ba.getUser().setBanks(ba);
		System.out.println("Successfully account added");
	}
	public void removeAccounts(String banknm,Users user) {
		// TODO Auto-generated method stub
		for(BankAccount ac:user.getBanks()) {
			if(ac.getBankName().equals(banknm)) {
				user.getBanks().remove(ac);
			}
		}
		System.out.println("Bank removed successfully");
	}
	public void updateAccountStatus(String status,String banknm,Users user) {
		// TODO Auto-generated method stub
		for(BankAccount ac:user.getBanks()) {
			if(ac.getBankName().equals(banknm)) {
				ac.setActStatus(status);
			}
		}
		System.out.println("Status updated");
	}
	public void displayBankDetails(String bankname,Users user) {
		for(BankAccount bank:user.getBanks()) {
			if(bank.getBankName().equals(bankname)) {
				System.out.println(bank);
			}
		}
	}
}
