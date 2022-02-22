package com.capgemininew;

public class Student {
	String name;
	int age;
	int rollnum;
	
	public static void main(String[]args) {
		Student st=new Student();
		st.setName("Sabah");
		st.setAge(20);
		st.setRollnum(2022);
		
		System.out.println(st.getName());
		System.out.println(st.getName());
		System.out.println(st.getRollnum());	
	}
    
	
	public String getName() {
    	return name;
    }
    public void setName(String name) {
    	this.name= name;
    }
    public void setAge(int age) {
    	this.age= age;
    }
    public int getRollnum() {
    	return rollnum;
    }
    public void setRollnum(int rollnum) {
    	this.rollnum= rollnum;
    }
}
