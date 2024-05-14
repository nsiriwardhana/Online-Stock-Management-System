package com.admin;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/UpdateSupplierServlet")
public class UpdateSupplierServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String id = request.getParameter("sID");
		String name = request.getParameter("sName");
		String email = request.getParameter("sEmail");
		String address = request.getParameter("sAddress");
		String phone = request.getParameter("sPhone");
		
		boolean isTrue;
		
		isTrue = AdminDBUtil.updateSupplier(id, name, email, address, phone);
		
		if(isTrue == true) {
			List<Supplier> supDetails = AdminDBUtil.getSupplierDetails(id);
			request.setAttribute("supDetails", supDetails);
			
			RequestDispatcher dis = request.getRequestDispatcher("supplier_Account.jsp");
			dis.forward(request, response);
		}
		else {
			
			RequestDispatcher dis = request.getRequestDispatcher("unsuccess.jsp");
			dis.forward(request, response);
		}
		
	}

}
