package br.com.mauricio.eventos.validator;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.apache.commons.lang3.RandomStringUtils;
import org.joda.time.LocalDate;
import org.junit.Before;
import org.junit.Test;

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
		event.setEventDate(LocalDate.now());
		
		validator.validateDateMandatory(event);
	}
	
	@Test
	public void shouldSetErrorMessageWhenValidateEventWithNameMoreThanMaxCharacters(){
		Event event = new Event();
		event.setName(RandomStringUtils.random(151));
		
		try {
			validator.validateMaxNameCharacters(event);
			fail("should throw exception");
		} catch (ValidationBusinessException e) {
			assertEquals("O nome permite no máximo 150 caracteres", e.getMessage());
		}
	}
	
	@Test
	public void shouldNotSetErrorMessageWhenValidateEventWithNameLowerThanMaxCharacters(){
		Event event = new Event();
		event.setName(RandomStringUtils.random(100));
		
		validator.validateMaxNameCharacters(event);
	}
	
	@Test
	public void shouldSetErrorMessageWhenValidateEventWithDataLowerThanToday(){
		LocalDate yesterday = LocalDate.now().minusDays(1);
		Event event = new Event();
		event.setEventDate(yesterday);
		
		try {
			validator.validateDateBeforeTodayForCreateEvent(event);
			fail("should throw exception");
		} catch (ValidationBusinessException e) {
			assertEquals("A data do evento deve ser igual ou maior que a de hoje", e.getMessage());
		}
	}
	
	@Test
	public void shouldNotSetErrorMessageWhenValidadeEventWithDateFromToday(){
		LocalDate today = LocalDate.now();
		Event event = new Event();
		event.setEventDate(today);
		
		validator.validateDateBeforeTodayForCreateEvent(event);
	}
	
	
	@Test
	public void shouldNotSetErrorMesssageWhenValidateEventWithDateGreaterThanToday(){
		LocalDate tomorrow = LocalDate.now();
		Event event = new Event();
		event.setEventDate(tomorrow);
		
		validator.validateDateBeforeTodayForCreateEvent(event);
	}
	
	

}
