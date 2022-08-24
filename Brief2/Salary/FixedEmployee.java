package Salary;


import java.util.Scanner;

public class FixedEmployee extends Employee {
	

	public FixedEmployee(String firstName , String familyName , int day , int month , int year) {
		
		super(firstName , familyName , day , month , year);
		
	}
	public void FixedE() {
		double X;
		Scanner s0= new Scanner(System.in);
		
		System.out.println("\n ----Fixed Employee----");
		
		System.out.print("What's the employee's salary : ");
		X=s0.nextDouble();
		super.setMonthlySalary(X);

	
		System.out.println("The employee Montly Salary is : "+super.getMonthlySalary()+" DH.");
	
	}
}

