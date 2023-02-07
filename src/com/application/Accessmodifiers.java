package com.application;

public class Accessmodifiers {
	private static String priv_name = "Vijay";
	public static String pub_name ="Aakash";
	protected static String proc_name = "Scuba";

	
	public static void method() {
		System.out.println(priv_name);
	}

	public static void main(String[] args) {
		String def_name = "Lak";
		System.out.println(pub_name);
		System.out.println(def_name);
		method();
	}

}
