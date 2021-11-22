/**
 * 
 */
package com.lti.bean;

/**
 * @author user254
 *
 */
public class RegisteredCourse {
	private String courseCode;
	private int semester;
	private int studentId;
	private String grade;
	/**
	 * @return the courseCode
	 */
	public String getCourseCode() {
		return courseCode;
	}
	/**
	 * @param courseCode the courseCode to set
	 */
	public void setCourseCode(String courseCode) {
		this.courseCode = courseCode;
	}
	/**
	 * @return the semester
	 */
	public int getSemester() {
		return semester;
	}
	/**
	 * @param semester the semester to set
	 */
	public void setSemester(int semester) {
		this.semester = semester;
	}
	/**
	 * @return the studentId
	 */
	public int getStudentId() {
		return studentId;
	}
	/**
	 * @param studentId the studentId to set
	 */
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	/**
	 * @return the grade
	 */
	public String getGrade() {
		return grade;
	}
	/**
	 * @param grade the grade to set
	 */
	public void setGrade(String grade) {
		this.grade = grade;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "RegisteredCourse [courseCode=" + courseCode + ", semester="
				+ semester + ", studentId=" + studentId + ", grade=" + grade
				+ "]";
	}
	

}
