package utility;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBUtility {
	private static final String url="jdbc:mysql://localhost:3306/jpa8081";
    private static final String username="root";
    private static final String password="Atharv@04";
    
	private static DBUtility instance;

	private DBUtility() {

	}
	
	public static DBUtility getInstance() {
		if(instance==null)
			instance=new DBUtility();
		
		return instance;
	}
	
	public Connection getDBConnection() {
		Connection con=null;
		try{
		Class.forName("com.mysql.cj.jdbc.Driver");
		
	    con=DriverManager.getConnection(url,username,password);
		}catch(Exception e) {
			System.err.print("DBUtily "+e);
		}
		
	return con;
	}
}