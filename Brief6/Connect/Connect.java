package Connect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Connect {

	
		private static String dbURL = "jdbc:postgresql://localhost:4658/brief6";
		private static String username = "postgres";
		private static String password = "khadija2002bb";
		 
		public static Connection getConnect() {
	        Connection conn = null;
	        try {
	            conn = DriverManager.getConnection(dbURL, username, password);
	            System.out.println("Connected successfully.");
	        } catch (SQLException e) {
	            System.out.println(e.getMessage());
	        }

	        return conn;
	    }
		
}
