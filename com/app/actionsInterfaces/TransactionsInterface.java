package com.app.actionsInterfaces;

import java.util.Date;

import com.anu.entity.Transactions;
import com.anu.entity.Users;

public interface TransactionsInterface {
     void addTransaction(Transactions tobj);
     void viewTransactions(Date dtob);
}
