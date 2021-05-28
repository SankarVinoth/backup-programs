package in.sankarvinoth.servlet;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


import in.sankarvinoth.model.User;
import in.sankarvinoth.service.LoginService;


/**
 * Servlet implementation class Loginservlet
 */
@WebServlet("/Loginservlet")
public class Loginservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

       
 
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		//Long  mobileNumber=Long.parseLong(request.getParameter("phonenumber"));
		String userName=request.getParameter("username");
		String password=request.getParameter("password");
		User user=new User();
		user.setUserName(userName);
		user.setPassword(password);
	    try {
			boolean status=LoginService.loginVerification(user);
			if(status) {
				HttpSession session=request.getSession();
				session.setAttribute("Logged_in_User",userName);
				response.sendRedirect("index.jsp");
				
			}
			else {
				String message="Invalid User Credentials";
				response.sendRedirect("LoginPage.jsp?errorMessage="+message);
			}
		} catch (ClassNotFoundException | SQLException e) {
		
			e.printStackTrace();
		}
	    }

}
