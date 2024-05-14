package com.customer;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/UpdateCustomerServlet")
public class UpdateCustomerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String id = request.getParameter("cus_id");
		String name = request.getParameter("cus_name");
		String email = request.getParameter("cus_email");
		String phone = request.getParameter("cus_phone");
		String username = request.getParameter("cus_username");
		String password = request.getParameter("cus_password");
		
		boolean isTrue;
		
		isTrue = CustomerDBUtil.updateCustomer(id, name, email, phone, username, password);
		
		if(isTrue == true) {
			
			List<Customer> cusDetails = CustomerDBUtil.getCustomerDetails(id);
			request.setAttribute("cusDetails", cusDetails);
			
			RequestDispatcher dis = request.getRequestDispatcher("cus_Account.jsp");
			dis.forward(request, response);
		}
		else {
			
			List<Customer> cusDetails = CustomerDBUtil.getCustomerDetails(id);
			request.setAttribute("cusDetails", cusDetails);
			
			RequestDispatcher dis = request.getRequestDispatcher("cus_Account.jsp");
			dis.forward(request, response);
		}
		
	}

}
