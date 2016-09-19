package br.com.mauricio.eventos.validator;

import org.apache.commons.lang3.StringUtils;

import br.com.mauricio.eventos.exception.ValidationMandatoryException;
import br.com.mauricio.eventos.model.Event;

public class EventValidator {

	public void validateName(Event event) {
		if(StringUtils.isEmpty(event.getName()))
			throw new ValidationMandatoryException();
	}
	
	
	

}
