package br.com.mauricio.eventos.model;

import java.util.List;

import org.joda.time.LocalDate;

import br.com.mauricio.eventos.model.tickets.Ticket;

public class Event {
	
	private String name;
	
	private LocalDate eventDate;
	
	private LocalDate initialSale;
	
	private LocalDate endSale;
	
	private List<Ticket> tickets;

	public LocalDate getEventDate() {
		return eventDate;
	}

	public void setEventDate(LocalDate eventDate) {
		this.eventDate = eventDate;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Ticket> getTickets() {
		return tickets;
	}

	public void setTickets(List<Ticket> tickets) {
		this.tickets = tickets;
	}

	public LocalDate getInitialSale() {
		return initialSale;
	}

	public void setInitialSale(LocalDate initialSale) {
		this.initialSale = initialSale;
	}

	public LocalDate getEndSale() {
		return endSale;
	}

	public void setEndSale(LocalDate endSale) {
		this.endSale = endSale;
	}


}
