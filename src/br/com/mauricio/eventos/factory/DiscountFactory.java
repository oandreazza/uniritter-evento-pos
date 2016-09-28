package br.com.mauricio.eventos.factory;

import br.com.mauricio.eventos.model.Discount;
import br.com.mauricio.eventos.model.ElderDiscount;
import br.com.mauricio.eventos.model.MemberGoldDiscount;
import br.com.mauricio.eventos.model.MemberSilverDiscount;
import br.com.mauricio.eventos.model.NoDiscount;
import br.com.mauricio.eventos.model.StudentDiscount;
import br.com.mauricio.eventos.model.Purchaser;

public class DiscountFactory {

	public static Discount build(Purchaser purchaser) {
		
		switch (purchaser) {
		case STUDENT:
			return new StudentDiscount();
		case ELDER:
			return new ElderDiscount();
		case MEMBER_GOLD:
			return new MemberGoldDiscount();
		case MEMBER_SILVER:
			return new MemberSilverDiscount();
		default:
			return new NoDiscount();
		}
		
	}

}
