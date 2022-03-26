package bookingservlet;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import booking.BookingDao;
import package1.Hotel;
import package1.HotelDAO;


/**
 * Servlet implementation class InsertBooking
 */
public class InsertBooking extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public InsertBooking() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String email = request.getParameter("email");
		String bookingType = request.getParameter("bookingtype");
		String travelDate =  request.getParameter("traveldate");
		String source =  request.getParameter("source");
		String destination =  request.getParameter("destination");
		String departureTime =  request.getParameter("departuretime");
		String arrivalTime =  request.getParameter("arrivaltime");
		float discountPercentage = Float.parseFloat(request.getParameter("discountpercentage"));
		String returnDate =  request.getParameter("returndate");
		int numberOfPassengers = Integer.parseInt(request.getParameter("numberofpassengers"));
		float ticketFare = Float.parseFloat(request.getParameter("ticketfare"));
		float totalTicketFare = Float.parseFloat(request.getParameter("totalticketfare"));
		float billAmount = Float.parseFloat(request.getParameter("billAmount"));
		HttpSession session = request.getSession();
		session.setAttribute("billAmount", billAmount);
		
		boolean b = BookingDao.insertNewBooking(email,bookingType,travelDate,source,destination,departureTime,arrivalTime,discountPercentage,returnDate,numberOfPassengers,ticketFare,totalTicketFare,billAmount);
		if(!b) {
			System.out.println("Error");
		}
		//ArrayList<BookingPojo> bookings = BookingDao.readAllHotels();
		//request.setAttribute("hotels", hotels);
		request.getRequestDispatcher("hotel-booking.html").forward(request, response);
	}
	}


