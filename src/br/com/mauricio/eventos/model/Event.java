package br.com.mauricio.eventos.model;

import java.util.List;

import org.joda.time.LocalDate;

public class Event {
	
	private String name;
	
	private LocalDate eventDate;
	
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
}
