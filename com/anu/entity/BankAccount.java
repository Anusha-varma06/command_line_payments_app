package com.anu.entity;
public class BankAccount {
	private final long bankAccountId ;
	private final long accountNumber ;
	private final String ifscCode;
	private String actStatus;
	private final String bankName;
	private String bankAccountBranchLocation;
	private final Users user;
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
	public long getAccountNumber() {
		return accountNumber;
	}
	public String getIfscCode() {
		return ifscCode;
	}
	public String getBankName() {
		return bankName;
	}
	public String getBankAccountBranchLocation() {
		return bankAccountBranchLocation;
	}
	public void setBankAccountBranchLocation(String bankAccountBranchLocation) {
		this.bankAccountBranchLocation = bankAccountBranchLocation;
	}
	public String getActStatus() {
		return actStatus;
	}
	public void setActStatus(String actStatus) {
		this.actStatus = actStatus;
	}
	public Users getUser() {
		return user;
	}

	@Override
	public String toString() {
		return "BankAccount [bankAccountId=" + bankAccountId + ", accountNumber=" + accountNumber + ", ifscCode="
				+ ifscCode + ", actStatus=" + actStatus + ", bankName=" + bankName + ", bankAccountBranchLocation="
				+ bankAccountBranchLocation+"]";
	}
}
