package Day21_CRUD_User;

import java.sql.*;
import javax.sql.*;

public class DatabaseConnection1 {
	private static final String DB_USERNAME = "root";
	private static final String DB_PASSWORD = "Sakshi@433";
	private static final String DB_URL = "jdbc:mysql://localhost:3306/tns";
	static Connection cn;
	
	public static Connection getConnection(){
		try{
			Class.forName("com.mysql.cj.jdbc.Driver");
			cn = DriverManager.getConnection(DB_URL,DB_USERNAME,DB_PASSWORD);
			System.out.println(cn);
		}
		catch(ClassNotFoundException e)   {
			   // TODO Auto-generated catch block  
			e.printStackTrace();
		  } catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();	
		}
		return cn;
	}
}
