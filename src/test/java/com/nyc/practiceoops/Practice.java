package com.nyc.practiceoops;

public class Practice {

	private String name = "Fahim";
	private String jobtitle = "Software QA Engineer";
	private int Salary = 110000;
	
	
	public String getName() {
		return name;
	}

	public String getJobittle() {
		return jobtitle;
	}

	public int getSalary() {
		return Salary;
	}
	public static void main(String[] args) {
		Practice Fahim = new Practice();
		Fahim.getName();
		System.out.println("Employee Name is " + Fahim.getName());
		
	}
}