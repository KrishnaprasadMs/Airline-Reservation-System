package serversideclasses;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import package1.Hotel;
import package1.HotelDAO;

/**
 * Servlet implementation class AddHotel
 */
public class AddHotel extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddHotel() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String HotelName = request.getParameter("hotelname");
		String HotelPlace = request.getParameter("hotelplace");
		int NumberOfRooms = Integer.parseInt(request.getParameter("numofrooms"));
		float FarePerDay = Float.parseFloat(request.getParameter("fareperday"));
		boolean b = HotelDAO.insertNewHotel(HotelName, HotelPlace, NumberOfRooms, FarePerDay);
		if(!b) {
			System.out.println("Error");
		}
		ArrayList<Hotel> hotels = HotelDAO.readAllHotels();
		request.setAttribute("hotels", hotels);
		request.getRequestDispatcher("list-all-hotel.jsp").forward(request, response);
	}

}
