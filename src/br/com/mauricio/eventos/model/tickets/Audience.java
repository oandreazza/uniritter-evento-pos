package br.com.mauricio.eventos.model.tickets;

public class Audience implements Ticket {

	@Override
	public Double getPrice() {
		return 300.00;
	}

}
