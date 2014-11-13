package com.statepattern;

import java.util.ArrayList;

public class NumbersElimination implements EliminationState{


	public ArrayList<Customer> eliminate(ArrayList<Customer> customer) {
		// TODO Auto-generated method stub
		customer.remove(customer.size()-1);
		return customer;
	}

}
