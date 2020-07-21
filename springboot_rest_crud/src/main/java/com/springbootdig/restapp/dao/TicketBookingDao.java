package com.springbootdig.restapp.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.springbootdig.restapp.dto.Ticket;

@Repository
public interface TicketBookingDao extends CrudRepository<Ticket,Integer>{
	
	
}
