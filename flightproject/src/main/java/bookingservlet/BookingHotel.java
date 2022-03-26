package bookingservlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import booking.BookingDao;

/**
 * Servlet implementation class BookingHotel
 */
public class BookingHotel extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BookingHotel() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String hotelName =  request.getParameter("hotelname");
		String hotelPlace =  request.getParameter("hotelplace");
		int numberOfRooms = Integer.parseInt(request.getParameter("numberofrooms"));

		float accomodationFarePerRoom = Float.parseFloat(request.getParameter("accomodationfareperroom"));
		
		float totalAccomodationFare = Float.parseFloat(request.getParameter("totalaccomodationfare"));
		float billAmount = Float.parseFloat(request.getParameter("billAmount"));

		
		boolean b = BookingDao.insertNewHotelBooking(hotelName,hotelPlace,numberOfRooms,accomodationFarePerRoom,totalAccomodationFare,billAmount);
		if(!b) {
			System.out.println("Error");
		}
		//ArrayList<BookingPojo> bookings = BookingDao.readAllHotels();
		//request.setAttribute("hotels", hotels);
		request.getRequestDispatcher("bookingsuccessfully.jsp").forward(request, response);
	}

}
