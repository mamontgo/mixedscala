package com.monty.java;

public class PersonBean {
	
	
	public PersonBean(String name, Double amount) {
		super();
		this.name = name;
		this.amount = amount;
	}
	private String name;
	private Double amount;
	
	
	public Double getAmount() {
		return amount;
	}
	public void setAmount(Double amount) {
		this.amount = amount;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString(){
		return "Person(" + name + "," + amount + ")";
	}
}
