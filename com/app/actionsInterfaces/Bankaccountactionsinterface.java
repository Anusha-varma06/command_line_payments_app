package com.app.actionsInterfaces;
import com.anu.entity.BankAccount;
import com.anu.entity.Users;

public interface Bankaccountactionsinterface {
    void addAccounts(BankAccount ba);
    void removeAccounts(String banknm,Users user);
    void updateAccountStatus(String status,String banknm,Users user);
    void displayBankDetails(String bankname,Users user);
}
