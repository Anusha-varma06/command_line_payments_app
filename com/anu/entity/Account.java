package com.ram.entity;

import java.sql.Date;

public class Account {

	private int user_account_id ;
	private Date account_open_date;
	private long current_wallet_balance;
	private int linked_bank_accounts_count;
	private String wallet_pin;
    private Users user;
    
	public int getUser_account_id() {
		return user_account_id;
	}
	public void setUser_account_id(int user_account_id) {
		this.user_account_id = user_account_id;
	}
	public Date getAccount_open_date() {
		return account_open_date;
	}
	public void setAccount_open_date(Date account_open_date) {
		this.account_open_date = account_open_date;
	}
	public long getCurrent_wallet_balance() {
		return current_wallet_balance;
	}
	public void setCurrent_wallet_balance(long current_wallet_balance) {
		this.current_wallet_balance = current_wallet_balance;
	}
	public int getLinked_bank_accounts_count() {
		return linked_bank_accounts_count;
	}
	public void setLinked_bank_accounts_count(int linked_bank_accounts_count) {
		this.linked_bank_accounts_count = linked_bank_accounts_count;
	}
	public String getWallet_pin() {
		return wallet_pin;
	}
	public void setWallet_pin(String wallet_pin) {
		this.wallet_pin = wallet_pin;
	}
	public Users getUser() {
		return user;
	}
	public void setUser(Users user) {
		this.user = user;
	}
	
}
