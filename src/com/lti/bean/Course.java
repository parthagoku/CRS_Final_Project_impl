/**
 * 
 */
package com.lti.bean;

/**
 * @author user254
 *
 */
public class Course {
	
	private String courseCode;
	private String name;
	private boolean isOffered;
	private String Instructer;
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
	public Course(String courseCode, String name, boolean isOffered,
			String instructer) {
		super();
		this.courseCode = courseCode;
		this.name = name;
		this.isOffered = isOffered;
		Instructer = instructer;
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
	 * @return the isOffered
	 */
	public boolean isOffered() {
		return isOffered;
	}
	/**
	 * @param isOffered the isOffered to set
	 */
	public void setOffered(boolean isOffered) {
		this.isOffered = isOffered;
	}
	/**
	 * @return the instructer
	 */
	public String getInstructer() {
		return Instructer;
	}
	/**
	 * @param instructer the instructer to set
	 */
	public void setInstructer(String instructer) {
		Instructer = instructer;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Course [courseCode=" + courseCode + ", name=" + name
				+ ", isOffered=" + isOffered + ", Instructer=" + Instructer
				+ "]";
	}
	

}
