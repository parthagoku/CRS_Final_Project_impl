/**
 * 
 */
package com.lti.service;

import com.lti.bean.Course;
import com.lti.bean.Student;



/**
 * @author user254
 *
 */
public interface SemesterRegistrationInterface {
	public void registerCourses(Student s, Course c);
	public void addCourse(Student s, Course c);
	public void dropCourse();
	public void payfees();
	public void viewRegisteredCourses();
	

}
