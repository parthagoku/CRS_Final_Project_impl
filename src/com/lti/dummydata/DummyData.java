package com.lti.dummydata;

import java.util.Date;
import java.util.LinkedList;
import java.util.List;

import com.lti.bean.Course;
import com.lti.bean.Professor;
import com.lti.bean.Student;

public class DummyData {

	public static List<Student> students = new LinkedList<Student>();
	public static List<Student> students_course = new LinkedList<Student>();
	public static List<Professor> profs = new LinkedList<Professor>();
	public static List<Course> courses = new LinkedList<Course>();
	public void initializeDummy()
	{
		students_course.add(new Student(100 , "branch1", 100,"course1" , "name1"));
		students_course.add(new Student(101 , "branch2", 101,"course1" , "name1"));
		students_course.add(new Student(102 , "branch3", 102,"course1" , "name1"));
		students_course.add(new Student(103 , "branch4", 103,"course2" , "name2"));
		students_course.add(new Student(104 , "branch5", 104,"course2" , "name2"));
		students_course.add(new Student(105 , "branch1", 105,"course3" , "name3"));
		students_course.add(new Student(106 , "branch2", 106,"course4" , "name4"));
		students_course.add(new Student(107 , "branch3", 107,"course5" , "name5"));
		students_course.add(new Student(108 , "branch4", 108,"course5" , "name5"));
		students_course.add(new Student(109 , "branch5", 109,"course4" , "name4"));
		students_course.add(new Student(110 , "branch1", 110,"course4" , "name4"));
		students_course.add(new Student(111 , "branch2", 111,"course5" , "name5"));
		students_course.add(new Student(112 , "branch3", 112,"course5" , "name5"));
		
	students.add(new Student(100 , "branch1", 100));
	students.add(new Student(101 , "branch2", 101));
	students.add(new Student(102 , "branch3", 102));
	students.add(new Student(103 , "branch4", 103));
	students.add(new Student(104 , "branch5", 104));
	students.add(new Student(105 , "branch1", 105));
	students.add(new Student(106 , "branch2", 106));
	students.add(new Student(107 , "branch3", 107));
	students.add(new Student(108 , "branch4", 108));
	students.add(new Student(109 , "branch5", 109));
	students.add(new Student(110 , "branch1", 110));
	students.add(new Student(111 , "branch2", 111));
	students.add(new Student(112 , "branch3", 112));

	
	
	profs.add(new Professor("dept1" , "desig1" , new Date()));
	profs.add(new Professor("dept2" , "desig2" , new Date()));
	profs.add(new Professor("dept3" , "desig3" , new Date()));
	profs.add(new Professor("dept4" , "desig4" , new Date()));
	profs.add(new Professor("dept5" , "desig5" , new Date()));
	
	courses.add(new Course("course1" , "name1" ,true,"instruct1"));
	courses.add(new Course("course2" , "name2" ,true,"instruct2"));
	courses.add(new Course("course3" , "name3" ,true,"instruct3"));
	courses.add(new Course("course4" , "name4" ,true,"instruct4"));
	courses.add(new Course("course5" , "name5" ,true,"instruct5"));
	
	
	
	
	
	
	
	
	
	}

}
