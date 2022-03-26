package bookingservlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import booking.TicketCancelDAO;

/**
 * Servlet implementation class TicketCancelServlet
 */
public class TicketCancelServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TicketCancelServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int bookingId =Integer.parseInt(request.getParameter("bookingid"));
		String cancellationDate = request.getParameter("cancellationdate");
		String reasonForCancellation = request.getParameter("reason");
		String accountNumber =request.getParameter("accountnumber");
		String ifsc =request.getParameter("ifsc");
		String accountHolderName =request.getParameter("name");

		boolean b = TicketCancelDAO.insertCancelTicket(bookingId, cancellationDate, reasonForCancellation, accountNumber, ifsc, accountHolderName);
		if(!b) {
			System.out.println("Error");
		}
		
		TicketCancelDAO.deleteCancelTicket(bookingId);
	}
	}


