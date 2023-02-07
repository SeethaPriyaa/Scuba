package com.application;

public class Singleton {

	public static void main(String[] args) {
		SingletonClass single1 =  SingletonClass.getInstance();  
		System.out.println(single1.string);
	}

}

class SingletonClass{
	
	private static SingletonClass singletonObject = new SingletonClass();
	public String string;
	
	private SingletonClass(){
		System.out.println("Object created for SingletonClass");
		string = "Common for all instance";
	}
	
	public static SingletonClass getInstance() {
		return singletonObject;
	}
}
