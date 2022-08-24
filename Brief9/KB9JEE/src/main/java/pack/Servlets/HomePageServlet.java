package pack.Servlets;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import pack.ImplimentationDAO.ListImp;
import pack.Models.List;


@WebServlet("/HomePageServlet")
public class HomePageServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    public HomePageServlet() {
        super();
    }

	ListImp L =new ListImp();
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ArrayList<List> Lists = L.ReadLists();
		request.setAttribute("Lists",Lists);   
		this.getServletContext().getRequestDispatcher("/WEB-INF/JSP/HomePageJSP.jsp").forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
