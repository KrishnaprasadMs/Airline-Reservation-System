package userloginservletclasses;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import userlogin.LoginUser;
import userlogin.LoginUserDao;

/**
 * Servlet implementation class UserViewServlet
 */
public class UserViewServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UserViewServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ArrayList<LoginUser> users = LoginUserDao.readAllUserDetails();
		request.setAttribute("users", users);
		request.getRequestDispatcher("list-all-userdata.jsp").forward(request, response);
	}

}
