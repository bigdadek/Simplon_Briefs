package Connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectUser {

	private static ConnectUser instance;
    private static Connection conn = null;
    
	private static String dbURL = "jdbc:postgresql://localhost:4658/user";
	private static String username = "postgres";
	private static String password = "khadija2002bb";
	 
	public static Connection getUserConnection() {
        try {
            conn = DriverManager.getConnection(dbURL, username, password);
            System.out.println("Connected successfully.");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return conn;
    }
	
	 public static ConnectUser getInstance()  {
	        if (instance == null) {
	            instance = new ConnectUser();
	        }
	        
	        else{
				try {
					if (instance.getUserConnection().isClosed()) {
					    instance = new ConnectUser();
					}
				} catch (SQLException e) {
					e.printStackTrace();
				}
	        }
	        return instance;
	    }
}
