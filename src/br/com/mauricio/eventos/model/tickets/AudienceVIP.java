package br.com.mauricio.eventos.model.tickets;

public class AudienceVIP implements Ticket {

	@Override
	public Double getPrice() {
		return 500.00;
	}

}
