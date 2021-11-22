package com.lti.serviceimplimentationDAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.Random;
import java.util.Scanner;

import com.lti.dao.DBManager;
import com.lti.service.AdminInterface;

public class AdminInterfaceImpl implements AdminInterface {
	Random random=new Random();

	public void addProfessor() {
		
		//Scanner sc1=new Scanner(System.in);
		Scanner sc2=new Scanner(System.in);
		Scanner sc3=new Scanner(System.in);
		/*System.out.println("Enter user ID :");
		int uid = sc1.nextInt();*/
		System.out.println("Enter password :");
		String pass = sc2.nextLine();
		System.out.println("Enter role :");
		String role = sc3.nextLine();
		int uid= random.nextInt();
		if(uid<0)
		{
			uid=-(uid);
		}
		int i=0;
		PreparedStatement ps = null;
		String str = "insert into user values (?,?,?)";
		try
		{
			Connection con= DBManager.getConnection();
			ps = con.prepareStatement(str);
			ps.setInt(1,uid);
			ps.setString(2, pass);
			ps.setString(3, role);
		    i = ps.executeUpdate();
		}
		
		 catch (SQLException e) 
		{
			e.printStackTrace();
		}
		
		if(i==1){
			System.out.println("========================================");
	    	System.out.println("..........User Added Successfully.......");
	    	System.out.println("========================================");
	    	}
	    	else
	    		System.out.println("Some Invalid Parameters Entered.....");


		

	}

	public void assignCourse() {
		// TODO Auto-generated method stub

	}

	public void approveStudent() {
		// TODO Auto-generated method stub

	}
	public void deleteAdmin(){
		PreparedStatement ps1 = null;
		System.out.println("Enter User ID to Remove the User : ");
		Scanner sc =new Scanner(System.in);
		int uid=sc.nextInt();
		String str="delete from user where user_id='"+uid+"'";
		try {
			Connection conn = DBManager.getConnection();
			ps1 = conn.prepareStatement(str);
		      ps1.executeUpdate(str);
		      System.out.println("User removed successfully");
		    } catch (SQLException e) {
		      e.printStackTrace();
		    }
	}

	public void viewAdmins()
	{
		String str = "Select * from user";
		PreparedStatement ps=null;
		try
		{
			Connection con= DBManager.getConnection();
		   ps= con.prepareStatement(str);
		   ResultSet rs = ps.executeQuery(str);
		  // System.out.println(rs);
		   ResultSetMetaData rsmd = rs.getMetaData();
		   int columnsNumber = rsmd.getColumnCount();
		   System.out.println("===============================================================");
		   while (rs.next()) {
			    for (int i = 1; i <= columnsNumber; i++) {
			        if (i > 1) 
			        	System.out.print(",  ");
			        String columnValue = rs.getString(i);
			        System.out.print(rsmd.getColumnName(i) + ": " +columnValue );
			    }
			    System.out.println("");
			}
		   System.out.println("===============================================================");
		   
		} 
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
