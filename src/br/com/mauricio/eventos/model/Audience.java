package br.com.mauricio.eventos.model;

public class Audience implements Ticket {

	@Override
	public Double getPrice() {
		return 300.00;
	}

}
