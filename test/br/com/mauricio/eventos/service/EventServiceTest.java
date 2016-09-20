package br.com.mauricio.eventos.service;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;
import static org.mockito.MockitoAnnotations.*;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;

import br.com.mauricio.eventos.model.Event;
import br.com.mauricio.eventos.validator.EventValidator;

public class EventServiceTest {

	private EventService service;
	@Mock
	private EventValidator validator;
	
	
	@Before
	public void setUp() throws Exception {
		initMocks(this);
		service = new EventService(validator);
	}

	@Test
	public void ShouldValidadeAndaSaveWhenCreateEvent() {
		Event event = new Event();
		
		service.create(event);
		
		verify(validator,times(1)).validate(event);
	
	}

}
