package com.customer;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/cus_loginServlet")
public class cus_loginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		
		String username = request.getParameter("cus_uid");
		String password = request.getParameter("cus_pass");
		boolean isTrue;
		
		isTrue=CustomerDBUtil.validate(username, password);
		
		if(isTrue == true) {
			List<Customer> cusDetails = CustomerDBUtil.getCustomer(username);
			request.setAttribute("cusDetails", cusDetails);
			
			RequestDispatcher dis = request.getRequestDispatcher("cus_Account.jsp");
			dis.forward(request, response);
		}else {
			out.println("<script type='text/javascript'>");
			out.println("alert('Your username or password is incorrect');");
			out.println("location='cus_login.jsp'");
			out.println("</script>");
		}
		
		/*try {
			List<Customer> cusDetails = CustomerDBUtil.validate(username, password);
			request.setAttribute("cusDetails" , cusDetails);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
		
		RequestDispatcher dis1 = request.getRequestDispatcher("cus_Account.jsp");
		dis1.forward(request, response);*/
		
		
	}

}
