package com.statepattern;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class NumbersEliminationTests {

	@Test
	public void eliminate() {
		Customer customer=new Customer("Test1","Test address",123445);
		ArrayList<Customer> list=new ArrayList<Customer>();
		assertEquals(0,list.size());
		list.add(customer);
		assertEquals(1,list.size());
		NumbersElimination elimination=new NumbersElimination();
		elimination.eliminate(list);
		assertEquals(0,list.size());
	}

}
