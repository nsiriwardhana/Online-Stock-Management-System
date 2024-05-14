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


@WebServlet("/DeleteProductServlet")
public class DeleteProductServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		
		String id = request.getParameter("pID");
		
		boolean isTrue;
		
		isTrue = AdminDBUtil.deleteProduct(id);
		
		if(isTrue == true) {
			out.println("<script type='text/javascript'>");
			out.println("alert('Deleted Successfully !!');");
			out.println("location='adminhome.jsp'");
			out.println("</script>");
			
			//RequestDispatcher dis = request.getRequestDispatcher("adminhome.jsp");
			//dis.forward(request, response);
		}
		else {
			
			List<Product> proDetails = AdminDBUtil.getProductDetails(id);
			request.setAttribute("proDetails", proDetails);
			
			RequestDispatcher dis = request.getRequestDispatcher("product_Account.jsp");
			dis.forward(request, response);
		}
		
	}

}
