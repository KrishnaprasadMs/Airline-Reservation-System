package adminservlet;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import admin.AdminOperations;
import admin.Flightpojo;

/**
 * Servlet implementation class ViewEditDelete
 */
public class ViewEditDelete extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ViewEditDelete() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
			ArrayList<Flightpojo> flight = AdminOperations.readAllFlights();
			request.setAttribute("flight", flight);
			request.getRequestDispatcher("editbyadmin.jsp").forward(request, response);
			System.out.println("Row deleted successfully");
	}

}
