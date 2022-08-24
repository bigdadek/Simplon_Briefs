package KB5;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class CondidatEmp implements DeoCondidat {

	Connection conn = Connect.getconnect();
	
	
	@Override
	public void Create(Condidat C) {
		try {
			String sql = "insert into condidat(id,firstName,lastName,email,adress,country,city) values (?,?,?,?,?,?,?)";
			PreparedStatement s = conn.prepareStatement(sql);

			conn.setAutoCommit(false);

			s.setInt(1, C.getId());
			s.setString(2, C.getFirstName());
			s.setString(3, C.getLastName());
			s.setString(4, C.getEmail());
			s.setString(5, C.getAdress());
			s.setString(6, C.getCountry());
			s.setString(7, C.getCity());
			s.execute();
			conn.commit();
			s.close();
			//conn.close();
			System.out.println("Creating is Done.");
		} catch (Exception e) {
			System.err.println(e);
			System.out.println("Creating Did not go will.");
		}
		
	}
	@Override
	public void Read() {
		try {
			
			Statement st= conn.createStatement();
			String sql = "select * from condidat";
			ResultSet result= st.executeQuery(sql);

			while (result.next()) {
				System.out.print(result.getInt("id") + "\t");
				System.out.print(result.getString("firstName") + "\t");
				System.out.print(result.getString("lastName") + "\t");
				System.out.print(result.getString("email") + "\t");
				System.out.print(result.getString("adress") + "\t");
				System.out.print(result.getString("country") + "\t");
				System.out.print(result.getString("city") + "\t");

				System.out.println("");
				
			}

		} catch (Exception e) {
			System.err.println(e);
			System.out.println("Reading Did not go will.");
		}

		
	}
	@Override
	public void Update(int id, String F, String L) {
		
		try {
			
			String sql = "update condidat set firstName='" + F + "' , lastName='" + L + "' where id=" + id ;
			Statement st= conn.createStatement();
			st.executeUpdate(sql);
			System.out.println("Updating is Done.");
		} catch (SQLException e) {
			System.err.println(e);
			System.out.println("Updating Did not go will.");
		}
	}
	@Override
	public void Delete(int id) {
		try { 
			Statement st= conn.createStatement();
			  String sql = "delete from condidat where id=" + id ;
			  st.executeUpdate(sql);
			  System.out.println("Deleting is Done.");
			  
			  } catch (Exception e) {
				  System.err.println(e);
				  System.out.println("Deleting Did not go will.");
			}
		
	}

	

}
