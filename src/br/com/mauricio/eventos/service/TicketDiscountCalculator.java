package br.com.mauricio.eventos.service;

import br.com.mauricio.eventos.factory.DiscountFactory;
import br.com.mauricio.eventos.model.Discount;
import br.com.mauricio.eventos.model.Purchaser;
import br.com.mauricio.eventos.model.Ticket;

public class TicketDiscountCalculator {

	private Ticket ticket;
	private Purchaser purchaser;


	public TicketDiscountCalculator(Ticket ticket, Purchaser purchaser) {
		this.ticket = ticket;
		this.purchaser = purchaser;
	}
	

	public Double calculate() {
		Discount discount = DiscountFactory.build(this.purchaser);
		
		Double totalDiscount = discount.getDiscount() / 100.00;
		Double ticketPrice = this.ticket.getPrice();
		
		return ticketPrice - (totalDiscount * ticketPrice); 
	}

}
