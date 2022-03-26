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
 * Servlet implementation class UpdateRoom
 */
public class UpdateRoom extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateRoom() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		int hotelid = Integer.parseInt(request.getParameter("hotelid"));
		String room = request.getParameter("room");
		boolean t = HotelDAO.updateHotelRoom(hotelid, room);
		if(t) {
			System.out.println("Updated");
			}
		ArrayList<Hotel> hotel = HotelDAO.readAllHotels();
		request.setAttribute("hotels", hotel);
		request.getRequestDispatcher("list-all-hotel.jsp").forward(request, response);	}

		}


