package com.customer;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class CustomerDBUtil {
	
	private static boolean isSuccess;
	/*private static Connection con = null;
	private static Statement stmt = null;
	private static ResultSet rs = null;*/
	
	
	
	//validate login
		public static boolean validate(String username, String password) {
			
			//create a database connection 
				String url ="jdbc:mysql://localhost:3306/freshcart";
				String user = "root";
				String pass = "OOPprojecty2s1";
			
			try {
				//con = DBConnect.getConnection();
				//stmt = con.createStatement();
				Class.forName("com.mysql.jdbc.Driver");
				
				Connection con = DriverManager.getConnection(url, user, pass);
				Statement stmt = con.createStatement();
				
				String sql = "select * from customer where cus_username='"+username+"'and cus_password='"+password+"'";
						
				ResultSet rs = stmt.executeQuery(sql);
				
				if(rs.next()){
					isSuccess = true;
				}
				else {
					isSuccess = false;
				}
				
			}
			catch(Exception e) {
				e.printStackTrace();
			}
			
			return isSuccess;
		}
		
		
		//get customer details
		public static List<Customer> getCustomer(String username){
			ArrayList<Customer> cus = new ArrayList<>();
			
			//create a database connection 
			String url ="jdbc:mysql://localhost:3306/freshcart";
			String user = "root";
			String pass = "OOPprojecty2s1"; 
			
			//validate
			try {
				Class.forName("com.mysql.jdbc.Driver");
				
				Connection con = DriverManager.getConnection(url, user, pass);
				Statement stmt = con.createStatement();
				//con = DBConnect.getConnection();
				//stmt = con.createStatement();
				
				String sql = "select * from customer where cus_username = '" +username+ "'";
				
				ResultSet rs = stmt.executeQuery(sql);
				//rs = stmt.executeQuery(sql);
				
				while(rs.next()) {
					int cus_id = rs.getInt(1);
					String cus_name = rs.getString(2);
					String cus_email = rs.getString(3);
					String cus_phone = rs.getString(4);
					String cus_username = rs.getString(5);
					String cus_password = rs.getString(6);
					
					Customer c = new Customer(cus_id, cus_name, cus_email, cus_phone, cus_username, cus_password);
					cus.add(c);
				}
				
			
				
			}
			catch(Exception e) {
				e.printStackTrace();
			}
			
			return cus;
			
		}
	
	//update customer
	public static boolean updateCustomer(String id,String name, String email, String phone, String username, String password) {
		
		//create a database connection 
			String url ="jdbc:mysql://localhost:3306/freshcart";
			String user = "root";
			String pass = "OOPprojecty2s1";
		
		try {
			//con = DBConnect.getConnection();
			//stmt = con.createStatement();
			Class.forName("com.mysql.jdbc.Driver");
			
			Connection con = DriverManager.getConnection(url, user, pass);
			Statement stmt = con.createStatement();
			
			String sql = "update customer set cus_name='"+name+"',cus_email='"+email+"',cus_phone='"+phone+"',cus_username='"+username+"',cus_password='"+password+"'"
					+"where cus_id='"+id+"'";
			int rs = stmt.executeUpdate(sql);
			
			if(rs > 0) {
				isSuccess = true;
			}
			else {
				isSuccess = false;
			}
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		return isSuccess;
	}
	
	
	//customer data retrieve
	public static List<Customer> getCustomerDetails(String cus_id){
		
		int convertedID = Integer.parseInt(cus_id);
		
		ArrayList<Customer> cus  = new ArrayList<>();
		
		//create a database connection 
		String url ="jdbc:mysql://localhost:3306/freshcart";
		String user = "root";
		String pass = "OOPprojecty2s1";
	
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
			Connection con = DriverManager.getConnection(url, user, pass);
			Statement stmt = con.createStatement();
			//con = DBConnect.getConnection();
			//stmt = con.createStatement();
			
			String sql = "select * from customer where cus_id = '"+convertedID+"'";
			ResultSet rs = stmt.executeQuery(sql);
			
			while(rs.next()) {
				
				int cus_id1 = rs.getInt(1);
				String cus_name = rs.getString(2);
				String cus_email = rs.getString(3);
				String cus_phone = rs.getString(4);
				String cus_username = rs.getString(5);
				String cus_password = rs.getString(6);
				
				Customer c = new Customer(cus_id1,cus_name,cus_email,cus_phone,cus_username,cus_password);
				
				cus.add(c);
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return cus;
	}
	
	//cusPayment
	
	public static boolean cus_payment(String payId, String cAmount, String cName, String cNum) {
		boolean isSuccess = false;
		
		//create a database connection 
		String url ="jdbc:mysql://localhost:3306/freshcart";
		String user = "root";
		String pass = "OOPprojecty2s1";
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
			Connection con = DriverManager.getConnection(url, user, pass);
			Statement stmt = con.createStatement();
			
			String sql = "insert into payment_c values(0,'"+cAmount+"','"+cName+"','"+cNum+"')";
			int rs = stmt.executeUpdate(sql);
			
			if(rs > 0) 
			{
				isSuccess = true;
			}
			else
			{
				isSuccess = false;
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
		return isSuccess;
	}  
	
	//delete customer
	
	public static boolean deleteCustomer(String id) {
		
		int convId = Integer.parseInt(id);
		
		//create a database connection 
				String url ="jdbc:mysql://localhost:3306/freshcart";
				String user = "root";
				String pass = "OOPprojecty2s1";
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
			Connection con = DriverManager.getConnection(url, user, pass);
			Statement stmt = con.createStatement();
			
			String sql = "delete from customer where cus_id='"+convId+"'";
			int rs = stmt.executeUpdate(sql);
			
			if(rs > 0) {
				isSuccess = true;
			}
			else {
				isSuccess = false;
			}
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return isSuccess;
		
	}
	
	//payment data retrieve
	/*	public static List<Payment> getPaymentDetails(String paymentID){
			
			int convertedID = Integer.parseInt(paymentID);
			
			ArrayList<Payment> pay  = new ArrayList<>();
			
			//create a database connection 
			String url ="jdbc:mysql://localhost:3306/freshcart";
			String user = "root";
			String pass = "OOPprojecty2s1";
		
			
			try {
				Class.forName("com.mysql.jdbc.Driver");
				
				Connection con = DriverManager.getConnection(url, user, pass);
				Statement stmt = con.createStatement();
				//con = DBConnect.getConnection();
				//stmt = con.createStatement();
				
				String sql = "select * from payment_c where paymentID = '"+convertedID+"'";
				ResultSet rs = stmt.executeQuery(sql);
				
				while(rs.next()) {
					
					int paymentID1 = rs.getInt(1);
					String amount = rs.getString(2);
					String cHolderName = rs.getString(3);
					String cardNumber = rs.getString(4);
					
					Payment p = new Payment(paymentID1,amount,cHolderName,cardNumber);
					
					pay.add(p);
				}
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
			
			return pay;
		}*/
		
}
