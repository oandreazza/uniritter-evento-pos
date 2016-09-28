package br.com.mauricio.eventos.service;

import org.junit.Test;

import br.com.mauricio.eventos.model.Audience;
import br.com.mauricio.eventos.model.Student;

public class TicketDiscountCalculatorTest {



	@Test
	public void shouldReceiveTicketAndPublicWhenCalculateDiscount(){
		TicketDiscountCalculator ticketCalculator = new TicketDiscountCalculator(new Audience(), new Student() ); 
	}

}
