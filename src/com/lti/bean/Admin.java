/**
 * 
 */
package com.lti.bean;

import java.util.Date;

/**
 * @author user254
 *
 */
public class Admin extends User{

	public Admin(int uid , String name , String role)
	{
		super(uid , name , role);
		
	}

	private Date doj;

	/**
	 * @return the doj
	 */
	public Date getDoj() {
		return doj;
	}

	/**
	 * @param doj the doj to set
	 */
	public void setDoj(Date doj) {
		this.doj = doj;
	}

	

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	
}
