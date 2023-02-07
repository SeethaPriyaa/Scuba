package com.application;

public class Inheritance {
	
	public static void main(String[] args) {
			Student s = new Student();
			s.student_details(001,"Yes");
	}
}
   class Student extends School{
		
	public void student_details(int Student_id,String Student_name) {
			System.out.println("Student_id:"+Student_id);
			System.out.println("Student_name:"+Student_name);
			System.out.println("school_id:"+school_id);
			System.out.println("school_name:"+school_name);
		}
		
	}

	 class School
	{
		public String school_name="KVB";
		public static int school_id = 1234;
	
	}
//	
//
//	 public static void main(String args[])
//	    {
//	        Engineer E1 = new Engineer();
//	        System.out.println("Salary : " + E1.salary
//	                           + "\nBenefits : " + E1.benefits);
//	    }
//}
//	class Employee {
//	    int salary = 60000;
//	}
//	 
//	class Engineer extends Employee {
//	    int benefits = 10000;
//	}


	   


