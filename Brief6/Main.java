
import java.util.Scanner;

import Categorie.CategEmp;
import Product.ProEmp;
import Product.Product;

public class Main {

	public static void main(String[] args) {
 
	Scanner reader = new Scanner(System.in);
	

	float Prix;
	String date;
	String Nom;
	int Categ,id;
  
    int choice;
	do {
		
		System.out.print("\n\n -----MENU-----\n 1- Add product. \n 2- Update product. \n 3- Delete product. \n 4- Add categorie. \n 5- Update categorie. \n 6- Delete categorie. \n 7- Read product. \n 8- Read categorie. \n 9- Read products by the categorie. \n 0- Exit. \n \t -----> ");
		choice = reader.nextInt();
		
		
		switch(choice) {
		case 1 :
			  System.out.println("Give the product information : ");
			  System.out.println("Id :  ");
			  id  = reader.nextInt();
			  System.out.print("Name  :  ");
			  Nom = reader.next();
			  System.out.print("Price  :  ");
			  Prix = reader.nextFloat();
			  System.out.print("Date  :  ");
			  date = reader.next();
			  System.out.print("Categorie [Int] :  ");
			  Categ = reader.nextInt();
			  
			  
			  Product  newProduct   = new Product(id,Nom,Prix,date,Categ);
		      ProEmp   prod = new  ProEmp();
		  	  prod.AddProduct(newProduct);
		  	  break;
			
		case 2 :
				System.out.println("Id of the product that you want to change :  ");
				id  = reader.nextInt();
				System.out.print("Name  :  ");
				Nom = reader.next();
				System.out.print("Price  :  ");
				Prix = reader.nextFloat();
				System.out.print("Date  :  ");
				date = reader.next();
				System.out.print("Categorie [Int] :  ");
				Categ = reader.nextInt();
				Product  newP   = new Product(id,Nom,Prix,date,Categ);
			    ProEmp   pro = new  ProEmp();
			    pro.UpdateProduct(newP);
			  	break;
		case 3 :
				System.out.print("Id of the product that you want to delete :  ");
				id  = reader.nextInt();
				ProEmp   p = new  ProEmp();
			    p.DeleteProduct(id);
				break;
			
		case 4 :
				System.out.print("Give the Categorie id : ");
				id  = reader.nextInt();
				System.out.print("Give the Categorie name : ");
				Nom = reader.next();
			    CategEmp   Catg = new  CategEmp();
			    Catg.AddCategorie(id,Nom);
			    break;
			    
		case 5 :
				System.out.println("Id of the categorie that you want to change :  ");
				id  = reader.nextInt();
				System.out.print("Name  :  ");
				Nom = reader.next();
			    CategEmp   Cat = new  CategEmp();
			    Cat.UpdateCategories(id,Nom);
				break;
				
		case 6 :
				System.out.println("Id of the categorie that you want to delete :  ");
				id  = reader.nextInt();
				CategEmp   C = new  CategEmp();
			    C.DeleteCategories(id);
				break;
				
		case 7 :
				ProEmp   prr = new  ProEmp();
			    prr.listProducts();
				break ;
				
		case 8 :
				CategEmp   Catego = new  CategEmp();
			    Catego.listCategories();
				break ;
				
		case 9 :
				System.out.println("Id of the categorie that you want to read :  ");
				id  = reader.nextInt();
				CategEmp   Catt = new  CategEmp();
			    Catt.ListByCategorie(id);
				break ;
				
		case 0 :
				System.out.println("Exit.");
				break;
			}
		}while(choice!=0);
	reader.close();
	}
}