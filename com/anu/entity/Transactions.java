package com.anu.entity;

import java.util.Date;

public class Transactions {
	private static int txnId=10100;
	private Date txnDateTime;
	private int sourceUserId;
	private int targetActId;
	private int sourceTypeId ; 
	private int destTypeId ; 
	private long txnAmount;
	private Users user;
	
	
	public Transactions() {
		super();
		
	}
	public Transactions(Date txnDateTime, int sourceUserId, int targetActId, int sourceTypeId,
			int destTypeId, long txnAmount, Users user) {
		super();
		txnId++;
		this.txnDateTime = txnDateTime;
		this.sourceUserId = sourceUserId;
		this.targetActId = targetActId;
		this.sourceTypeId = sourceTypeId;
		this.destTypeId = destTypeId;
		this.txnAmount = txnAmount;
		this.user = user;
	}
	public int getTxnId() {
		return txnId;
	}
	public Date getTxnDateTime() {
		return txnDateTime;
	}
	
	public void setTxnDateTime(Date txnDateTime) {
		this.txnDateTime = txnDateTime;
	}
	public int getSourceUserId() {
		return sourceUserId;
	}
	public void setSourceUserId(int sourceUserId) {
		this.sourceUserId = sourceUserId;
	}
	public int getTargetActId() {
		return targetActId;
	}
	public void setTargetActId(int targetActId) {
		this.targetActId = targetActId;
	}
	public int getSourceTypeId() {
		return sourceTypeId;
	}
	public void setSourceTypeId(int sourceTypeId) {
		this.sourceTypeId = sourceTypeId;
	}
	public int getDestTypeId() {
		return destTypeId;
	}
	public void setDestTypeId(int destTypeId) {
		this.destTypeId = destTypeId;
	}
	public long getTxnAmount() {
		return txnAmount;
	}
	public void setTxnAmount(long txnAmount) {
		this.txnAmount = txnAmount;
	}
	public Users getUser() {
		return user;
	}
	public void setUser(Users user) {       
		this.user = user;
	}
	@Override
	public String toString() {
		return "Transactions [txnId="+ txnId +",txnDateTime=" + txnDateTime + ", sourceUserId=" + sourceUserId + ", targetActId="
				+ targetActId + ", sourceTypeId=" + sourceTypeId + ", destTypeId=" + destTypeId + ", txnAmount="
				+ txnAmount + "]";
	}

}
