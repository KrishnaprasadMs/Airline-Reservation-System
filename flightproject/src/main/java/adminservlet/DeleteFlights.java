package adminservlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import admin.AdminOperations;
import admin.Flightpojo;

/**
 * Servlet implementation class DeleteFlights
 */
public class DeleteFlights extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DeleteFlights() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int flight_id = Integer.parseInt(request.getParameter("flight_id"));
		int i= AdminOperations.deleteFlight(flight_id);// TODO Auto-generated method stub
		
		request.setAttribute("str",  "After Deletion, The Flight List is");
	
		response.sendRedirect("view-edit-delete.html");
		}

	}


