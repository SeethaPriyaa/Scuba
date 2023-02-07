package com.application;

public class Static {
	
	public static String name = "Seethalakshmi";
	
	static class static_class{
		public void print() {
			System.out.println(" The name is "+name);
		}
	}

	public static void main(String[] args) {
		static_class s = new static_class();
		s.print();
	}

}
