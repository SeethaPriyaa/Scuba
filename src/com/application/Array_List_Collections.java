package com.application;

import java.util.ArrayList;

public class Array_List_Collections {

	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<String>();
	      list.add("Apple");    
	      list.add("Banana");    
	      list.add("Grapes");    
	      list.add("Mango");
	      list.add("Banana");
	      
	      for(int i=0; i<list.size();i++) {
	    	  System.out.println(list.get(i));
	      }
	 }  

}
