package br.com.mauricio.eventos.service;

import static org.junit.Assert.*;

import org.junit.Test;

import br.com.mauricio.eventos.model.Purchaser;
import br.com.mauricio.eventos.model.tickets.Audience;

public class TicketDiscountCalculatorTest {



	@Test
	public void shouldCalculate(){
		TicketDiscountCalculator ticketCalculator = new TicketDiscountCalculator(new Audience(), Purchaser.STUDENT );
		
		assertEquals(150.00, ticketCalculator.calculate(),2);
	}

}
