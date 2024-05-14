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


@WebServlet("/addSupplierServlet")
public class addSupplierServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		
		String sId = request.getParameter("sId");
		String sName = request.getParameter("sName");
		boolean isTrue;
		
		isTrue=AdminDBUtil.validate2(sId, sName);
		
		if(isTrue == true) {
			List<Supplier> supDetails = AdminDBUtil.getSupplier(sId);
			request.setAttribute("supDetails", supDetails);
			
			RequestDispatcher dis = request.getRequestDispatcher("supplier_Account.jsp");
			dis.forward(request, response);
		}else {
			out.println("<script type='text/javascript'>");
			out.println("alert('Unsuccess');");
			out.println("location='addSupplier_A.jsp'");
			out.println("</script>");
		}
		

		
		
		String sId1 = request.getParameter("sId");
		String sName1 = request.getParameter("sName");
		String sEmail = request.getParameter("sEmail");
		String sAddress = request.getParameter("sAddress");
		String sPhone = request.getParameter("sPhone");
		
		boolean isTrue1;
		
		isTrue1 = AdminDBUtil.insertSupplier(sId1, sName1, sEmail, sAddress, sPhone);
		
		if(isTrue1 == true) {
			RequestDispatcher dis = request.getRequestDispatcher("supplier_Account.jsp");
			dis.forward(request, response);
		}
		else
		{
			RequestDispatcher dis2 = request.getRequestDispatcher("unsuccess.jsp");
			dis2.forward(request, response);
		}
	}

}
