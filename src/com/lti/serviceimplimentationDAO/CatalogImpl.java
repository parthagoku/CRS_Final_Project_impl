/**
 * 
 */
package com.lti.serviceimplimentationDAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.lti.application.StudentApp;
import com.lti.bean.Course;
import com.lti.dao.DBManager;
import com.lti.dummydata.DummyData;
import com.lti.service.CatalogInterface;
import com.mysql.jdbc.Statement;

/**
 * @author user254
 *
 */
public class CatalogImpl implements CatalogInterface {

	/* (non-Javadoc)
	 * @see com.lti.service.Catalog#addCourse()
	 * 
	 * 
	 */
	
	SemesterRegistrationImpl sri=new SemesterRegistrationImpl();
	public void addCourse()
	{
		Scanner sc1=new Scanner(System.in);
		Scanner sc2=new Scanner(System.in);
		Scanner sc3=new Scanner(System.in);
		Scanner sc4=new Scanner(System.in);
		System.out.println("Enter course code");
		String courseCode = sc1.nextLine();
		System.out.println("Enter course name");
		String courseName = sc2.nextLine();
		System.out.println("Course Offered");
		String isOffered = sc3.nextLine();
		System.out.println("Ener instructor");
		String instructor = sc4.nextLine();
		int i=0;
		PreparedStatement ps = null;
		String str = "insert into course values (?,?,?,?)";
		try
		{
			Connection con= DBManager.getConnection();
			ps = con.prepareStatement(str);
			ps.setString(1,courseCode);
			ps.setString(2, courseName);
			ps.setString(3, isOffered);
			ps.setString(4, instructor);
			
		     i = ps.executeUpdate();
		         
		}
		
		 catch (SQLException e) 
		{
			e.printStackTrace();
		}
		
		if(i==1)
	    	System.out.println("Course Added Successfully..");
	    	else
	    		System.out.println("Some Invalid Parameters Entered.....");;

	}

	/* (non-Javadoc)
	 * @see com.lti.service.Catalog#deleteCourse()
	 */
	public void deleteCourse() {
		PreparedStatement ps1 = null;
		//Statement stmt=null;
		System.out.println("Enter your student id : ");
		Scanner sc =new Scanner(System.in);
		int stud_id=sc.nextInt();
		sri.viewRegisteredCourses(stud_id);
		System.out.println("Enter course id to remove : ");
		Scanner sc1=new Scanner(System.in);
		String course_id=sc1.nextLine();
		String str="delete from course_student where course_id='"+course_id+"' and student_id='"+stud_id+"'";
		try {
			Connection conn = DBManager.getConnection();
			ps1 = conn.prepareStatement(str);
		      ps1.executeUpdate(str);
		      System.out.println("Record deleted successfully");
		    } catch (SQLException e) {
		      e.printStackTrace();
		    }
	}

	/* (non-Javadoc)
	 * @see com.lti.service.Catalog#viewCourseDetails()
	 */
	PreparedStatement ps=null;
	public void viewCourseDetails() {
		System.out.println("Course List Details:");
String str = "Select * from course";
		
		try
		{
			Connection con= DBManager.getConnection();
		   ps= con.prepareStatement(str);
		   ResultSet rs = ps.executeQuery(str);
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
	
		/*DummyData dd=new DummyData();
		
		List<Course> list=new ArrayList<Course>();
		list=dd.courses;
		for(int i=0;i<list.size();i++)
		{
			System.out.println(list.get(i));
		}*/
		
		
	}
	
	public void seeTheStudent()
	{StudentApp sa=new StudentApp();
		int columnValue=0;
		//System.out.println(columnValue);
		String s="I";
		String str = "Select id from student where status='"+s+"'";
		PreparedStatement ps = null;
		try
		{
		 Connection con= DBManager.getConnection();
		   ps= con.prepareStatement(str);
		   ResultSet rs = ps.executeQuery(str);
		   if (rs.next())
		   {
			    columnValue = rs.getInt(1);
			    if(columnValue==0)
			    {
			    	sa.studentOpp();
			    }
			    else{
			    System.out.println("user ID is : "+columnValue);}
			    
		   }
		   else
		   {   System.out.println("+++++++++++++++++++++++++++++++++");
			   System.out.println("No Students avialabe to approve..");
			   System.out.println("+++++++++++++++++++++++++++++++++");
			   sa.studentOpp();
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
public void approveStudentRegistration(){
	Statement st=null;
	System.out.println("Bellow Student registration needs to be approved.");
	seeTheStudent();
	System.out.println("Enter the student id to approve");
//	int counter1=0;
	Scanner sc =new Scanner(System.in);
	int stud_id=sc.nextInt();
	System.out.println("Enter A to approve.");
	Scanner sc1 =new Scanner(System.in);
	String status=sc1.nextLine();
	String str = "Update student set status='"+status+"'where id='"+stud_id+"'";
	try
	{
		Connection con= DBManager.getConnection();
	   st= (Statement) con.createStatement();
	    st.executeUpdate(str);
	  
		   System.out.println("Approved Student Registration");
		   /*String str1 = "Select * from stud_grade";
		   ps= con.prepareStatement(str);
		   ResultSet rs = ps.executeQuery(str1);
	   ResultSetMetaData rsmd = rs.getMetaData();
	   int columnsNumber = rsmd.getColumnCount();
	   while (rs.next()) {
		    for (int i = 1; i <= columnsNumber; i++) {
		        if (i > 1) 
		        	System.out.print(",  ");
		        String columnValue = rs.getString(i);
		        System.out.print(rsmd.getColumnName(i) + ": " +columnValue );
		    }
		    System.out.println("");*/
		//}
		   
	} 
	catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}
}
