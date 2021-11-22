package com.lti.exception;

public class SetGradeException extends Exception{
	String msg;

	public  SetGradeException(String msg) {
		// TODO Auto-generated constructor stub
		super();
		this.msg = msg;
	} 

	/**
	 * @return the msg
	 */
	public String getMsg() {
		return "Student is invalid";
	}
}
