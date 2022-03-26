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
 * Servlet implementation class UpadateFlights
 */
public class UpadateFlights extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpadateFlights() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int flightId = Integer.parseInt(request.getParameter("flightId"));
		String traveldate = request.getParameter("traveldate");
		String depaturetime = request.getParameter("depaturetime");
		String arrivaltime = request.getParameter("arrivaltime");


		int flightcapacity = Integer.parseInt(request.getParameter("flightcapacity"));
		float flightfare = Float.parseFloat(request.getParameter("flightfare"));
		boolean t = AdminOperations.updateFlightFare(flightId,traveldate,depaturetime,arrivaltime,flightcapacity,flightfare);
		if(t) {
			System.out.println("Updated");
			}
		response.sendRedirect("view-edit-delete.html");

	}

}
