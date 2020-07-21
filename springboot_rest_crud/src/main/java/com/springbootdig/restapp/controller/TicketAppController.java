package com.springbootdig.restapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springbootdig.restapp.dto.Ticket;
import com.springbootdig.restapp.services.TicketBookingServices;

@RestController
@RequestMapping("/api/tickets")
public class TicketAppController {
	
	@Autowired
	private TicketBookingServices ticketBookingServices;
	
	@PostMapping("/create")
	public Ticket createTicket(@RequestBody Ticket ticket) {
		
		return ticketBookingServices.createTicket(ticket);
	}
	
	@GetMapping("/ticket/{ticketId}")
	public Ticket getTicketByID(@PathVariable("ticketId")Integer ticketId) {
		
		return ticketBookingServices.getTicketByID(ticketId);
	}
	
	@GetMapping("/ticket/all")
	public Iterable<Ticket> getAllTickets(){
		return ticketBookingServices.getAllTickets();
	}
	
	@DeleteMapping("/ticket/{ticketId}")
	public void deleteTicket(@PathVariable("ticketId")Integer ticketId) {
		 ticketBookingServices.deleteTicket(ticketId);
	}
	
	@PutMapping("/ticket/{ticketId}/{newEmail:.+}")
	public Ticket updateTicket(@PathVariable("ticketId")Integer ticketId,@PathVariable("newEmail")String newEmail) {
		
		return ticketBookingServices.updateTicket(ticketId,newEmail);
	}
}
