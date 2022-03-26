package userloginservletclasses;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import admin.AdminOperations;
import admin.Flightpojo;

/**
 * Servlet implementation class UserSearchFlight
 */
public class UserSearchFlight extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UserSearchFlight() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String source =request.getParameter("source");
		String destination =request.getParameter("destination");
		String date =request.getParameter("date");
		ArrayList<Flightpojo> flights = AdminOperations.searchUserFlight(source,destination,date);
		request.setAttribute("flight", flights);
		request.getRequestDispatcher("userhomesearchflight.jsp").forward(request, response);
	}

}
