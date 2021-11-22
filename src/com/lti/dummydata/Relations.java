package com.lti.dummydata;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

import com.lti.bean.Admin;
import com.lti.bean.Course;
import com.lti.bean.Grade;
import com.lti.bean.Student;

public class Relations {

DummyData dd = new DummyData();
	
	
	public static Map<Student , LinkedList<Course> > stud_course = new HashMap<Student, LinkedList<Course>>();
	public static Map<Student , String > stud_set_grade=new HashMap<Student, String>();
	public static Map<Admin , String > admin_pass = new HashMap<Admin, String>();
	
	public void initialise() {
	
	LinkedList<Course> c = new LinkedList<Course>();
	
	// adding first student to a list of courses
	c.add(dd.courses.get(0));
	c.add(dd.courses.get(1));
	c.add(dd.courses.get(2));
	stud_course.put(dd.students.get(0) , c);
	
	
	LinkedList<Course> c1 = new LinkedList<Course>();
	
	// adding second student to a list of courses
	c1.add(dd.courses.get(1));
	c1.add(dd.courses.get(2));
	c1.add(dd.courses.get(4));
	c1.add(dd.courses.get(3));
	stud_course.put(dd.students.get(1), c1);
	
	//Adding null grades
	
	//String s=null;
	stud_set_grade.put(dd.students.get(0),"A" );
	stud_set_grade.put(dd.students.get(1),"A"  );
	stud_set_grade.put(dd.students.get(2),"A" );
	stud_set_grade.put(dd.students.get(3),"A"  );
	stud_set_grade.put(dd.students.get(4),"A"  );
	stud_set_grade.put(dd.students.get(5),"A"  );
	stud_set_grade.put(dd.students.get(6),"A" );
	stud_set_grade.put(dd.students.get(7),"A"  );
	stud_set_grade.put(dd.students.get(8),"A"  );
	stud_set_grade.put(dd.students.get(9),"A"  );
	stud_set_grade.put(dd.students.get(10),"A"  );
	stud_set_grade.put(dd.students.get(11),"A"  );
}}
