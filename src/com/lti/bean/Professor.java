/**
 * 
 */
package com.lti.bean;

import java.util.Date;

/**
 * @author user254
 *
 */
public class Professor {

	private String department;
	private String designation;
	private Date DOJ;
	/**
	 * @return the department
	 */
	public String getDepartment() {
		return department;
	}
	public Professor(String department, String designation, Date dOJ) {
		super();
		this.department = department;
		this.designation = designation;
		DOJ = dOJ;
	}
	/**
	 * @param department the department to set
	 */
	public void setDepartment(String department) {
		this.department = department;
	}
	/**
	 * @return the designation
	 */
	public String getDesignation() {
		return designation;
	}
	/**
	 * @param designation the designation to set
	 */
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	/**
	 * @return the dOJ
	 */
	public Date getDOJ() {
		return DOJ;
	}
	/**
	 * @param dOJ the dOJ to set
	 */
	public void setDOJ(Date dOJ) {
		DOJ = dOJ;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Professor [department=" + department + ", designation="
				+ designation + ", DOJ=" + DOJ + "]";
	}
	
	
	
}
