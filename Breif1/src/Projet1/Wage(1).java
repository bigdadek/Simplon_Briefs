package Projet1;

import java.util.Scanner;

public class Wage {
	
	public static void Hello() // welcome function
	{
		
		String Name;
		Scanner s1 = new Scanner(System.in);
		System.out.print("What's your name :  ");
		Name=s1.nextLine();
		System.out.println("\n   Welcome "+Name+" .");
		//s1.close();
		
	}
	
	public static void Weekly() // function for calculate the weekly wage
	{
		float hourSalary; // the hourly wage
		int hours;     //  working hours
		double wage;
		Scanner s2 = new Scanner(System.in);
		
		do {
			System.out.print("\nGive the number of working hours in the week [Max = 50h] :  ");
			hours=s2.nextInt();
			if(hours>50)
				System.out.println(" !!! You can't work more than 50 hours in a week.");
		}while(hours<0 || hours>50);
		
		do {
			System.out.print("\nGive the hourly salary [Min = 25dh] :  ");
			hourSalary=s2.nextFloat();
			if(hourSalary<25)
				System.out.println(" !!! Minimum hourly wage is 25dh.");
		}while(hourSalary<25);
		
			// calculate the wage
		 if(hours<40)
			 wage = hours*hourSalary ;
		 else
			wage = (40*hourSalary)+(hours-40)*1.5*hourSalary;
		 System.out.println("\nThe hourly wage is "+hourSalary+"dh, than the salary of working "+hours+" hours in a week is : * "+wage+" dh. *");
		//s2.close();
		 
	}
	
	public static void Montly() // function for calculating the monthly wage
	{
		float hourSalary; // the hourly wage
		int hours;     //  working hours
		double wage;
		Scanner s3= new Scanner(System.in);
		
		do {
			System.out.print("\nGive the number of working hours in the month [Max = 200h] :  ");
			hours=s3.nextInt();
			if(hours>200)
				System.out.println(" !!! You can't work more than 200 hours in a month.");
		}while(hours<0 || hours>200);
		
		do {
			System.out.print("\nGive the hourly salary [Min = 20dh] :  ");
			hourSalary=s3.nextFloat();
			if(hourSalary<20)
				System.out.println(" !!! Minimum hourly wage is 20dh.");
		}while(hourSalary<20);
		
				// calculate the wage
		 if(hours>180)
			 wage = 180*hourSalary + (hours-180) * 1.5 * hourSalary;
		 else
			 wage = hours*hourSalary ;
		 
		 System.out.println("\nThe hourly wage is "+hourSalary+"dh, than the salary of working "+hours+" hours in a month is : * "+wage+" dh. *");
		//s3.close();
		 
	}
	
	public static void main(String[] args)
	{
		Scanner s0= new Scanner(System.in);
		int ch;
		
		Hello();
		
		 //MENU
		do
		{
			System.out.println("\n      --- Menu:---     \n1- Weekly wage.     \n2- Montly wage.     \n0- Exit.");
			System.out.print("  Chose a number between 0 and 2.\n    --->  ");
			ch=s0.nextInt();
		}while(ch>2 || ch<0);
		
			
		switch (ch)
		{
			case 1: Weekly();
				break;
				
			case 2: Montly();
				break;
				
			case 0: System.out.println("\n  EXIT.");
				break;
		}
		s0.close();
	}
	
}
