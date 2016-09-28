package br.com.mauricio.eventos.factory;

import br.com.mauricio.eventos.model.Discount;
import br.com.mauricio.eventos.model.StudentDiscount;
import br.com.mauricio.eventos.model.Purchaser;

public class DiscountFactory {

	public static Discount build(Purchaser purchaser) {
		
		switch (purchaser) {
		case STUDENT:
			return new StudentDiscount();
		default:
			break;
		}
		
		return null;
	}

}
