package com.capgemininew;

public class notebook {
	int noofpages;
	public int getNoofpages() {
		return noofpages;
	}

	public void setNoofpages(int noofpages) {
		this.noofpages = noofpages;
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

	public String getQuality() {
		return quality;
	}

	public void setQuality(String quality) {
		this.quality = quality;
	}

	int cost;
	String quality;

		public static void main(String[] args) {
			// TODO Auto-generated method stub
	   notebook n=new notebook();
	   n.setCost(20);
	   n.setNoofpages(100);
	 n.setQuality("good");
	 System.out.println(n.getCost());
	 System.out.println(n.getNoofpages());
	 System.out.println(n.getQuality());

		}

}
