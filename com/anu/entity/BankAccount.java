package com.anu.entity;
public class BankAccount {
	private long bankAccountId ;
	private long accountNumber ;
	private String ifscCode;
	private String actStatus;
	private String bankName;
	private Users user;
	public BankAccount() {
		super();
		// TODO Auto-generated constructor stub
	}
	public BankAccount(long bankAccountId, long accountNumber, String ifscCode, String actStatus, String bankName,
			String bankAccountBranchLocation,Users user){
		super();
		this.bankAccountId = bankAccountId;
		this.accountNumber = accountNumber;
		this.ifscCode = ifscCode;
		this.actStatus = actStatus;
		this.bankName = bankName;
		this.bankAccountBranchLocation = bankAccountBranchLocation;
		this.user=user;
	}
	
	public long getBankAccountId() {
		return bankAccountId;
	}
	public void setBankAccountId(long bankAccountId) {
		this.bankAccountId = bankAccountId;
	}
	public long getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getIfscCode() {
		return ifscCode;
	}
	public void setIfscCode(String ifscCode) {
		this.ifscCode = ifscCode;
	}
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	public String getBankAccountBranchLocation() {
		return bankAccountBranchLocation;
	}
	public void setBankAccountBranchLocation(String bankAccountBranchLocation) {
		this.bankAccountBranchLocation = bankAccountBranchLocation;
	}
	private String bankAccountBranchLocation;
	
	
	public String getActStatus() {
		return actStatus;
	}
	public void setActStatus(String actStatus) {
		this.actStatus = actStatus;
	}
	public Users getUser() {
		return user;
	}
	public void setUser(Users user) {
		this.user=user;
	}
}
