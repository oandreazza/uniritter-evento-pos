package br.com.mauricio.eventos.model.discount;

public class MemberGoldDiscount implements Discount{

	@Override
	public Integer getDiscount() {
		return 75;
	}

}
