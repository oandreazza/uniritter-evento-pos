package br.com.mauricio.eventos.service;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import br.com.mauricio.eventos.model.Purchaser;
import br.com.mauricio.eventos.model.tickets.Audience;

public class DefaultDiscountStrategyTest {

	private DefaultDiscountStrategy defaultDiscount;

	@Before
	public void setUp() throws Exception {
		defaultDiscount = new DefaultDiscountStrategy(new Audience(), Purchaser.ELDER);
	}

	@Test
	public void shouldCalcutaDiscountDefaultAsSubtractingPercentageFromTicketPrice() {
		assertEquals(150.00, defaultDiscount.calcule(),2);
	}

}
