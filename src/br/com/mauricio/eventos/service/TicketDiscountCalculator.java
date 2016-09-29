package br.com.mauricio.eventos.service;

public class TicketDiscountCalculator {


	private DiscountStrategy discountStrategy;


	public TicketDiscountCalculator(DiscountStrategy discountStrategy){
		this.discountStrategy = discountStrategy;
	}


	public Double getValue() {
		return discountStrategy.calcule();
	}
		


}
