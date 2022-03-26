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
 * Servlet implementation class DeleteHotel
 */
public class DeleteHotel extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DeleteHotel() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int hotelId = Integer.parseInt(request.getParameter("hotelid"));
		HotelDAO.deleteHotel(hotelId);
		ArrayList<Hotel> hotels = HotelDAO.readAllHotels();
		request.setAttribute("hotels", hotels);
		request.getRequestDispatcher("list-all-hotel.jsp").forward(request, response);
	}

}
