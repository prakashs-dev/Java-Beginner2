package com.OOPS;

public class Encapsulation {
	String name;
	int age;
	double salary;
	String gender;
	
	Encapsulation(String na, int ag, double sal, String gen){
		this.name = na;
		this.age = ag;
		this.salary = sal;
		this.gender = gen;
	}
	public void getResult() {

		System.out.println("Name:: "+name+" Age:: "+age+" Salary:: "+salary+" Gender:: "+gender);
	}
	public static void main(String[] args) {
		
		Encapsulation encaps = new Encapsulation("Rook",25,45000,"Male");
		encaps.getResult();
		
		
	}
}
