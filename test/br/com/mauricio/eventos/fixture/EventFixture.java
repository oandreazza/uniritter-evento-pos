package br.com.mauricio.eventos.fixture;

import java.util.Arrays;

import br.com.mauricio.eventos.model.Event;
import br.com.mauricio.eventos.model.Ticket;

public class EventFixture {

	private Event event = new Event();

	public static EventFixture get() {
		return new EventFixture();
	}

	
	public EventFixture withTickets(Ticket ...tickets) {
		this.event.setTickets(Arrays.asList(tickets));
		
		return this;
	}


	public Event build() {
		return this.event;
	}

}
