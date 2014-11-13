package com.statepattern;

public class Customer {
	private String name;
	private String address;
	private long phone_number;
	public Customer(String name,String address,long phone_number){
		this.name=name;
		this.address=address;
		this.phone_number=phone_number;
	}
	public String getName() {
		return name;
	}
	
	public String getAddress() {
		return address;
	}
	public long getPhone_number() {
		return phone_number;
	}
	

}
