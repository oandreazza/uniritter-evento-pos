package br.com.mauricio.eventos.model;

public class StudentDiscount implements Discount {

	@Override
	public Integer getDiscount() {
		return 50;
	}

}
