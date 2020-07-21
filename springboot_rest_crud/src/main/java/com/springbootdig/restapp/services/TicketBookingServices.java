package com.springbootdig.restapp.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springbootdig.restapp.dao.TicketBookingDao;
import com.springbootdig.restapp.dto.Ticket;

@Service
public class TicketBookingServices {
	
	@Autowired
	private TicketBookingDao ticketBookingDao;
	
	public Ticket createTicket(Ticket ticket) {
		// TODO Auto-generated method stub
		return ticketBookingDao.save(ticket);
	}
	
	public Ticket getTicketByID(Integer ticketId) {
		// TODO Auto-generated method stub
		return ticketBookingDao.findById(ticketId).get();
	}
	
	public Iterable<Ticket> getAllTickets(){
		return ticketBookingDao.findAll();
	}

	public void deleteTicket(Integer ticketId) {
		// TODO Auto-generated method stub
		 ticketBookingDao.deleteById(ticketId);
	}

	public Ticket updateTicket(Integer ticketId, String newEmail) {
		// TODO Auto-generated method stub
		Ticket ticket=ticketBookingDao.findById(ticketId).get();
		ticket.setEmail(newEmail);
		return ticketBookingDao.save(ticket)  ;
	}

}
