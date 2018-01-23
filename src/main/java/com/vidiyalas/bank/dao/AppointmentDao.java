package com.vidiyalas.bank.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.vidiyalas.bank.domain.Appointment;

public interface AppointmentDao extends CrudRepository<Appointment, Long> {

    List<Appointment> findAll();
}
