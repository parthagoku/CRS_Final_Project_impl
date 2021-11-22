/**
 * 
 */
package com.lti.application;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

import com.lti.bean.Course;
import com.lti.bean.Student;
import com.lti.dummydata.DummyData;
import com.lti.dummydata.Relations;
import com.lti.serviceimplimentationDAO.CatalogImpl;
import com.lti.serviceimplimentationDAO.SemesterRegistrationImpl;
import com.lti.serviceimplimentationDAO.StudentInterfaceImpl;

/**
 * @author user254
 *
 */
public class StudentApp {

	/**
	 * @param args
	 */
	CatalogImpl ci=new CatalogImpl();
	SemesterRegistrationImpl sri=new SemesterRegistrationImpl();
	DummyData dd = new DummyData();
	Relations rr=new Relations();
	//StudentInterfaceImpl sii=new StudentInterfaceImpl();
	StudentInterfaceImpl sii=new StudentInterfaceImpl();
	public void studentOpp() {
		
		dd.initializeDummy();
		
		// entry point
		while(true) {
			Scanner sc = new Scanner(System.in);
			//System.out.println("Enter 100 to View courses ");
			System.out.println("======Sub-menu for Student==========");
			//System.out.println("Enter 0 to Register here :");
			System.out.println("Enter 11 to show courses ");
			System.out.println("Enter 1 to Register for course");
			System.out.println("Enter 5 to see registered courses :");
			System.out.println("Enter 2 to Drop Course ");
			System.out.println("Enter 3 view Grades");
			System.out.println("Enter 4 to Make Payment ");
			System.out.println("Enter 10 to exit ");
			int choice = sc.nextInt();
			if (choice == 1 ) {
				
				sii.register();
				//dd.courses
			}
			else if ( choice == 11 ) {
				ci.viewCourseDetails();
				}
			/*else if(choice==0)
			{
				sii.registerHere();
				System.out.println("Contact your Admin to approve your registration.");
			}*/
			
			else if (choice == 2 ) {
				
				ci.deleteCourse();
				/*System.out.println("Enter StudentId");
				String StudentId = sc.next();
				System.out.println("Enter Branch");
				String Branch = sc.next();
				System.out.println("Enter batch");
				String batch = sc.next();
				System.out.println("Enter courseName");
				String courseName = sc.next();
				System.out.println("Enter courseCode");
				String courseCode = sc.next();
				
				
				dd.students.add(new Student(Integer.parseInt(StudentId), Branch, Integer.parseInt(batch),courseName,courseCode));
				*/
				
			}
			else if(choice==5){
				System.out.println("Enter your Student ID :");
				Scanner sc5=new Scanner(System.in);
				int id=sc5.nextInt();
				sri.viewRegisteredCourses(id);
				
			}
			else if (choice == 100 ) {
			//ci.viewCourseDetails();
			}
				
			else if (choice == 3 ) {
				//System.out.println("Hii");
				sii.viewGradeCard();
				/*Iterator<Student> itr = dd.students.iterator();
				
				while(itr.hasNext()) {
					System.out.println(itr.next());
				}*/
				
				
			}
			else if (choice == 4 ) {
	
				sri.payfees();
			}
			else if (choice == 5 ) {
				break;
			}
			else {
//				System.exit(0);
				CRSApplication.main(null);
			}
			
		}
		

	}

}
