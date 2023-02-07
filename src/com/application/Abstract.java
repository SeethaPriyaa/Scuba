package com.application;

public class Abstract {

	public static void main(String[] args) {
		Employee e = new Bonus();
		e.salary("Fifty thousand");
	}
}


abstract class Employee{
	abstract void salary(String amount);
}

class Bonus extends Employee{
	void salary(String amount){
		System.out.println("Salary amount is "+amount);
	}
}


