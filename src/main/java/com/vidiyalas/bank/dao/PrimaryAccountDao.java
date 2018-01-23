package com.vidiyalas.bank.dao;

import org.springframework.data.repository.CrudRepository;

import com.vidiyalas.bank.domain.PrimaryAccount;

public interface PrimaryAccountDao extends CrudRepository<PrimaryAccount,Long> {

    PrimaryAccount findByAccountNumber (int accountNumber);
}
