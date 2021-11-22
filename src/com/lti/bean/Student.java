/**
 * 
 */
package com.lti.bean;

/**
 * @author user254
 *
 */
public class Student {

	private int studentId;
	private String branch;
	private int batch;
	private String courseCode;
	private String name;
	/**
	 * @return the studentId
	 */
	public int getStudentId() {
		return studentId;
	}
	public Student(int studentId, String branch, int batch) {
		super();
		this.studentId = studentId;
		this.branch = branch;
		this.batch = batch;
	}
	public Student(int studentId, String branch, int batch, String courseCode,
			String name) {
		super();
		this.studentId = studentId;
		this.branch = branch;
		this.batch = batch;
		this.courseCode = courseCode;
		this.name = name;
	}
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
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @param studentId the studentId to set
	 */
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	/**
	 * @return the branch
	 */
	public String getBranch() {
		return branch;
	}
	/**
	 * @param branch the branch to set
	 */
	public void setBranch(String branch) {
		this.branch = branch;
	}
	/**
	 * @return the batch
	 */
	public int getBatch() {
		return batch;
	}
	/**
	 * @param batch the batch to set
	 */
	public void setBatch(int batch) {
		this.batch = batch;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", branch=" + branch
				+ ", batch=" + batch + ", courseCode=" + courseCode + ", name="
				+ name + "]";
	}
}
