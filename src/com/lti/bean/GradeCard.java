/**
 * 
 */
package com.lti.bean;

import java.util.List;

/**
 * @author user254
 *
 */
public class GradeCard {

	private int studentId;
	private int semester;
	private float cpi;
	private List<RegisteredCourse> registeredCourses;
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
	 * @return the cpi
	 */
	public float getCpi() {
		return cpi;
	}
	/**
	 * @param cpi the cpi to set
	 */
	public void setCpi(float cpi) {
		this.cpi = cpi;
	}
	/**
	 * @return the registeredCourses
	 */
	public List<RegisteredCourse> getRegisteredCourses() {
		return registeredCourses;
	}
	/**
	 * @param registeredCourses the registeredCourses to set
	 */
	public void setRegisteredCourses(List<RegisteredCourse> registeredCourses) {
		this.registeredCourses = registeredCourses;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "GradeCard [studentId=" + studentId + ", semester=" + semester
				+ ", cpi=" + cpi + ", registeredCourses=" + registeredCourses
				+ "]";
	}
	
}
