package br.com.mauricio.eventos.model;

public class MemberGoldDiscount implements Discount{

	@Override
	public Integer getDiscount() {
		return 75;
	}

}
