package pack.Servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import pack.ImplimentationDAO.CategorieImp;
import pack.ImplimentationDAO.ListImp;
@WebServlet("/CreateListServlet")
public class CreateListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    public CreateListServlet() {
        super();
    }

    CategorieImp C =  new CategorieImp();
    ListImp L= new ListImp();
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		ArrayList<String> Catgs = C.ReadNomCategorie();
//		request.setAttribute("Catgs",Catgs);
		this.getServletContext().getRequestDispatcher("/WEB-INF/JSP/CreateListJSP.jsp").forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		
		String title=request.getParameter("title");
		String descreption=request.getParameter("descreption");
		String categories=request.getParameter("categories");
		String status=request.getParameter("status");
		Date date=new SimpleDateFormat("yyyy-mm-dd").parse(date);
		String page;
		
		L.CreateList(title, descreption, status, date, categories);
		

		request.getRequestDispatcher("/WEB-INF/JSP/homePageJSP.jsp").include(request, response);
	
	}

}
