package com.capgemininew;

public class car {
	String car;
	int cost;
	String company;
	int warranty;
	public String getCar() {
		return car;
	}
	public void setCar(String car) {
		this.car = car;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public int getWarrenty() {
		return warranty;
	}
	public void setWarranty(int warranty) {
		this.warranty = warranty;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		car c=new car();
		c.setCar("benz");
		c.setCompany("hyundai");
		c.setCost(8000000);
		c.setWarranty(15);
		System.out.println(c.getCar());
		System.out.println(c.company);
		System.out.println(c.getCost());
		System.out.println(c.getWarrenty());

	}

}
