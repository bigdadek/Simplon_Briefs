package pack.ImplimentationDAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import pack.Connection.Connect;
import pack.DAO.DaoCategorie;
import pack.Models.Categorie;

public class CategorieImp implements DaoCategorie {
	Connection conn = Connect.getConnection();
    Statement st;
    
    int UID = UserImp.Uid;
    public static int LID;
    
    @Override
	public ArrayList<Categorie> ReadCategorie() {
    	
    	ArrayList<Categorie> Cat =  new ArrayList<Categorie>();
        String query = "SELECT * FROM categories";
        ResultSet rs;
        
        try{
        	PreparedStatement st = conn.prepareStatement(query);
            rs = st.executeQuery();
            Categorie C;
            while(rs.next()){
                C = new Categorie(rs.getInt("cId"),rs.getString("cName"));
                Cat.add(C);
            }
                
        }catch(Exception ex){
            ex.printStackTrace();
        }
        return Cat;
	}

    public ArrayList<String> ReadNomCategorie() {
    	
    	ArrayList<String> Cat =  new ArrayList<String>();
        String query = "SELECT cName FROM categories";
        ResultSet rs;
        
        try{
        	PreparedStatement st = conn.prepareStatement(query);
            rs = st.executeQuery();
            while(rs.next()){
                Cat.add(rs.getString("cName"));
            }
                
        }catch(Exception ex){
            ex.printStackTrace();
        }
        return Cat;
	}
	@Override
	public void CreateCategorie(int cId, String cName) {
		String query = "INSERT INTO categories VALUES (" + cName + "')";  
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
	public void UpdateCategorie(int cId, String cName) {
		String query = "UPDATE  categories SET title  = '" + cName + "' WHERE cId = "+ cId ;
        
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
	public void DeleteCategorie(int cId) {
		String query = "DELETE FROM categories WHERE cId =" + cId ;
		try{
			st = conn.createStatement();
			st.executeUpdate(query);
			  System.out.println("Deleting is Done.");
		}catch(Exception ex){
            ex.printStackTrace();
        }
		
	}


}
