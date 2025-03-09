package com.app.actionsImp;
import java.util.ArrayList;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.List;
import com.anu.entity.Transactions;
import com.anu.entity.Users;
import com.app.actionsInterfaces.TransactionsInterface;
public class TransactionsActionImp implements TransactionsInterface {
	List<Transactions> listTransactions=new ArrayList<>();
     public void addTransaction(Transactions tobj) {
    	listTransactions.add(tobj);
     }
     public void viewTransactions(Date dtob) {
    	 boolean flag=false;
    	  for(Transactions transaction:listTransactions) {
    		  if(transaction.getTxnDateTime().equals(dtob)) {
    			  System.out.println(transaction);
    			  flag=true;
    		  }
    	  }
    	  if(!flag) {
    		  System.out.println("No transactions for this date");
    	  }
    	  
     }
}
