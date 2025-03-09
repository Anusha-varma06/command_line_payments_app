package com.services;
import java.util.Scanner;
import java.util.Date;
import com.anu.entity.Transactions;
import com.anu.entity.Users;
import com.app.actionsImp.TransactionsActionImp;

import java.text.ParseException;
import java.text.SimpleDateFormat;
public class TransactionService {
      public static void transactionData(Scanner sc,Users user,TransactionsActionImp taobj) throws ParseException {
    	  sc.nextLine();
    	  SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy");
    	  System.out.println("Enter current date(dd-MM-yyyy)");
    	  String date=sc.nextLine();
    	  Date dt=sdf.parse(date);
    	  System.out.println("Enter target userid");
    	  int targetId=sc.nextInt();
    	  System.out.println("Enter source type Id");
    	  int sourceTypeId=sc.nextInt();
    	  System.out.println("Enter target type Id");
    	  int targetTypeId=sc.nextInt();
    	  System.out.println("Enter amount you want to send");
    	  long amt=sc.nextLong();
    	  Transactions tobj=new Transactions(dt,user.getUser_id(),targetId,sourceTypeId,targetTypeId,amt,user);
    	  taobj.addTransaction(tobj);
      }
      public static void viewTransactionByDate(Scanner sc,TransactionsActionImp taobj) throws ParseException {
    	  sc.nextLine();
    	  SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy");
    	  System.out.println("Enter date to view your transaction history");
    	  String date=sc.nextLine();
    	  Date dt=sdf.parse(date);
    	  taobj.viewTransactions(dt);
      }
}
