package br.com.mauricio.eventos.model;

import org.joda.time.LocalDateTime;

public class Event {
	
	private String name;
	
	private LocalDateTime eventDate;

	public LocalDateTime getEventDate() {
		return eventDate;
	}

	public void setEventDate(LocalDateTime eventDate) {
		this.eventDate = eventDate;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
