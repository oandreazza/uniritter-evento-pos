package br.com.mauricio.eventos.factory;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.junit.Assert.assertThat;

import org.junit.Test;

import br.com.mauricio.eventos.model.Discount;
import br.com.mauricio.eventos.model.ElderDiscount;
import br.com.mauricio.eventos.model.MemberGoldDiscount;
import br.com.mauricio.eventos.model.MemberSilverDiscount;
import br.com.mauricio.eventos.model.StudentDiscount;
import br.com.mauricio.eventos.model.Purchaser;

public class DiscountFactoryTest {
	
	private Discount discount;


	@Test
	public void shouldReturnStudentDiscountWhenPurchaserIsStudent() {
		discount = DiscountFactory.build(Purchaser.STUDENT);
		
		assertThat(discount, instanceOf(StudentDiscount.class));
	}
	
	@Test
	public void shouldReturnElderDiscountWhenPurchaserIsElder(){
		 discount = DiscountFactory.build(Purchaser.ELDER);
		 
		 assertThat(discount, instanceOf(ElderDiscount.class));
	}
	
	@Test
	public void shouldReturnGoldMemberDiscountWhenPurchaserIsGoldMember(){
		 discount = DiscountFactory.build(Purchaser.MEMBER_GOLD);
		 
		 assertThat(discount, instanceOf(MemberGoldDiscount.class));
	}
	
	@Test
	public void shouldReturnSilverMemberDiscountWhenPurchaserIsSilverMember(){
		discount = DiscountFactory.build(Purchaser.MEMBER_SILVER);
		
		assertThat(discount, instanceOf(MemberSilverDiscount.class));
	}
	
	
	
	

}
