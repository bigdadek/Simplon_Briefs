package Product;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import Connect.Connect; 

public class ProEmp  implements DaoProduct {
	
	Connection conn =Connect.getConnect(); 
	
	@Override
	public void listProducts() {
		try {
			Statement stm = conn.createStatement();
			String sql = "select * from products";
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
			System.out.println(e);
		}
	}

	public void AddProduct(Product P) {
		try {

			String sql ="INSERT into products (prodId,prodName,prodPrice,prodDate,CategId) values (?,?,?,?,?)";
			PreparedStatement stm = conn.prepareStatement(sql);
			conn.setAutoCommit(false);
			stm.setInt(1, P.getProdId());
			stm.setString(2, P.getProdName());
			stm.setDouble(3, P.getProdPrice());
			stm.setString(4, P.getProdDate());
			stm.setInt(5,P.getCategId());
			stm.execute();
			conn.commit();
			System.out.println("THE INSERT IS DONE .");
			}
			catch (Exception e)
			{
				System.out.println(e.getMessage());
				System.out.println("THE INSERT DID'T GO WILL .!!!\"!");
			}
	}

	@Override
	public void UpdateProduct(Product P) {
		try {
			
			String sql ="UPDATE products SET prodId=? ,prodName=? ,prodPrice=? ,prodDate=? ,CategId=? WHERE prodId ="+P.getProdId();
			PreparedStatement s = conn.prepareStatement(sql);
			conn.setAutoCommit(false);
			s.setInt(1, P.getProdId());
			s.setString(2, P.getProdName());
			s.setFloat(3, P.getProdPrice());
			s.setString(4, P.getProdDate());
			s.setInt(5,P.getCategId());
			s.execute();
			conn.commit();
			
			System.out.println("THE UPDATE IS DONE .");	
			}
			catch (Exception e)
			{
				System.out.println(e.getMessage());
				System.out.println("THE UPDATE DID'T GO WILL .!!!");
			}
		}

	@Override
	public void DeleteProduct(int id) {
		try {
			String sql ="DELETE FROM products WHERE prodId=" + id;
			PreparedStatement stm = conn.prepareStatement(sql);
			stm.execute();
			System.out.println("THE DELETE IS DONE . ");
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println("THE DELETE DID'T GO WILL !!");
		}
		
	}


}
