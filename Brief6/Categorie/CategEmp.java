package Categorie;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import Connect.Connect;

public class CategEmp implements DaoCategorie {

	Connection conn = Connect.getConnect(); 
	
	@Override
	public void listCategories() {
		try {

			Statement stm = conn.createStatement();
			String sql = "select * from categories";
			ResultSet result = stm.executeQuery(sql);
			 
			while (result.next()) {
				System.out.print(result.getString("categId") + "\t");
				System.out.print(result.getString("categName") + "\t");
				System.out.println("");
			}

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	@Override
	public void AddCategorie(int idC,String CatgN) {
	try {
			String sql ="INSERT INTO categories (categId,categName) values ("+idC+", '"+CatgN+"')";
			PreparedStatement stm = conn.prepareStatement(sql);
			stm.execute();
			System.out.println("THE INSERT IS DONE .");
			}
			catch (Exception e)
			{
				System.out.println(e.getMessage());
				System.out.println("THE INSERT DID'T GO WILL .!!!");
			}
	}

	
	

	public void UpdateCategories(int idC,String CatgN) {
		try {
			String sql ="UPDATE categories SET categName='"+CatgN+"'  WHERE categId ="+idC;

			Statement st= conn.createStatement();
			st.executeUpdate(sql);
		System.out.println("THE UPDATE IS DONE .");	
		}
		catch (Exception e)
		{
			System.out.println(e.getMessage());
			System.out.println("THE UPDATE DID'T GO WILL .!!!");
		}
		
	}

	@Override
	public void DeleteCategories(int idC) {
		try {
			String sql ="DELETE FROM categories WHERE categId=" + idC;
			PreparedStatement stm = conn.prepareStatement(sql);
			
			stm.execute();
			System.out.println("THE DELETE IS DONE . ");
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println("THE DELETE DID'T GO WILL !!");
		}
		
		
	}

	public void ListByCategorie(int idC) {
		try {

			Statement stm = conn.createStatement();
			String sql =  "select * from categories  join products on  products.categId = categories.categId  WHERE categories.categId =" + idC;         
			ResultSet result = stm.executeQuery(sql);
			while (result.next()) {
				System.out.print(result.getString("prodId") + "\t");
				System.out.print(result.getString("prodName") + "\t");
				System.out.print(result.getString("prodPrice") + "\t");
				System.out.print(result.getString("prodDate") + "\t");
				System.out.print(result.getFloat("CategId") + "\t");
				System.out.println("");
			}

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
	}
	
	

	
}
