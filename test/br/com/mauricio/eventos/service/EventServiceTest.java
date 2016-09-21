package br.com.mauricio.eventos.service;

import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.MockitoAnnotations.initMocks;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;
import static org.mockito.BDDMockito.*;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.mockito.Mock;

import br.com.mauricio.eventos.dao.Dao;
import br.com.mauricio.eventos.model.Event;
import br.com.mauricio.eventos.validator.EventValidator;

public class EventServiceTest {

	private EventService service;
	@Mock
	private EventValidator validator;
	@Mock
	private Dao dao;
	
	
	@Before
	public void setUp() throws Exception {
		initMocks(this);
		service = new EventService(validator,dao);
	}

	@Test
	public void shouldValidadeAndSaveWhenCreateEvent() {
		Event event = new Event();
		
		service.create(event);
		
		verify(validator,times(1)).validate(event);
		verify(dao,times(1)).save(event);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	@Ignore
	public void shouldReturnLastFiveEvents(){
		Event[] events = {new Event(),new Event(),new Event(),new Event(),new Event(),new Event(),new Event()};
		given(dao.listAll()).willReturn(Arrays.asList(events));
		
		List<Event> returnedEvents = service.listLastFiveEvents();
		
		assertEquals(5,returnedEvents.size());
	}

}
