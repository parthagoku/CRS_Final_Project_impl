package com.lti.exception;

public class EnroleStudentsException extends Exception {
	
	String msg;

	public EnroleStudentsException(String msg) {
		super();
		this.msg = msg;
	}

	/**
	 * @return the msg
	 */
	public String getMsg() {
		return "Course is invalid";
	}

	/**
	 * @param msg the msg to set
	 */
	/*public void setMsg(String msg) {
		this.msg = msg;
	}*/
	

}
