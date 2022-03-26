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
 * Servlet implementation class ViewByAdmin
 */
public class ViewByAdmin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ViewByAdmin() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//request.setAttribute("str",  "After Deletion, The Flight List is");
	
		ArrayList<Flightpojo> flights = AdminOperations.readAllFlights();
		request.setAttribute("flight", flights);
		request.getRequestDispatcher("list-flight.jsp").forward(request, response);
		System.out.println("Row deleted successfully");

}
}
