package com.ram.entity;

public class Transactions {
	private int txn_id;
	private String txn_date_time;
	private int source_act_id;
	private int target_act_id;
	private int source_type_id ; 
	private int dest_type_id ; 
	private long txn_amount;
	private Users user;
	
	public int getTxn_id() {
		return txn_id;
	}
	public void setTxn_id(int txn_id) {
		this.txn_id = txn_id;
	}
	public String getTxn_date_time() {
		return txn_date_time;
	}
	public void setTxn_date_time(String txn_date_time) {
		this.txn_date_time = txn_date_time;
	}
	public int getSource_act_id() {
		return source_act_id;
	}
	public void setSource_act_id(int source_act_id) {
		this.source_act_id = source_act_id;
	}
	public int getTarget_act_id() {
		return target_act_id;
	}
	public void setTarget_act_id(int target_act_id) {
		this.target_act_id = target_act_id;
	}
	public int getSource_type_id() {
		return source_type_id;
	}
	public void setSource_type_id(int source_type_id) {
		this.source_type_id = source_type_id;
	}
	public int getDest_type_id() {
		return dest_type_id;
	}
	public void setDest_type_id(int dest_type_id) {
		this.dest_type_id = dest_type_id;
	}
	public long getTxn_amount() {
		return txn_amount;
	}
	public void setTxn_amount(long txn_amount) {
		this.txn_amount = txn_amount;
	}
	public Users getUser() {
		return user;
	}
	public void setUser(Users user) {
		this.user = user;
	}

}
