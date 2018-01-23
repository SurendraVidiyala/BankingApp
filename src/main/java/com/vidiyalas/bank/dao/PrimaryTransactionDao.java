package com.vidiyalas.bank.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.vidiyalas.bank.domain.PrimaryTransaction;

public interface PrimaryTransactionDao extends CrudRepository<PrimaryTransaction, Long> {

    List<PrimaryTransaction> findAll();
}
