package com.lti.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;




public class ProfessorDAO {

	/**
	 * @param args
	 */
	public boolean addCourseStudent(){
		
	int i=0;
	PreparedStatement ps = null;
	String str = "insert into course_student values (?,?,?,?,?)";
	try
	{
		System.out.println("hii");
		Connection con= DBManager.getConnection();
		ps = con.prepareStatement(str);
		String course_id="course2";
		   int id=627;
	      String branch="branch2";
	      int batch=202;
	      String name="name1";
	      
	      ps.setString(1, course_id);  
	      ps.setInt(2, id);
	      ps.setString(3, branch);
	      ps.setInt(4, batch);
	      ps.setString(5,name);
	      ps.executeUpdate();
	     i = ps.executeUpdate();
	    
	}
	
	 catch (SQLException e) 
	{
		e.printStackTrace();
	}
	
	if(i==1)
    	return true;
    	else
    		return false;


}}
