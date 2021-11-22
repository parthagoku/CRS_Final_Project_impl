package com.lti.serviceimplimentationDAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

import com.lti.bean.Course;
import com.lti.bean.Student;
import com.lti.dao.DBManager;
import com.lti.dummydata.DummyData;
import com.lti.dummydata.Relations;
import com.lti.service.SemesterRegistrationInterface;

public class SemesterRegistrationImpl implements SemesterRegistrationInterface {

DummyData dd = new DummyData();
	
	Relations rr = new Relations();
	
	PaymentNotificationInterfaceImpl pnii=new PaymentNotificationInterfaceImpl();

	public void dropCourse() {
		PreparedStatement ps1 = null;
		System.out.println("Enter course code to delete the course : ");
		Scanner sc =new Scanner(System.in);
		String course_id=sc.nextLine();
		String str="delete from course where course_id='"+course_id+"'";
		try {
			Connection conn = DBManager.getConnection();
			ps1 = conn.prepareStatement(str);
		      ps1.executeUpdate(str);
		      System.out.println("Record deleted successfully");
		    } catch (SQLException e) {
		      e.printStackTrace();
		    }

	}

	public void payfees() {
		

		Random random =new Random();
		Scanner sc1=new Scanner(System.in);
		Scanner sc2=new Scanner(System.in);
		Scanner sc3=new Scanner(System.in);
		Scanner sc4=new Scanner(System.in);
		System.out.println("Enter your ID :");
		int sid = sc1.nextInt();
		System.out.println("Enter reference Id :");
		String rid = sc2.nextLine();
		System.out.println("Enter Amount to pay :");
		float amt = sc3.nextFloat();
		System.out.println("Enter status :");
		String status = sc4.nextLine();
		int i=0;
		PreparedStatement ps = null;
		PreparedStatement ps1=null;
		String str = "insert into payment values (?,?,?,?)";
		String str2="insert into payment_notification values (?,?,?,?)";
		try
		{
			Connection con= DBManager.getConnection();
			ps = con.prepareStatement(str);
			ps1=con.prepareStatement(str2);
			ps.setInt(1,sid);
			ps.setString(2, rid);
			ps.setFloat(3, amt);
			ps.setString(4, status);
			
			ps1.setInt(1, sid);
			ps1.setInt(2, Integer.parseInt(rid));
			ps1.setInt(3, random.nextInt());
			ps1.setString(4, "You have successfully made your payment");
			
		     i = ps.executeUpdate();
		     ps1.executeUpdate();
		         
		}
		
		 catch (SQLException e) 
		{
			e.printStackTrace();
		}
		
		if(i==1){
	    	System.out.println("Paid Successfully..");
	    	pnii.sendNotification(sid);}
	    	else
	    		System.out.println("Some Invalid Parameters Entered.....");;


	}

	PreparedStatement ps1=null;
	public void viewRegisteredCourses(int stud_id) {
		System.out.println("You are tagged to bellow courses :");
		String str = "Select * from course_student where student_id='"+stud_id+"'";
		
		try
		{
			Connection con= DBManager.getConnection();
		   ps1= con.prepareStatement(str);
		   ResultSet rs = ps1.executeQuery(str);
		  // System.out.println(rs);
		   ResultSetMetaData rsmd = rs.getMetaData();
		   int columnsNumber = rsmd.getColumnCount();
		   while (rs.next()) {
			    for (int i = 1; i <= columnsNumber; i++) {
			        if (i > 1) 
			        	System.out.print(",  ");
			        String columnValue = rs.getString(i);
			        System.out.print(rsmd.getColumnName(i) + ": " +columnValue );
			    }
			    System.out.println("");
			}
		   
		} 
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


	}

	
	public void registerCourses(Student s, Course c) {
		addCourse(s, c);
		
	}

      public void addCourse(Student s , Course c) {
		int id = s.getStudentId();
		Set students = rr.stud_course.keySet();
		Iterator<Student> itr  = students.iterator();
		Set<Integer> student_ids = new HashSet<Integer>();
		while(itr.hasNext()) {
			student_ids.add(itr.next().getStudentId());
			
		}
		
		if(student_ids.contains(s.getStudentId())) { 
			LinkedList<Course> cl = rr.stud_course.get(s);
			cl.add(c);
			System.out.println("updated map");
			rr.stud_course.put(s, cl); // updated again ( may be not necessary ) 
			
		}
		else {
			LinkedList<Course> cl = new LinkedList<Course>();
			cl.add(c);
			rr.stud_course.put(s , cl);
			
		}
		
		//rr.stud_course.put(s, )
		
	}

	public void viewRegisteredCourses() {
		// TODO Auto-generated method stub
		
	}

}
