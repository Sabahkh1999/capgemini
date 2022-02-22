package com.capgemininew;

public class pen {
	String pencolor;
	String penink;
	int pencost;
		public String getPencolor() {
		return pencolor;
	}
	public void setPencolor(String pencolor) {
		this.pencolor = pencolor;
	}
	public String getPenink() {
		return penink;
	}
	public void setPenink(String penink) {
		this.penink = penink;
	}
	public int getPencost() {
		return pencost;
	}
	public void setPencost(int pencost) {
		this.pencost = pencost;
	}
		public static void main(String[] args) {
			pen p=new pen();
			p.setPencolor("orange");
			p.setPencost(5);
			p.setPenink("blue");
			System.out.println(p.getPencolor());
			System.out.println(p.getPencost());
			System.out.println(p.getPenink());

		}


}
