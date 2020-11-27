package rest;

import java.sql.Connection;
import java.sql.DriverManager;

public class Database {
	
	public Connection getConnection() throws Exception
	{
	try
	{
		 String url = "jdbc:mysql://localhost:3306/shop";
		 Connection con = null;
		 Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
		 con = DriverManager.getConnection(url, "root", "storm");
		 return con;
	}
	catch (Exception e)
	{
	throw e;
	}
	}

}
