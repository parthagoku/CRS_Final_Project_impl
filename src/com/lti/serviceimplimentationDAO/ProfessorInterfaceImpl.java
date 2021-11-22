package com.lti.serviceimplimentationDAO;

import java.util.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.Map;
import java.util.Scanner;


import com.lti.bean.Course;
import com.lti.bean.Student;
import com.lti.dao.DBManager;
import com.lti.dummydata.DummyData;
import com.lti.dummydata.Relations;
import com.lti.exception.EnroleStudentsException;
import com.lti.exception.SetGradeException;
import com.lti.service.ProfessorInterface;
import com.mysql.jdbc.Statement;

public class ProfessorInterfaceImpl implements ProfessorInterface {

	DummyData dd=new DummyData();
	Relations rr=new Relations();
	
	PreparedStatement ps = null;
	public void viewEnrolledStudents() {
		System.out.println("Enter the course id to view the students list : ");
		Scanner sc =new Scanner(System.in);
		String course_id=sc.nextLine();
		String str = "Select * from course_student where course_id='"+course_id+"'";
		
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
	
			   
		/*int counter=0;
		Scanner sc =new Scanner(System.in);
		String course_id=sc.nextLine();
		try{
		for (Map.Entry map1 : rr.stud_course.entrySet()) {
			List<Course> value1 = (List<Course>)map1.getValue();
			for(int i=0;i<value1.size();i++){
			if(value1.get(i).getCourseCode().equals(course_id))
			{
				counter++;
			}
		}}
		if(counter==0)
		{
			throw new EnroleStudentsException("msg");
		}
		}
		catch(EnroleStudentsException e)
		{
			System.out.println(e.getMsg());
			System.exit(0);
		}
		System.out.println("Student Details Are:");
		for (Map.Entry map : rr.stud_course.entrySet()) {
            Student key = (Student)map.getKey();
            
  
            List<Course> value = (List<Course>)map.getValue();
  
           for(int i=0;i<value.size();i++)
           {
        	   
        	   if (course_id.equals(value.get(i).getCourseCode()))
        	   {
        		   System.out.println(key);
        	   }
           }
        }*/
		
	}

	Statement st=null;
	public void addGrade() {
		System.out.println("Enter the student id to set the grade: ");
//		int counter1=0;
		Scanner sc =new Scanner(System.in);
		int stud_id=sc.nextInt();
		System.out.println("Enter the grade: ");
		Scanner sc1 =new Scanner(System.in);
		String grade=sc1.nextLine();
		String str = "Update stud_grade set grade='"+grade+"'where student_id='"+stud_id+"'";
		try
		{
			Connection con= DBManager.getConnection();
		   st= (Statement) con.createStatement();
		    st.executeUpdate(str);
		  
			   System.out.println("Grade : "+grade+" : set for student : "+stud_id+" :");
			   String str1 = "Select * from stud_grade";
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
			    System.out.println("");
			}
			   
		} 
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		/*try{
			for (Map.Entry map2 : rr.stud_course.entrySet()) {
				Student key1 = (Student)map2.getKey();
				//for(int i=0;i<key.size();i++){
				if(key1.getStudentId()==stud_id)
				{
					counter1++;
				}
			}
			if(counter1==0)
			{
				throw new SetGradeException("msg");
			}
			}
			catch(SetGradeException e)
			{
				System.out.println(e.getMsg());
				System.exit(0);
			}*/
		/*System.out.println("Enter the grade: ");
		Scanner sc1 =new Scanner(System.in);
		String grade=sc1.nextLine();
		for(Map.Entry map : rr.stud_set_grade.entrySet())
		{
			Student key = (Student)map.getKey();
			String value=(String)map.getValue();
			if(key.getStudentId()==stud_id)
			{
				rr.stud_set_grade.put(key,grade );
			}
			
		}

		for(Map.Entry map : rr.stud_set_grade.entrySet())
		{
			Student key = (Student)map.getKey();
			String value=(String)map.getValue();
			System.out.println(key+"  "+"Grade :"+value);
		}*/
		
	}

}
