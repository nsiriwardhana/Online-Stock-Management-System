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


@WebServlet("/insertProductServlet")
public class insertProductServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		
		String pId = request.getParameter("pId");
		String pName = request.getParameter("pName");
		boolean isTrue;
		
		isTrue=AdminDBUtil.validate1(pId, pName);
		
		if(isTrue == true) {
			List<Product> proDetails = AdminDBUtil.getProduct(pId);
			request.setAttribute("proDetails", proDetails);
			
			RequestDispatcher dis = request.getRequestDispatcher("product_Account.jsp");
			dis.forward(request, response);
			
			
		}else {
			
			
			out.println("<script type='text/javascript'>");
			out.println("alert('Unsuccess');");
			out.println("location='insertProduct_A.jsp'");
			out.println("</script>");
		}
		
		
		String pId1 = request.getParameter("pId");
		String pName1 = request.getParameter("pName");
		String pPrice = request.getParameter("pPrice");
		String pQty = request.getParameter("pQty");
		
		boolean isTrue1;
		
		isTrue1 = AdminDBUtil.insertProduct(pId1, pName1, pPrice, pQty);
		
		if(isTrue1 == true) {
			RequestDispatcher dis = request.getRequestDispatcher("product_Account.jsp");
			dis.forward(request, response);
		}
		else
		{
			RequestDispatcher dis2 = request.getRequestDispatcher("unsuccess.jsp");
			dis2.forward(request, response);
		}
	
	
	}

}
