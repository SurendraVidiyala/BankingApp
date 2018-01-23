package com.vidiyalas.bank.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.vidiyalas.bank.domain.SavingsTransaction;

public interface SavingsTransactionDao extends CrudRepository<SavingsTransaction, Long> {

    List<SavingsTransaction> findAll();
}

