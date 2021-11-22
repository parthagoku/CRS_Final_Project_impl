package com.lti.serviceimplimentationDAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

import com.lti.bean.Student;
import com.lti.dao.DBManager;
import com.lti.dummydata.Relations;
import com.lti.service.StudentInterface;

public class StudentInterfaceImpl implements StudentInterface {
	
CatalogImpl ci =new CatalogImpl();

	public void changePassword() {
		// TODO Auto-generated method stub

	}

	public void register() {
		Scanner sc1=new Scanner(System.in);
		Scanner sc2=new Scanner(System.in);
		Scanner sc3=new Scanner(System.in);
		Scanner sc4=new Scanner(System.in);
		Scanner sc5=new Scanner(System.in);
		System.out.println("Enter course code to register");
		String courseCode = sc1.nextLine();
		System.out.println("Enter your student Id :");
		int studid = sc2.nextInt();
		System.out.println("Enter Branch :");
		String branch = sc3.nextLine();
		System.out.println("Enter your batch :");
		int batch = sc5.nextInt();
		System.out.println("Ener Course name :");
		String coursename = sc4.nextLine();
		int i=0;
		PreparedStatement ps = null;
		String str = "insert into course_student values (?,?,?,?,?)";
		try
		{
			Connection con= DBManager.getConnection();
			ps = con.prepareStatement(str);
			ps.setString(1,courseCode);
			ps.setInt(2, studid);
			ps.setString(3, branch);
			ps.setInt(4, batch);
			ps.setString(5, coursename);
			
		     i = ps.executeUpdate();
		         
		}
		
		 catch (SQLException e) 
		{
			e.printStackTrace();
		}
		
		if(i==1){
	    	System.out.println("Registered Successfully..");}
	    	else
	    		System.out.println("Some Invalid Parameters Entered.....");;


	}

	
	public void viewGradeCard() {
		
			System.out.println("Enter Student id to view Grade: ");
			Scanner sc=new Scanner(System.in);
			int s_id=sc.nextInt();	
			
			String str = "Select * from stud_grade where student_id='"+s_id+"'";
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
			/*Relations rr=new Relations();
			Set students = rr.stud_set_grade.keySet();
			//Set String=rr.stud_set_grade.v
			Iterator<Student> itr  = students.iterator();
			Set<Integer> student_ids = new HashSet<Integer>();
			while(itr.hasNext()) {
				//System.out.println("hiii....");
				Student stud_temp=itr.next();
				if(stud_temp.getStudentId()==s_id)
				{
					System.out.println(rr.stud_set_grade.get(stud_temp));
				}
				else
				{
					System.out.println("Student doesn't exist in repo....");
				}*/
				//student_ids.add(itr.next().getStudentId());
				
			}
			
			/*for(Map.Entry map : rr.stud_set_grade.entrySet())
			{
				//System.out.println("hiii");
				Student key = (Student)map.getKey();
				String value=(String)map.getValue();
				if(key.getStudentId()==s_id)
				{
					System.out.println("Grade is : "+value+"for the Student: "+key);
				}
				
			}*/
	public void registerHere()
	{
		
		        Random random =new Random();
				Scanner sc2=new Scanner(System.in);
				Scanner sc3=new Scanner(System.in);
				Scanner sc4=new Scanner(System.in);
				System.out.println("Enter branch :");
				String branch = sc2.nextLine();
				System.out.println("Enter batch :");
				int batch = sc3.nextInt();
				System.out.println("Enter password");
				String pass=sc4.nextLine();
				int uid= random.nextInt();
				String status="I";
				String role="student";
				if(uid<0)
				{
					uid=-(uid);
				}
				int i=0;
				PreparedStatement ps = null;
				String str = "insert into student values (?,?,?,?,?,?)";
				try
				{
					Connection con= DBManager.getConnection();
					ps = con.prepareStatement(str);
					ps.setInt(1,uid);
					ps.setString(2, branch);
					ps.setInt(3, batch);
					ps.setString(4, status);
					ps.setString(5, role);
					ps.setString(6, pass);
				    i = ps.executeUpdate();
				}
				
				 catch (SQLException e) 
				{
					e.printStackTrace();
				}
				
				if(i==1){
					System.out.println("========================================");
			    	System.out.println("..........Registered Successfully.......");
			    	System.out.println("========================================");
			    	ci.seeTheStudent();
			    	}
			    	else
			    		System.out.println("Some Invalid Parameters Entered.....");;


				

			}
	}
		

	
	


