package br.com.mauricio.eventos.validator;

import org.apache.commons.lang3.StringUtils;

import br.com.mauricio.eventos.exception.ValidationBusinessException;
import br.com.mauricio.eventos.exception.ValidationMandatoryException;
import br.com.mauricio.eventos.model.Event;

public class EventValidator {

	private static final int MINIMUM_NAME_CHARACTERS = 150;
	private static final String MINIMUM_NAME_CHARACTERS_MESSAGE = "O nome do evento deve conter no mínimo 150 caracteres";

	public void validateNameMandatory(Event event) {
		if(StringUtils.isEmpty(event.getName()))
			throw new ValidationMandatoryException();
	}

	public void validateDateMandatory(Event event) {
		if(event.getEventDate() == null)
			throw new ValidationMandatoryException();
	}

	public void validateMinimumNameCharacters(Event event) {
		if(event.getName().length() < MINIMUM_NAME_CHARACTERS)
			throw new ValidationBusinessException(MINIMUM_NAME_CHARACTERS_MESSAGE);
		
	}
	
	
	

}
