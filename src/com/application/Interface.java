package com.application;

public class Interface {

	public static void main(String[] args) {
       Exams e = new Exams();
       e.marks();
	}

}

interface Annual{
	void marks();
}

class Exams implements Annual{
public void marks() {
	System.out.println("the marks secured is 90");
}
}
