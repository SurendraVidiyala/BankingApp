package com.vidiyalas.bank.service;

import java.security.Principal;

import com.vidiyalas.bank.domain.PrimaryAccount;
import com.vidiyalas.bank.domain.PrimaryTransaction;
import com.vidiyalas.bank.domain.SavingsAccount;
import com.vidiyalas.bank.domain.SavingsTransaction;

public interface AccountService {
	PrimaryAccount createPrimaryAccount();
    SavingsAccount createSavingsAccount();
    void deposit(String accountType, double amount, Principal principal);
    void withdraw(String accountType, double amount, Principal principal);
    
    
}
