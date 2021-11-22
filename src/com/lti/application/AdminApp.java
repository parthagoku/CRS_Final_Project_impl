package com.lti.application;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

import com.lti.bean.Admin;
import com.lti.dummydata.Relations;
import com.lti.serviceimplimentationDAO.AdminInterfaceImpl;
import com.lti.serviceimplimentationDAO.CatalogImpl;
import com.lti.serviceimplimentationDAO.SemesterRegistrationImpl;

public class AdminApp {
	
	public void adminOpp()
	{
		CatalogImpl ci= new CatalogImpl();
		SemesterRegistrationImpl sri=new SemesterRegistrationImpl();
		AdminInterfaceImpl aii=new AdminInterfaceImpl();
		Scanner sc =new Scanner(System.in);
		while(true) {
			System.out.println("======Sub-menu for Admin==========");
			System.out.println("Enter 110 to approve Student Registarion which are pending:");
			System.out.println("Enter 100 to create User(Professor/Admin/Student): ");
			System.out.println("Enter 101 to see existing Users: ");
			System.out.println("Enter 105 to remove existing users: ");
			System.out.println("Enter 10 to view courses");
			System.out.println("Enter 103 to add course");
			System.out.println("Enter 104 to drop course");
			System.out.println("Enter 102 to exit ");
			int choice_admin = new Scanner(System.in).nextInt();
			
			if(choice_admin == 102 ) {
				CRSApplication.main(null);
			}
			if(choice_admin==110)
			{
				ci.approveStudentRegistration();
			}
			if ( choice_admin == 100) {
			aii.addProfessor();
			
			
		}
			if (choice_admin==103)
			{
				ci.addCourse();
			}
		
			if(choice_admin==10)
			{
				ci.viewCourseDetails();
			}
			if(choice_admin==104)
			{
				sri.dropCourse();
			}
			if(choice_admin==105)
			{
				aii.deleteAdmin();
			}
		else if ( choice_admin == 101 ) {
			System.out.println("Bellow Are The Users Present For CRS System: ");
		aii.viewAdmins();
			
		}
	} //
	}

}
