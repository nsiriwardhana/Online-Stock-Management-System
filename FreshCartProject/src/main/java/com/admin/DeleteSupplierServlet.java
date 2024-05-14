package com.admin;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/DeleteSupplierServlet")
public class DeleteSupplierServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		
		String id = request.getParameter("sID");
		
		boolean isTrue;
		
		isTrue = AdminDBUtil.deleteSupplier(id);
		
		if(isTrue == true) {
			out.println("<script type='text/javascript'>");
			out.println("alert('Deleted Successfully !!');");
			out.println("location='adminhome.jsp'");
			out.println("</script>");
			
			//RequestDispatcher dis = request.getRequestDispatcher("adminhome.jsp");
			//dis.forward(request, response);
		}
		else {
			
			List<Supplier> supDetails = AdminDBUtil.getSupplierDetails(id);
			request.setAttribute("supDetails", supDetails);
			
			RequestDispatcher dis = request.getRequestDispatcher("supplier_Account.jsp");
			dis.forward(request, response);
		}
		
	}

}
