package Salary;


import java.util.Scanner;

public class EmployeCommission extends Employee {

	private double sales ;
	private double commission ;
	private double salary;
	
	public EmployeCommission(String firstName , String familyName , int day , int month , int year)
	{

		super(firstName , familyName , day , month , year);
		
	}
	
	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	public double getSales() {
		return sales;
	}

	public void setSales(double sales) {
		this.sales = sales;
	}

	public double getCommission() {
		return commission;
	}

	public void setCommission(double commission) {
		this.commission = commission;
	}

	

		public void ECommission() 
		{
			
			Scanner s3 = new Scanner(System.in);
			 double X ;
			 
			 System.out.println("\n ----Employe Commission----");
			 
			System.out.print("Give the number of sales :  ");
			X=s3.nextDouble();
			setSales(X);
			
			System.out.print("Give the number of commission :  ");
			X=s3.nextDouble();
			setCommission(X);
			
			System.out.print("What's the employee's salary : ");
			X=s3.nextDouble();
			setSalary(X);
			
			X = getSalary() + getSales()*getCommission();
			
			super.setMonthlySalary(X);
			
			System.out.println("The employee Montly Salary is : "+super.getMonthlySalary()+" DH.");
		}

}
