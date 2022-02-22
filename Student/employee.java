package com.capgemininew;

public class employee {
	String name;
	int id;
	String domain;
	String company;
		public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDomain() {
		return domain;
	}
	public void setDomain(String domain) {
		this.domain = domain;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
		public static void main(String[] args) {
			employee obj=new employee();
			obj.setId(2);
			obj.setCompany("capgemnni");
			obj.setDomain("react");
			obj.setName("Sabah");
			System.out.println(obj.getId());
			System.out.println(obj.getName());
			System.out.println(obj.getDomain());
			System.out.println(obj.getCompany());

		}

}
