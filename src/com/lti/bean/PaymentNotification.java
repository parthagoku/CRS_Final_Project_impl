/**
 * 
 */
package com.lti.bean;

/**
 * @author user254
 *
 */
public class PaymentNotification {
	
	private int studentId;
	private int referenceId;
	private int notificationId;
	private String notificationMessage;
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
	 * @return the referenceId
	 */
	public int getReferenceId() {
		return referenceId;
	}
	/**
	 * @param referenceId the referenceId to set
	 */
	public void setReferenceId(int referenceId) {
		this.referenceId = referenceId;
	}
	/**
	 * @return the notificationId
	 */
	public int getNotificationId() {
		return notificationId;
	}
	/**
	 * @param notificationId the notificationId to set
	 */
	public void setNotificationId(int notificationId) {
		this.notificationId = notificationId;
	}
	/**
	 * @return the notificationMessage
	 */
	public String getNotificationMessage() {
		return notificationMessage;
	}
	/**
	 * @param notificationMessage the notificationMessage to set
	 */
	public void setNotificationMessage(String notificationMessage) {
		this.notificationMessage = notificationMessage;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "PaymentNotification [studentId=" + studentId + ", referenceId="
				+ referenceId + ", notificationId=" + notificationId
				+ ", notificationMessage=" + notificationMessage + "]";
	}
	

}
