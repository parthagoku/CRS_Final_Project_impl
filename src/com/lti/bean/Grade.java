/**
 * 
 */
package com.lti.bean;

/**
 * @author user254
 *
 */
public class Grade {

	private String grade;

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

	public Grade(String grade) {
		super();
		this.grade = grade;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Grade [grade=" + grade + "]";
	}
	
	
}
