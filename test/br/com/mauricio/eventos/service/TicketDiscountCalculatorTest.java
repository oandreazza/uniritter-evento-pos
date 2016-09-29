package br.com.mauricio.eventos.service;

import static org.mockito.Mockito.verify;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

public class TicketDiscountCalculatorTest {

	@Mock
	private DiscountStrategy defaultDiscountStrategy;
	private TicketDiscountCalculator ticketCalculator;
	
	@Before
	public void setup(){
		MockitoAnnotations.initMocks(this);
		ticketCalculator = new TicketDiscountCalculator(defaultDiscountStrategy);		
	}
	
	@Test
	public void shouldGetValueFromStrategyDiscount(){
		ticketCalculator.getValue();
		
		verify(defaultDiscountStrategy).calcule();
		
	}

}
