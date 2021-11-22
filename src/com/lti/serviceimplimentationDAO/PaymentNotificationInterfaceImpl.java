package com.lti.serviceimplimentationDAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

import com.lti.dao.DBManager;
import com.lti.service.PaymentInterface;

public class PaymentNotificationInterfaceImpl implements PaymentInterface {

	public void sendNotification(int sid) {
    String str = "Select * from payment_notification where student_id='"+sid+"'";
		PreparedStatement ps=null;
		System.out.println("Notification for You :");
		try
		{
			Connection con= DBManager.getConnection();
		   ps= con.prepareStatement(str);
		   ResultSet rs = ps.executeQuery(str);
		  // System.out.println(rs);
		   ResultSetMetaData rsmd = rs.getMetaData();
		   int columnsNumber = rsmd.getColumnCount();
		   System.out.println("============================================");
		   while (rs.next()) {
			    for (int i = 1; i <= columnsNumber; i++) {
			        if (i > 1) 
			        	System.out.print(",  ");
			        String columnValue = rs.getString(i);
			        System.out.print(rsmd.getColumnName(i) + ": " +columnValue );
			    }
			    System.out.println("");
			}
		   System.out.println("============================================");
		} 
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void sendNotification() {
		// TODO Auto-generated method stub
		
	}

}
