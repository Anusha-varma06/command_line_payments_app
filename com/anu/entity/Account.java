package com.anu.entity;
import java.sql.Date;
public class Account {
	private int userAccountId ;
	private Date accountOpenDate;
	private long currentWalletBalance;
	private int linkedBankAccountsCount;
	private String walletPin;
    private Users user;
    

	public int getUserAccountId() {
		return userAccountId;
	}
	public Account() {
		super();
		
	}
	public Account(int userAccountId, Date accountOpenDate, long currentWalletBalance, int linkedBankAccountsCount,
			String walletPin, Users user) {
		super();
		this.userAccountId = userAccountId;
		this.accountOpenDate = accountOpenDate;
		this.currentWalletBalance = currentWalletBalance;
		this.linkedBankAccountsCount = linkedBankAccountsCount;
		this.walletPin = walletPin;
		this.user = user;
	}
	public void setUserAccountId(int userAccountId) {
		this.userAccountId = userAccountId;
	}
	public Date getAccountOpenDate() {
		return accountOpenDate;
	}
	public void setAccountOpenDate(Date accountOpenDate) {
		this.accountOpenDate = accountOpenDate;
	}
	public long getCurrentWalletBalance() {
		return currentWalletBalance;
	}
	public void setCurrentWalletBalance(long currentWalletBalance) {
		this.currentWalletBalance = currentWalletBalance;
	}
	public int getLinkedBankAccountsCount() {
		return linkedBankAccountsCount;
	}
	public void setLinkedBankAccountsCount(int linkedBankAccountsCount) {
		this.linkedBankAccountsCount = linkedBankAccountsCount;
	}
	public String getWalletPin() {
		return walletPin;
	}
	public void setWalletPin(String walletPin) {
		this.walletPin = walletPin;
	}

	public Users getUser() {
		return user;
	}
	public void setUser(Users user) {
		this.user = user;
	}
	
}
