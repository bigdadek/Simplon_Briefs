package Implementation;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


import Connection.ConnectUser;
import Deo.DeoUser;
import User.User;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class UserImp implements DeoUser {
	
	Connection conn = ConnectUser.getUserConnection();
	Statement st;
	public static int Uid = 0;
	// if the user exists his gonna return his id, but if he does not it will return 0
	public int userExist(String Uname , String passwd) 
	{
		String query = "SELECT * FROM users";
        ResultSet rs;
        try {
	        st = conn.createStatement();
	        rs = st.executeQuery(query);
	        User U;
	        while(rs.next()){
	            U = new User(rs.getInt("userId"),rs.getString("firstName"),rs.getString("lastName"),rs.getString("userName"),rs.getString("password"));
	            if (Uname == U.getUserName())
	            {
	            	if(passwd == U.getPassword())
	            	{
	            		Uid = U.getUserId();
	            		return Uid;
	            	}
	            }
	        }
        }
        catch (SQLException e) {
	         System.out.println(e.getMessage());
        }        
	     return 0;  
	}
	
	
	@Override
	public void CreateUser(String firstName, String lastName, String userName, String password) {
		String query = "INSERT INTO users VALUES ('" + firstName + "','" + lastName  + "','" + userName + "','" + password + "')";
	       
		try{
			st = conn.createStatement();
			st.executeUpdate(query);
			System.out.println("Creating is Done.");
		}catch(Exception ex){
            ex.printStackTrace();
			System.out.println("Creating Did not go will.");
        }
	}
		
}
