package in.sankarvinoth.servlet;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import in.sankarvinoth.dao.UserDao;
import in.sankarvinoth.model.User;

/**
 * Servlet implementation class registrationservlet
 */
@WebServlet("/registrationservlet")
public class Registrationservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Registrationservlet() {
        super();
       
    }


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String fullName= request.getParameter("fullname");
		String username= request.getParameter("username");
		String email= request.getParameter("email");
		Long  mobileNumber= Long.parseLong(request.getParameter("mobilenumber"));
		String password= request.getParameter("password");
		String confirmPassword= request.getParameter("confirmPassword");
		
		     if(password.equals(confirmPassword)) {
			 User user =new User();
			 user.setFullName(fullName);
			 user.setUserName(username);
			 user.setEmail(email);
			 user.setPhoneNumber(mobileNumber);
			 user.setPassword(password);
			 try {
				UserDao.addUserToUserRegister(user);
				String message="Successfully Regsitered !!!!!";
				response.sendRedirect("register.jsp?infoMessage="+message);
				
				
			} catch (ClassNotFoundException | SQLException e) {
				e.printStackTrace();
				String message="User already exists";
				response.sendRedirect("register.jsp?errorMessage="+message);
				
			}
			 
		
		     }
		     else {
				 String message="password not matched";
					response.sendRedirect("register.jsp?errorMessage="+message);
					
			 }
	}

}
