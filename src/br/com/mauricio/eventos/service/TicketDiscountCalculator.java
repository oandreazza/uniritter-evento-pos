package br.com.mauricio.eventos.service;

import br.com.mauricio.eventos.model.Purchaser;
import br.com.mauricio.eventos.model.Ticket;

public class TicketDiscountCalculator {

	private Ticket ticket;
	private Purchaser purchaser;


	public TicketDiscountCalculator(Ticket ticket, Purchaser purchaser) {
		this.ticket = ticket;
		this.purchaser = purchaser;
	}
	

	public void calculate() {
		
	}

}
