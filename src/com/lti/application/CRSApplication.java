package com.lti.application;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.Iterator;
import java.util.Scanner;




import com.lti.bean.Course;
import com.lti.dao.DBManager;
import com.lti.dummydata.DummyData;
import com.lti.serviceimplimentationDAO.StudentInterfaceImpl;

public class CRSApplication {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("======================================================================");
		System.out.println("===================[ CRS Application Portal ]=========================");
		System.out.println("======================================================================");
		System.out.println("=================[ 1 - Enter Professor Portal ]=======================");
		System.out.println("=================[ 2 - Enter Student Portal   ]=======================");
		System.out.println("=================[ 3 - Enter Admin Portal     ]=======================");
		System.out.println("======================================================================");
		Scanner user_choice=new Scanner(System.in);
		int user_selection=user_choice.nextInt();
		StudentInterfaceImpl sii=new StudentInterfaceImpl();
		String columnValue=null;
		/*String columnValue1=null;*/
		if(user_selection==1 |  user_selection==3 )
		{
		System.out.println("Enter user ID :");
		Scanner sc=new Scanner(System.in);
		int user_id=sc.nextInt();
		System.out.println("Enter password :");
		Scanner sc1=new Scanner(System.in);
		String password=sc1.nextLine();
		
		String str = "Select user_role from user  where user_id='"+user_id+"' and user_password='"+password+"'";
		PreparedStatement ps = null;
		try
		{
		 Connection con= DBManager.getConnection();
		   ps= con.prepareStatement(str);
		   ResultSet rs = ps.executeQuery(str);
		   if (rs.next())
		   {
			   System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
			   System.out.println("+..............................Login Successful........................+");
			    columnValue = rs.getString(1);
		   }
		   else
		   {
			   System.out.println("Invalid user Id and Password. Try Again...");
			   main(null);
		   }
		} 
		catch (SQLException e) {
			
			e.printStackTrace();
		}
		catch(NullPointerException ex)
		{
			ex.printStackTrace();
		}
		}
		else if(user_selection==2)
		{
			System.out.println(" 1- Register Here...");
			System.out.println(" 2- Login Here......");
			Scanner sc9=new Scanner(System.in);
			int ch=sc9.nextInt();
			if(ch==1)
			{
				sii.registerHere();
				System.out.println("Contact your Admin to approve your registration.");
				main(null);
			}
			else if (ch==2){
			System.out.println("Enter user ID :");
			Scanner sc=new Scanner(System.in);
			int user_id=sc.nextInt();
			System.out.println("Enter password :");
			Scanner sc1=new Scanner(System.in);
			String password=sc1.nextLine();
			
			String str = "Select role from student  where id='"+user_id+"' and password='"+password+"'";
			PreparedStatement ps = null;
			try
			{
			 Connection con= DBManager.getConnection();
			   ps= con.prepareStatement(str);
			   ResultSet rs = ps.executeQuery(str);
			   if (rs.next())
			   {
				   System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
				   System.out.println("+..............................Login Successful........................+");
				    columnValue = rs.getString(1);
			   }
			   else
			   {
				   System.out.println("Invalid user Id and Password. Try Again...");
				   main(null);
			   }
			} 
			catch (SQLException e) {
				
				e.printStackTrace();
			}
			catch(NullPointerException ex)
			{
				ex.printStackTrace();
			}
			}
			else
			{
				System.out.println("Enter valid choice....");
				main(null);
			}
		}
		
		ProfApp pf=new ProfApp();
		StudentApp sa=new StudentApp();
		AdminApp aa=new AdminApp();
		if(columnValue.equals("professor"))
		{
			System.out.println("+............................Logged In as a Professor..................+");
			System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
			pf.profOpp();
		}
			
			else if(columnValue.equals("student"))
			{
				System.out.println("+............................Logged In as a Student....................+");
				System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
				sa.studentOpp();
			}
			if(columnValue.equals("admin"))
			{
				System.out.println("+............................Logged In as an Admin.....................+");
				System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
				aa.adminOpp();
			}
			
		}
		
		
		

		}

	
	


