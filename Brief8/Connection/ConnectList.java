package Connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectList {
	
	private static ConnectList instance;
    private static Connection conn = null;
    
	private static String dbURL = "jdbc:postgresql://localhost:4658/list";
	private static String username = "postgres";
	private static String password = "khadija2002bb";
	 
	public static Connection getListConnection() {
        try {
        	conn = DriverManager.getConnection(dbURL, username, password);
            System.out.println("Connected successfully.");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return conn;
    }

	    public static ConnectList getInstance()  {
	        if (instance == null) {
	            instance = new ConnectList();
	        }
	        
	        else{
				try {
					if (instance.getListConnection().isClosed()) {
					    instance = new ConnectList();
					}
				} catch (SQLException e) {
					e.printStackTrace();
				}
	        }
	        return instance;
	    }
	
}
