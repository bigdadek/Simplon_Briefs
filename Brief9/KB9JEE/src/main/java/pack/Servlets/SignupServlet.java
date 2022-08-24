package pack.Servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import pack.ImplimentationDAO.UserImp;

@WebServlet("/SignupServlet")
public class SignupServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	UserImp U= new UserImp();
    public SignupServlet() {
        super();
       
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		this.getServletContext().getRequestDispatcher("/WEB-INF/JSP/SignupJSP.jsp").forward(request, response);
	
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		
		String firstName=request.getParameter("firstName");
		String lastName=request.getParameter("lastName");
		String userName=request.getParameter("userName");
		String password=request.getParameter("password");
		String page;
		

		if(U.userExist(userName, password) == 0){
		        U.CreateUser(firstName, lastName, userName, password);
				page = "/WEB-INF/JSP/LoginJSP.jsp";
		    }
		else
		{
			   out.println("<script type=\"text/javascript\">");
			   out.println("alert('\n \n KB <3 \n   Error: \n   Your UserName or your password is incorrect .\n   Please try again <3 .');");
			   out.println("location='SignupServlet';");
			   out.println("</script>");
			   page = "/WEB-INF/JSP/SignupJSP.jsp";
		}
		request.getRequestDispatcher(page).include(request, response);
	}

}
