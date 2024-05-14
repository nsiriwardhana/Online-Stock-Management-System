package com.admin;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



@WebServlet("/admin_loginServlet")
public class admin_loginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username = request.getParameter("a_uid");
		String password = request.getParameter("a_pass");
		
		try {
			List<Admin> adminDetails = AdminDBUtil.validate(username, password);
			request.setAttribute("adminDetails", adminDetails);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
		RequestDispatcher dis2 = request.getRequestDispatcher("adminhome.jsp");
		dis2.forward(request, response);
	}

}
