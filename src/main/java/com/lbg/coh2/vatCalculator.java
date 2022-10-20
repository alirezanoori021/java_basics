package com.lbg.coh2;

public class vatCalculator {
	private double vat;
	private double cost;
	private int quantity;
	
	public vatCalculator(double vat, double cost, int quantity) {
		super();
		this.vat = vat;
		this.cost = cost;
		this.quantity = quantity;
	}
   
	
	public double getVat() {
		return vat;
	}
	
	public double getCost() {
		return cost;
	}
	
	public int getQuantity() {
		return quantity;
	}
	
	public double getTotalPrice() {
		return (((getVat()*getCost())/100 + getCost())*getQuantity());
		
	}
	
	
}
