package br.com.mauricio.eventos.exception;

public class ValidationBusinessException extends RuntimeException {

	
	private static final long serialVersionUID = 1L;
	
	
	public ValidationBusinessException(String message) {
		super(message);
	}


}
