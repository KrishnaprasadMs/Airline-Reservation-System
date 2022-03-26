package bookingservlet;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import booking.BookingDao;
import booking.BookingPojo;
import booking.BookingViewPojo;


/**
 * Servlet implementation class BookingView
 */
public class BookingView extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BookingView() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ArrayList<BookingViewPojo> bookings = BookingDao.readAllBookings();
		request.setAttribute("bookings", bookings);
		request.getRequestDispatcher("list-all-bookings.jsp").forward(request, response);
	}
	}


