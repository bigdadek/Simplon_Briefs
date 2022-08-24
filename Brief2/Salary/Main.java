package Salary;

import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		
		String str=" ";
		int nbr=0;
		int choice;

		Employee E= new Employee(str,str,nbr,nbr,nbr);
		
		Scanner s1 = new Scanner(System.in);
		
			System.out.println("Give the information of the employee : ");
			
			System.out.print("The  first   name :   ");
			str=s1.nextLine();
			E.setFirstName(str);
			
			System.out.print("The  family  name :   ");
			str=s1.nextLine();
			E.setFamilyName(str);
			
			System.out.println("The date of birth :");
			
			System.out.print("		 Day   :   ");
			nbr=s1.nextInt();
			E.setDay(nbr);
			
			System.out.print("		 Month :   ");
			nbr=s1.nextInt();
			E.setMonth(nbr);
			
			System.out.print("		 Year  :   ");
			nbr=s1.nextInt();
			E.setYear(nbr);
		

			System.out.println("  Full name : "+E.getFirstName()+" "+E.getFamilyName()+"  |   Date of birth :  "+E.getDay()+"/"+E.getMonth()+"/"+E.getYear()+"\n");
		do{

			System.out.println("        --- Menu :---");
			System.out.println("        1-Fixed Employee. ");
			System.out.println("        2-Employe Commission.");
			System.out.println("        3-Hourly Employee.");
			System.out.println("        0-Exit.");
			System.out.print(" Give a number between 0 and 3 : \n 	--->  ");
			choice=s1.nextInt();
		}while(choice<0 || choice>3);
		
	    switch (choice) {
	    case 1 : FixedEmployee E1 = new FixedEmployee(E.getFirstName(),E.getFamilyName(),E.getDay(),E.getMonth(),E.getYear());
	    		 E1.FixedE();
	             break;
	    case 2 : EmployeCommission E2= new EmployeCommission(E.getFirstName(),E.getFamilyName(),E.getDay(),E.getMonth(),E.getYear());
	    		 E2.ECommission();
	             break;
	    case 3 : HourlyEmployee E3 = new HourlyEmployee(E.getFirstName(),E.getFamilyName(),E.getDay(),E.getMonth(),E.getYear());
	    		 E3.HourlyE();
	             break;
	    case 0 : System.out.println("\n    Exit");
	             break;
	
	    }

	}

}

