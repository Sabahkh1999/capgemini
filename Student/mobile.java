package com.capgemininew;

public class mobile {
	String mname;
	String comapny;
	public String getMname() {
		return mname;
	}

	public void setMname(String mname) {
		this.mname = mname;
	}

	public String getComapny() {
		return comapny;
	}

	public void setComapny(String comapny) {
		this.comapny = comapny;
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

	int cost;

	public static void main(String[] args) {
	mobile m=new mobile();
	m.setComapny("mi");
	m.setCost(1000);
	m.setMname("redmi note 8");
	System.out.println(m.getMname());
	System.out.println(m.getComapny());
	System.out.println(m.getCost());


	}

}
