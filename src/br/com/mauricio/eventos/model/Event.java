package br.com.mauricio.eventos.model;

import org.joda.time.LocalDate;

public class Event {
	
	private String name;
	
	private LocalDate eventDate;

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
}
