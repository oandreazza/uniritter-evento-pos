package br.com.mauricio.eventos.service;

import br.com.mauricio.eventos.model.Purchaser;
import br.com.mauricio.eventos.model.discount.Discount;
import br.com.mauricio.eventos.model.tickets.Ticket;

public class TicketDiscountCalculator {

	private Ticket ticket;
	private Purchaser purchaser;


	public TicketDiscountCalculator(Ticket ticket, Purchaser purchaser) {
		this.ticket = ticket;
		this.purchaser = purchaser;
	}
	

	public Double calculate() {
		Discount discount = this.purchaser.getDiscount();
		
		Double totalDiscount = discount.getDiscount() / 100.00;
		Double ticketPrice = this.ticket.getPrice();
		
		return ticketPrice - (totalDiscount * ticketPrice); 
	}

}
