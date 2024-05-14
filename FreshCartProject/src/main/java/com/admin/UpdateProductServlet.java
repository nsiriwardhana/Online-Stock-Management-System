package com.admin;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/UpdateProductServlet")
public class UpdateProductServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String id = request.getParameter("pID");
		String name = request.getParameter("pName");
		String price = request.getParameter("pPrice");
		String pQty = request.getParameter("pQty");
		
		boolean isTrue;
		
		isTrue = AdminDBUtil.updateProduct(id, name, price, pQty);
		
		if(isTrue == true) {
			
			List<Product> proDetails = AdminDBUtil.getProductDetails(id);
			request.setAttribute("proDetails", proDetails);
			
			RequestDispatcher dis = request.getRequestDispatcher("product_Account.jsp");
			dis.forward(request, response);
			
			
		}
		else {
			
			RequestDispatcher dis = request.getRequestDispatcher("unsuccess.jsp");
			dis.forward(request, response);
		}
		
	}

}
