package br.com.mauricio.eventos.model.discount;

public class NoDiscount implements Discount {

	@Override
	public Integer getDiscount() {
		return null;
	}

}
