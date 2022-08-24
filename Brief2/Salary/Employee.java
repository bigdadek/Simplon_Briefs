package Salary;

import java.util.Scanner;

public class Employee {
	private String firstName;
	private String familyName;
	private int day;
	private int month;
	private int year;
	private double monthlySalary;
		

	public Employee(String firstName, String familyName, int day, int month, int year)
	{
		this.firstName = firstName;
		this.familyName = familyName;
		this.day = day;
		this.month = month;
		this.year = year;
	}


	public double getMonthlySalary()
	{
		return monthlySalary;
	}

	public void setMonthlySalary(double monthlySalary)
	{
		this.monthlySalary = monthlySalary;
	}
	public String getFirstName()
	{
		return firstName;
	}
	
	public void setFirstName(String firstName)
	{
		this.firstName = firstName;
	}
	
	public String getFamilyName()
	{
		return familyName;
	}
	
	public void setFamilyName(String familyName)
	{
		this.familyName = familyName;
	}
	
	public int getDay()
	{
		return day;
	}
	
	public void setDay(int day)
	{
		this.day = day;
	}
	
	public int getMonth()
	{
		return month;
	}
	
	public void setMonth(int month)
	{
		this.month = month;
	}
	
	public int getYear()
	{
		return year;
	}
	
	public void setYear(int year)
	{
		this.year = year;
	}
}
