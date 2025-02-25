package com.ram.entity;

public class BankAccount {

	private long bank_account_id ;
	private long account_number ;
	private String ifsc_code;
	private String actStatus;
	private String bank_name;
	private String bank_account_branch_location;
	
	public long getBank_account_id() {
		return bank_account_id;
	}
	public long getAccount_number() {
		return account_number;
	}
	private Users user;

	
	public void setBank_account_id(long bank_account_id) {
		this.bank_account_id = bank_account_id;
	}
	public void setAccount_number(long account_number) {
		this.account_number = account_number;
	}
	public String getIfsc_code() {
		return ifsc_code;
	}
	public void setIfsc_code(String ifsc_code) {
		this.ifsc_code = ifsc_code;
	}
	public String getActStatus() {
		return actStatus;
	}
	public void setActStatus(String actStatus) {
		this.actStatus = actStatus;
	}
	public String getBank_name() {
		return bank_name;
	}
	public void setBank_name(String bank_name) {
		this.bank_name = bank_name;
	}
	public String getBank_account_branch_location() {
		return bank_account_branch_location;
	}
	public void setBank_account_branch_location(String bank_account_branch_location) {
		this.bank_account_branch_location = bank_account_branch_location;
	}
	public Users getUser() {
		return user;
	}
	public void setUser(Users user) {
		this.user = user;
	}
	
}
