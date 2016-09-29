package br.com.mauricio.eventos.model.discount;

public class StudentDiscount implements Discount {

	@Override
	public Integer getDiscount() {
		return 50;
	}

}
