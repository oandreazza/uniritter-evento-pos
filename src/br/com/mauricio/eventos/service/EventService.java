package br.com.mauricio.eventos.service;

import br.com.mauricio.eventos.model.Event;
import br.com.mauricio.eventos.validator.EventValidator;

public class EventService {
	
	private EventValidator validator;
	
	public EventService(EventValidator validator){
		this.validator = validator;
	}
	
	
	
	
	public void save(Event event){
		
	}




	public void create(Event event) {
		validator.validate(event);
		save(event);
	}

}
