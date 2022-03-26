package adminservlet;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import admin.AdminOperations;
import admin.Flightpojo;
import userlogin.LoginUser;
import userlogin.LoginUserDao;

/**
 * Servlet implementation class InsertFlight
 */
public class InsertFlights extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public InsertFlights() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Flightpojo flight = new Flightpojo();
        flight.setAirLineName(request.getParameter("flightName"));
        flight.setFlightNumber(Integer.parseInt(request.getParameter("flightNumber")));
        flight.setSource(request.getParameter("source"));
        flight.setDestination(request.getParameter("destination"));
        flight.setTravelDate(request.getParameter("travelDate"));
        flight.setDepartureTime(request.getParameter("departureTime"));
        flight.setArrivalTime(request.getParameter("arrivalTime"));
        flight.setFlightCapacity(Integer.parseInt(request.getParameter("flightCapacity")));
        flight.setFlightFare(Float.parseFloat(request.getParameter("flightFare")));
        AdminOperations.addFlight(flight);
        ArrayList<LoginUser> users = LoginUserDao.readAllUserDetails();
        request.setAttribute("flight", flight);
        request.getRequestDispatcher("add-flight.jsp").forward(request, response);
	}
	}

	


