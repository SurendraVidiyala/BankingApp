package com.vidiyalas.bank.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.vidiyalas.bank.domain.Recipient;

public interface RecipientDao extends CrudRepository<Recipient, Long> {
    List<Recipient> findAll();

    Recipient findByName(String recipientName);

    void deleteByName(String recipientName);
}
