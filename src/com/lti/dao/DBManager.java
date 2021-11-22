package com.lti.dao;
import java.sql.*;

import com.lti.utils.DBUtils;
public class DBManager {
  
	private static Connection con;
	public static Connection getConnection() throws SQLException
	{
		
	try {
		Class.forName("com.mysql.jdbc.Driver");
		con = DBUtils.getConnection();//DriverManager.getConnection("jdbc:mysql://localhost:3306/","root","root");//DBUtils.getConnection();
	} catch (ClassNotFoundException e) {
		
		e.printStackTrace();
	} 
		
	return con;
}
}
