package com.lti.bean;

public class User {
	
	private int userId;
	private String name;
	private String role;
	/**
	 * @return the userId
	 */
	public User(int userId, String name, String role) {
		//super();
		this.userId = userId;
		this.name = name;
		this.role = role;
	}
	public int getUserId() {
		return userId;
	}
	/**
	 * @param userId the userId to set
	 */
	public void setUserId(int userId) {
		this.userId = userId;
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
	 * @return the role
	 */
	public String getRole() {
		return role;
	}
	/**
	 * @param role the role to set
	 */
	public void setRole(String role) {
		this.role = role;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "User [userId=" + userId + ", name=" + name + ", role=" + role
				+ "]";
	}
	

}
