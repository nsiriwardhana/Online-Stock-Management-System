package com.admin;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;



public class AdminDBUtil {
	
	private static boolean isSuccess;
	/*private static Connection con = null;
	private static Statement stmt = null;
	private static ResultSet rs = null;*/
	
	public static List<Admin> validate(String username, String password){
		ArrayList<Admin> admin = new ArrayList<>();
		
		//create a database connection 
		String url ="jdbc:mysql://localhost:3306/freshcart";
		String user = "root";
		String pass = "OOPprojecty2s1"; 
					
		//login validate
		try {
			Class.forName("com.mysql.jdbc.Driver");
						
			Connection con = DriverManager.getConnection(url, user, pass);
			Statement stmt = con.createStatement();
			
			//con = DBConnect.getConnection();
			//stmt = con.createStatement();
						
			String sql = "select * from admin1 where a_username = '" +username+ "' and a_password = '"+password+ "'";
						
			ResultSet rs = stmt.executeQuery(sql);
			//rs = stmt.executeQuery(sql);
						
			if(rs.next()) {
				int a_id = rs.getInt(1);
				String a_name = rs.getString(2);
				String a_username = rs.getString(3);
				String a_password = rs.getString(4);
							
				Admin a = new Admin(a_id, a_name, a_username, a_password);
				admin.add(a);
							
			}
					
		}
		catch(Exception e) {
			e.printStackTrace();
		}
					
		return admin;
	}
	
	//insertProduct
	public static boolean insertProduct(String pId, String pName, String pPrice, String pQty) {
		boolean isSuccess = false;
		
		//create a database connection 
		String url ="jdbc:mysql://localhost:3306/freshcart";
		String user = "root";
		String pass = "OOPprojecty2s1";
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
			Connection con = DriverManager.getConnection(url, user, pass);
			Statement stmt = con.createStatement();
			
			String sql = "insert into product values(0,'"+pName+"','"+pPrice+"','"+pQty+"')";
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
	
	//update product
	public static boolean updateProduct(String id,String name, String price, String pQty) {
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
			
			String sql = "update product set productName='"+name+"',productPrice='"+price+"',productQty='"+pQty+"'"
					+"where productID='"+id+"'";
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

	
	//product data retrieve
	public static List<Product> getProductDetails(String productID){
		
		int convertedID = Integer.parseInt(productID);
		
		ArrayList<Product> pro  = new ArrayList<>();
		
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
			
			String sql = "select * from product where productID = '"+convertedID+"'";
			ResultSet rs = stmt.executeQuery(sql);
			
			while(rs.next()) {
				
				int productID1 = rs.getInt(1);
				String productName = rs.getString(2);
				String productPrice = rs.getString(3);
				String productQty = rs.getString(4);
				
				
				Product p = new Product(productID1,productName,productPrice,productQty);
				
				pro.add(p);
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return pro;
	}

	
	//delete product
	public static boolean deleteProduct(String id) {
		
		int convId = Integer.parseInt(id);
		
		//create a database connection 
				String url ="jdbc:mysql://localhost:3306/freshcart";
				String user = "root";
				String pass = "OOPprojecty2s1";
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
			Connection con = DriverManager.getConnection(url, user, pass);
			Statement stmt = con.createStatement();
			
			String sql = "delete from product where productID='"+convId+"'";
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
	
	//validate product
	public static boolean validate1(String pId, String pName) {
		
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
			
			String sql = "select * from product where productID='"+pId+"'and productName='"+pName+"'";
					
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
	
	//get product
	public static List<Product> getProduct(String pId){
		ArrayList<Product> pro = new ArrayList<>();
		
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
			
			String sql = "select * from product where productID = '" +pId+ "'";
			
			ResultSet rs = stmt.executeQuery(sql);
			//rs = stmt.executeQuery(sql);
			
			while(rs.next()) {
				int productID = rs.getInt(1);
				String productName = rs.getString(2);
				String productPrice = rs.getString(3);
				String productQty = rs.getString(4);
				
				Product p = new Product(productID, productName, productPrice, productQty);
				pro.add(p);
			}
			
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		return pro;
		
	}

	
	//insertSupplier
		public static boolean insertSupplier(String sId, String sName, String sEmail, String sAddress, String sPhone) {
			boolean isSuccess = false;
			
			//create a database connection 
			String url ="jdbc:mysql://localhost:3306/freshcart";
			String user = "root";
			String pass = "OOPprojecty2s1";
			
			try {
				Class.forName("com.mysql.jdbc.Driver");
				
				Connection con = DriverManager.getConnection(url, user, pass);
				Statement stmt = con.createStatement();
				
				String sql = "insert into supplier values(0,'"+sName+"','"+sEmail+"','"+sAddress+"','"+sPhone+"')";
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
	
	
	
	
	//update supplier
		public static boolean updateSupplier(String id,String name, String email, String address, String phone) {
			
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
				
				String sql = "update supplier set supName='"+name+"',supEmail='"+email+"',supAddress='"+address+"',supPhone='"+phone+"'"
						+"where supplierID='"+id+"'";
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
	
		
		//supplier data retrieve
		public static List<Supplier> getSupplierDetails(String supplierID){
			
			int convertedID = Integer.parseInt(supplierID);
			
			ArrayList<Supplier> sup  = new ArrayList<>();
			
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
				
				String sql = "select * from supplier where supplierID = '"+convertedID+"'";
				ResultSet rs = stmt.executeQuery(sql);
				
				while(rs.next()) {
					
					int supplierID1 = rs.getInt(1);
					String supName = rs.getString(2);
					String supEmail = rs.getString(3);
					String supAddress = rs.getString(4);
					String supPhone = rs.getString(5);
					
					Supplier s = new Supplier(supplierID1,supName,supEmail,supAddress,supPhone);
					
					sup.add(s);
				}
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
			
			return sup;
		}
		
		
				
				//delete supplier
				public static boolean deleteSupplier(String id) {
					
					int convId = Integer.parseInt(id);
					
					//create a database connection 
							String url ="jdbc:mysql://localhost:3306/freshcart";
							String user = "root";
							String pass = "OOPprojecty2s1";
					
					try {
						Class.forName("com.mysql.jdbc.Driver");
						
						Connection con = DriverManager.getConnection(url, user, pass);
						Statement stmt = con.createStatement();
						
						String sql = "delete from supplier where supplierID='"+convId+"'";
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
				
				
				
				
				//validate supplier
				public static boolean validate2(String sId, String sName) {
					
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
						
						String sql = "select * from supplier where supplierID='"+sId+"'and supplierName='"+sName+"'";
								
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
				
				//get supplier
				public static List<Supplier> getSupplier(String sId){
					ArrayList<Supplier> sup = new ArrayList<>();
					
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
						
						String sql = "select * from supplier where supplierID = '" +sId+ "'";
						
						ResultSet rs = stmt.executeQuery(sql);
						//rs = stmt.executeQuery(sql);
						
						while(rs.next()) {
							int supplierID = rs.getInt(1);
							String supName = rs.getString(2);
							String supEmail = rs.getString(3);
							String supPhone = rs.getString(4);
							String supAddress = rs.getString(5);
							
							Supplier s = new Supplier(supplierID, supName, supEmail, supPhone, supAddress);
							sup.add(s);
						}
				
						
					}
					catch(Exception e) {
						e.printStackTrace();
					}
					
					return sup;
					
				}
}
