package com.statepattern;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.Test;

public class EliminationDecisionTests {
	@Test
	public void performElimination(){
		Customer customer=new Customer("Test1","Test address",123445);
		ArrayList<Customer> list=new ArrayList<Customer>();
		assertEquals(0,list.size());
		list.add(customer);
		assertEquals(1,list.size());
		EliminationDecision decide=new EliminationDecision();
		decide.setState(new NumbersElimination());
		decide.eliminate(list);
		assertEquals(0,list.size());
	}

}
