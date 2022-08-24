package Salary;

import java.util.Scanner;

public class HourlyEmployee extends Employee{

	private double hourlySalary;
	private double hoursWorked;

	public double getHourlySalary() {
		return hourlySalary;
	}

	public void setHourlySalary(double hourlySalary) {
		this.hourlySalary = hourlySalary;
	}

	public double getHoursWorked() {
		return hoursWorked;
	}

	public void setHoursWorked(double hoursWorked) {
		this.hoursWorked = hoursWorked;
	}

	public HourlyEmployee(String firstName , String familyName , int day , int month , int year)
	{

		super(firstName , familyName , day , month , year);
	}
	
	public void HourlyE() {
		Scanner s2 = new Scanner(System.in);
		double X;
		 
		 System.out.println("\n ----Hourly Employee----");
		 
		System.out.print("Give the hourly salary :    ");
		X=s2.nextDouble();
		setHourlySalary(X);
		
		System.out.print("Give the number of the work hours :  ");
		X=s2.nextDouble();
		setHoursWorked(X);
		
		X = getHourlySalary() * getHoursWorked();
		
		super.setMonthlySalary(X);
		
		System.out.println("The employee Montly Salary is : "+super.getMonthlySalary()+" DH.");
	}

}
