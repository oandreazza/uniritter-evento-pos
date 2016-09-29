package br.com.mauricio.eventos.service;

import br.com.mauricio.eventos.model.Purchaser;
import br.com.mauricio.eventos.model.discount.Discount;
import br.com.mauricio.eventos.model.tickets.Ticket;

public class DefaultDiscountStrategy implements DiscountStrategy{
	
	private Ticket ticket;
	private Purchaser purchaser;

	public DefaultDiscountStrategy(Ticket ticket, Purchaser purchaser) {
		this.ticket = ticket;
		this.purchaser = purchaser;
	}

	@Override
	public Double calcule() {
		Discount discount = this.purchaser.getDiscount();
		
		Double totalDiscount = discount.getDiscount() / 100.00;
		Double ticketPrice = this.ticket.getPrice();
		
		return ticketPrice - (totalDiscount * ticketPrice); 
	}

}
