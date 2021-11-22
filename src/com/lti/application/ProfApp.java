/**
 * 
 */
package com.lti.application;

import java.util.Scanner;

import com.lti.dao.ProfessorDAO;
import com.lti.dummydata.DummyData;
import com.lti.dummydata.Relations;
import com.lti.serviceimplimentationDAO.CatalogImpl;
import com.lti.serviceimplimentationDAO.ProfessorInterfaceImpl;

/**
 * @author user254
 *
 */
public class ProfApp {

	/**
	 * @param args
	 */
	public void profOpp(){
		// TODO Auto-generated method stub
		Relations rr=new Relations();
		DummyData dd=new DummyData();
		CatalogImpl ci=new CatalogImpl();
		ProfessorDAO pdo=new ProfessorDAO();
		dd.initializeDummy();
		rr.initialise();
		while(true)
		{
		System.out.println("======Sub-menu for Professor==========");	
		System.out.println("Select One Operations Bellow");
		System.out.println("1-View Enroled Student for the course:");
		System.out.println("2-Add Grade for a student:");
		System.out.println("3-View Course List:");
		//System.out.println("4-Add Student and Curse");
		System.out.println("Select 1 or 2 or 3 or 4 to exit");
		
		Scanner sc=new Scanner(System.in);
		int ch=sc.nextInt();
		ProfessorInterfaceImpl pii=new ProfessorInterfaceImpl();
		
		if(ch==1)
		{
			pii.viewEnrolledStudents();
		}
		else if(ch==2){
			pii.addGrade();
		}
		else if(ch==3)
		{
			ci.viewCourseDetails();
		}
		/*else if(ch==4)
		{
			pdo.addCourseStudent();
		}*/
		else
		{
			CRSApplication.main(null);
			System.exit(0);
			
		}
		
		}
	}

}
