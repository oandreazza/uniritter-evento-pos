package br.com.mauricio.eventos.validator;

import static org.junit.Assert.*;

import javax.xml.bind.ValidationException;

import org.junit.Before;
import org.junit.Test;

import br.com.mauricio.eventos.exception.ValidationMandatoryException;
import br.com.mauricio.eventos.model.Event;

public class EventValidatorTest {

	private EventValidator validator;

	@Before
	public void setUp() throws Exception {
		validator = new EventValidator();
	}

	@Test(expected = ValidationMandatoryException.class)
	public void shouldThrowValidationMandatoryExceptionWhenValidateEventWithoutName() {
		Event event = new Event();
		
		validator.validateName(event);
		
	}
	
	@Test
	public void shouldNotThrowValidationMandatoryExceptionWhenValidateEventWithName(){
		Event event = new Event();
		event.setName("teste");
		
		validator.validateName(event);
	}

}
