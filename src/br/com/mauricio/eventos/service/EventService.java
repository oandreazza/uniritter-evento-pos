package br.com.mauricio.eventos.service;

import java.util.List;
import java.util.stream.Collectors;

import br.com.mauricio.eventos.dao.Dao;
import br.com.mauricio.eventos.model.Event;
import br.com.mauricio.eventos.validator.EventValidator;

public class EventService {
	
	private EventValidator validator;
	private Dao dao;
	
	public EventService(EventValidator validator, Dao dao){
		this.validator = validator;
		this.dao = dao;
	}
	
	public void create(Event event) {
		validator.validate(event);
		save(event);
	}
	
	public void save(Event event){
		dao.save(event);
	}
	
	
	
	
	
	
	
	
	
	public List<Event> listLastFiveEvents(){
		List<Event> eventList = dao.listAll();
		
		return eventList.stream().limit(5).collect(Collectors.toList());
		
		
	}


}
