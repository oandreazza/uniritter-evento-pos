package br.com.mauricio.eventos.fixture;

import java.util.Arrays;

import org.joda.time.LocalDate;

import br.com.mauricio.eventos.model.Event;
import br.com.mauricio.eventos.model.tickets.Ticket;

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


	public EventFixture withInitialDateSale(LocalDate initialSale) {
		this.event.setInitialSale(initialSale);
		return this;
	}


	public EventFixture withEndDateSale(LocalDate endSale) {
		this.event.setEndSale(endSale);
		return this;
	}

}
