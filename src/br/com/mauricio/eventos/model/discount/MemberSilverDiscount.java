package br.com.mauricio.eventos.model.discount;

public class MemberSilverDiscount implements Discount {

	@Override
	public Integer getDiscount() {
		return 60;
	}

}
