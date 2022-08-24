package pack.Connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connect {
	
	private static final String DB_DRIVER="org.postgresql.Driver";
	private static String dbURL = "jdbc:postgresql://localhost:4658/kb9";
	private static String username = "postgres";
	private static String password = "khadija2002bb";
	 
	public static Connection getConnection() {
		Connection conn =null;
	    try {
	        if (conn == null) {
	            Class.forName(DB_DRIVER);
	            conn = DriverManager.getConnection(dbURL, username, password);
	        }
	    }catch (SQLException | ClassNotFoundException e){
	        System.out.println(e);
	    }
	    return conn;
    }

	
	
}
