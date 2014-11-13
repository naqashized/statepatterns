package com.statepattern;

import java.util.ArrayList;

public class App {

	static ArrayList<Customer> customer;
	static Customer customer1;
	static Customer customer2;
	static Customer customer3;
	
	public static void main(String[] args) {
		customer=new ArrayList<Customer>();
		customer1=new Customer("B Tory","Street 12, Bore Road",23456788);
		customer.add(customer1);
		customer2=new Customer("C Tory","Street 12, Core Road",23456788);
		customer.add(customer2);
		customer3=new Customer("D Tory","Street 12, Core Road",23456788);
		customer.add(customer3);
		//customer.contains(o)
		EliminationDecision decide=new EliminationDecision();
		decide.setState(new NumbersElimination());
		decide.eliminate(customer);
		for(int i=0;i<customer.size();i++){
			System.out.println("Name: "+customer.get(i).getName());
			System.out.println("Address: "+customer.get(i).getAddress());
			System.out.println("Name: "+customer.get(i).getPhone_number());
		}
		

	}

}
