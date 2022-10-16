package com.nyc.practiceoops;

public class PracticeB {
	
	public  void getFahimDetails() {
		String name = "Zawadul Haque";
	    long Salary = 200000000L;
		String Address = "466 Crescent Street, Brooklyn, NY 11208";
		double Bonus = 50000.45;
		char currency = '$';
		
	   System.out.println("Employee Name:"+ name);
	   System.out.println("Employee Salary:"+ Salary);
	   System.out.println("Employee Bonus:"+ Bonus);
	   System.out.println("Employee Address:"+ Address);
	   System.out.println("Employee is Getting Paid in:"+ currency);
	}
	public static void getSchoolInfo() {
		String SchoolName = "The City College of New York";
		String SchoolwasFounded = "The City College of New York was Built in 1847";
		int NumberofStudentsEnrolled = 16161;
		String NameofThePresident = "Vincent Boudraeu";
		
		System.out.println(SchoolName );
		System.out.println(SchoolwasFounded);
		System.out.println("The Number of Students currently Enrolled:"+ NumberofStudentsEnrolled);
		System.out.println("The Name of the The City College of New York's Current president is " + NameofThePresident);
		
	}
	

	public static void main(String[] args) {
		PracticeB Details = new PracticeB();
		 Details.getFahimDetails();
	     PracticeB.getSchoolInfo();
	    
	}
}

