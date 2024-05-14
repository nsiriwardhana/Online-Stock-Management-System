package com.customer;

import java.io.IOException;
//import java.util.List;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

 
@WebServlet("/cus_paymentServlet")
public class cus_paymentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		
		String payId = request.getParameter("payId");
		String cAmount = request.getParameter("cAmount");
		String cName = request.getParameter("cName");
		String cNum = request.getParameter("cNum");
		
		/*try {
			List<Payment> payDetails = cus_paymentDBUtil.validate(cAmount, cName, cNum);
			request.setAttribute("payDetails" , payDetails);
		}
		catch (Exception e) {
			e.printStackTrace();
		}*/
		
		boolean isTrue;
		
		isTrue = CustomerDBUtil.cus_payment(payId, cAmount, cName, cNum);
		
		if(isTrue == true) {
			out.println("<script type='text/javascript'>");
			out.println("alert('Payment successful!!');");
			out.println("location='cus_Account.jsp'");
			out.println("</script>");
			//RequestDispatcher dis = request.getRequestDispatcher("cus_Account.jsp");
			//dis.forward(request, response);
		}
		else
		{
			RequestDispatcher dis2 = request.getRequestDispatcher("unsuccess.jsp");
			dis2.forward(request, response);
		}
	}

}
