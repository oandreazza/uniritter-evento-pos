package br.com.mauricio.eventos.model;

public class ElderDiscount implements Discount {

	@Override
	public Integer getDiscount() {
		return 50;
	}

}
