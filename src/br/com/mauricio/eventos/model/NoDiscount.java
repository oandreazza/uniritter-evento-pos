package br.com.mauricio.eventos.model;

public class NoDiscount implements Discount {

	@Override
	public Integer getDiscount() {
		return null;
	}

}
