package com.statepattern;

import java.util.ArrayList;

public class NoNumberElimination implements EliminationState {


	public ArrayList<Customer> eliminate(ArrayList<Customer> customer) {
		//customer.remove(customer.size()-1);
		return customer;
		
	}
	

}
