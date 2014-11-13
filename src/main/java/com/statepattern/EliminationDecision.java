package com.statepattern;

import java.util.ArrayList;

public class EliminationDecision implements EliminationState {
	EliminationState state;

	public EliminationState getState() {
		return state;
	}

	public void setState(EliminationState state) {
		this.state = state;
	}

	public ArrayList<Customer> eliminate(ArrayList<Customer> customer) {
		// TODO Auto-generated method stub
		return this.getState().eliminate(customer);
	}

}
