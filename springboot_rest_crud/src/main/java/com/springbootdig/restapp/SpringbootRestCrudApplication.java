package com.springbootdig.restapp;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.springbootdig.restapp.dto.Ticket;
import com.springbootdig.restapp.services.TicketBookingServices;

@SpringBootApplication
public class SpringbootRestCrudApplication implements CommandLineRunner{
	
	@Autowired
	private TicketBookingServices ticketBookingServices;
	
	public static void main(String[] args) {
		SpringApplication.run(SpringbootRestCrudApplication.class, args);
		
	}

	@Override
	public void run(String... args) throws Exception {
		
		Ticket ticket=new Ticket();
		ticket.setBookingDate(new Date());
		ticket.setSourceStation("ahmedabad");
		ticket.setDestStation("banglore");
		ticket.setEmail("abc@gmail.com");
		ticket.setPassengerName("dignesh");
		
		ticketBookingServices.createTicket(ticket);

	}

}
