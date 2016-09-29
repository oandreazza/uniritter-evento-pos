package br.com.mauricio.eventos.model;

import br.com.mauricio.eventos.model.discount.Discount;
import br.com.mauricio.eventos.model.discount.ElderDiscount;
import br.com.mauricio.eventos.model.discount.MemberGoldDiscount;
import br.com.mauricio.eventos.model.discount.MemberSilverDiscount;
import br.com.mauricio.eventos.model.discount.NoDiscount;
import br.com.mauricio.eventos.model.discount.StudentDiscount;

public enum Purchaser {
	
	STUDENT( new StudentDiscount()), 
	ELDER( new ElderDiscount()), 
	MEMBER_GOLD(new MemberGoldDiscount()), 
	MEMBER_SILVER(new MemberSilverDiscount()), 
	GENERAL(new NoDiscount());
	
	
	private Discount discount;

	private Purchaser(Discount discount){
		this.discount = discount;
	}
	
	public Discount getDiscount(){
		return this.discount;
	}

}
