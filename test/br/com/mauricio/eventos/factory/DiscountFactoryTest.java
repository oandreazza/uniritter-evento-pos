package br.com.mauricio.eventos.factory;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.junit.Assert.assertThat;

import org.junit.Test;

import br.com.mauricio.eventos.model.Discount;
import br.com.mauricio.eventos.model.StudentDiscount;
import br.com.mauricio.eventos.model.Purchaser;

public class DiscountFactoryTest {


	@Test
	public void shouldReturnFiftyPerCentWhenPurchaserIsStudent() {
		Discount discount = DiscountFactory.build(Purchaser.STUDENT);
		
		assertThat(discount, instanceOf(StudentDiscount.class));
	}

}
