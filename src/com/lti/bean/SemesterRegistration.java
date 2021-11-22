package com.lti.bean;

import java.util.Date;

public class SemesterRegistration {
	private int studentId;
	private int semester;
	private Date dateOfRegistration;
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
	 * @return the dateOfRegistration
	 */
	public Date getDateOfRegistration() {
		return dateOfRegistration;
	}
	/**
	 * @param dateOfRegistration the dateOfRegistration to set
	 */
	public void setDateOfRegistration(Date dateOfRegistration) {
		this.dateOfRegistration = dateOfRegistration;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "SemesterRegistration [studentId=" + studentId + ", semester="
				+ semester + ", dateOfRegistration=" + dateOfRegistration + "]";
	}
	

}
