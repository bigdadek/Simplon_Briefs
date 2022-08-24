package Condidat;

import java.net.URL;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ResourceBundle;

import Connect.Connect;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class CondidatEmp implements DeoCondidat  {


	Connection conn = Connect.getconnect();
    Statement st;
	
	@Override
	public ObservableList<Condidat> CondidatsList() {
		 ObservableList<Condidat> CList = FXCollections.observableArrayList();
	        String query = "SELECT * FROM condidats";
	        ResultSet rs;
	        
	        try{
	            st = conn.createStatement();
	            rs = st.executeQuery(query);
	            Condidat C;
	            while(rs.next()){
	                C = new Condidat(rs.getInt("id"),rs.getString("firstName"),rs.getString("lastName"),rs.getString("email"),rs.getString("adress"),rs.getString("city"),rs.getString("country"));
	                CList.add(C);
	            }
	                
	        }catch(Exception ex){
	            ex.printStackTrace();
	        }
	        return CList;
	}

	@Override
	public void Create(String id, String name, String lastName , String email , String adress , String city,String country) {
		String query = "INSERT INTO condidats VALUES (" +id+ ",'" + name + "','" + lastName  + "','" + email + "','" + adress + "','" + city + "','" + country + "')";
	       
		try{
			st = conn.createStatement();
			st.executeUpdate(query);
			System.out.println("Creating is Done.");
		}catch(Exception ex){
            ex.printStackTrace();
			System.out.println("Creating Did not go will.");
        }
		
		
	}

	@Override
	public void Update(String id, String name, String lastName , String email , String adress , String city,String country) {
		
		  String query = "UPDATE  condidats SET firstName  = '" + name + "', lastName = '" + lastName + "', email = '" + email + "', adress = '" + adress + "' , city = '" + city + "' , country = '" + country + "' WHERE id =  '"+ id +"'";
	        
			try{
				st = conn.createStatement();
				st.executeUpdate(query);
				System.out.println("Updating is Done.");
			}catch(Exception ex){
	            ex.printStackTrace();
				System.out.println("Updating Did not go will.");
	        }
		
	}

	@Override
	public void Delete(String id) {
		String query = "DELETE FROM Condidats WHERE id =" + id ;
        
		try{
			st = conn.createStatement();
			st.executeUpdate(query);
			  System.out.println("Deleting is Done.");
		}catch(Exception ex){
            ex.printStackTrace();
        }
		
	}

}
