package com.vidiyalas.bank.dao;

import org.springframework.data.repository.CrudRepository;

import com.vidiyalas.bank.domain.SavingsAccount;


public interface SavingsAccountDao extends CrudRepository<SavingsAccount, Long> {

    SavingsAccount findByAccountNumber (int accountNumber);
}
