package br.com.mauricio.eventos.validator;

import static org.junit.Assert.*;

import org.joda.time.LocalDateTime;
import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;

import br.com.mauricio.eventos.exception.ValidationBusinessException;
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
		
		validator.validateNameMandatory(event);
		
	}
	
	@Test
	public void shouldNotThrowValidationMandatoryExceptionWhenValidateEventWithName(){
		Event event = new Event();
		event.setName("teste");
		
		validator.validateNameMandatory(event);
	}
	
	@Test(expected = ValidationMandatoryException.class)
	public void shouldThrowValidationMandatoryExceptionWhenValidateEventWithoutDate(){
		Event event = new Event();
		
		validator.validateDateMandatory(event);

	}
	
	@Test
	public void shouldNotThrowValidatioMandatoryExceptionWhenValidateEventWithDate(){
		Event event = new Event();
		event.setEventDate(LocalDateTime.now());
		
		validator.validateDateMandatory(event);
	}
	
	@Test
	public void shouldSetErrorMensagemWhenValidateEventWithNameLowerThanMinimumCharacters(){
		Event event = new Event();
		event.setName("event test");
		try {
			validator.validateMinimumNameCharacters(event);
			fail("should throw exception");
		} catch (ValidationBusinessException e) {
			assertEquals("O nome do evento deve conter no mínimo 150 caracteres", e.getMessage());
		}
	}
	
	

}
