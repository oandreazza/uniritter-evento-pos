package br.com.mauricio.eventos.validator;

import java.util.List;
import static java.util.stream.Collectors.*;

import org.apache.commons.lang3.StringUtils;
import org.joda.time.LocalDate;

import br.com.mauricio.eventos.exception.ValidationBusinessException;
import br.com.mauricio.eventos.exception.ValidationMandatoryException;
import br.com.mauricio.eventos.model.Event;
import br.com.mauricio.eventos.model.Ticket;

public class EventValidator {

	private static final String INVALID_DATE_SALE_PERIOD_MESSAGE = "A data de início de venda deve ser inferior a data de fim";
	private static final LocalDate TODAY = LocalDate.now();
	private static final String INVALID_DATE_EVENT_MESSAGE = "A data do evento deve ser igual ou maior que a de hoje";
	private static final int MAX_NAME_CHARACTERS = 150;
	private static final String MAX_NAME_CHARACTERS_MESSAGE = "O nome permite no máximo 150 caracteres";

	public void validate(Event event) {
		validateNameMandatory(event);
		validateDateMandatory(event);
		validateMaxNameCharacters(event);
		validateDateBeforeTodayWhenCreateEvent(event);
		validateDuplicatedTicketsWhenCreate(event);
	}
	
	
	public void validateNameMandatory(Event event) {
		if(StringUtils.isEmpty(event.getName()))
			throw new ValidationMandatoryException();
	}

	public void validateDateMandatory(Event event) {
		if(event.getEventDate() == null)
			throw new ValidationMandatoryException();
	}

	public void validateMaxNameCharacters(Event event) {
		if(event.getName().length() > MAX_NAME_CHARACTERS)
			throw new ValidationBusinessException(MAX_NAME_CHARACTERS_MESSAGE);
		
	}

	public void validateDateBeforeTodayWhenCreateEvent(Event event) {
		if(event.getEventDate().isBefore(TODAY))
			throw new ValidationBusinessException(INVALID_DATE_EVENT_MESSAGE);
	}


	public void validateDuplicatedTicketsWhenCreate(Event event) {
		List<Ticket> ticketList = event.getTickets();
		
		boolean hasDuplicatedTickets = !ticketList.stream().collect(groupingBy(e -> e.getClass(), counting())).entrySet().stream().filter(i -> i.getValue() > 1).collect(toList()).isEmpty();
		if(hasDuplicatedTickets)
			throw new ValidationBusinessException();
	}


	public void validateSaleDatePeriod(Event event) {
		if(event.getInitialSale().isAfter(event.getEndSale()))
			throw new ValidationBusinessException(INVALID_DATE_SALE_PERIOD_MESSAGE);
	}
	
	


	
	
	

}
