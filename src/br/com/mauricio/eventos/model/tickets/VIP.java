package br.com.mauricio.eventos.model.tickets;

public class VIP implements Ticket {

	@Override
	public Double getPrice() {
		return 1000.00;
	}

}
