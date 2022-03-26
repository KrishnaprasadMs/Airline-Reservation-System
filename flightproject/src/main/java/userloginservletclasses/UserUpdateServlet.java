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
 * Servlet implementation class UserUpdateServlet
 */
public class UserUpdateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UserUpdateServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int id = Integer.parseInt(request.getParameter("id"));
		String password = request.getParameter("password");
		String phoneNumber = request.getParameter("phonenumber");
		String email = request.getParameter("email");
		String confirmPassword = request.getParameter("confirmpassword");
		boolean t = LoginUserDao.updateUserData(id, password,phoneNumber,email,confirmPassword);
		if(t) {
			System.out.println("Updated");
			}
		ArrayList<LoginUser> users = LoginUserDao.readAllUserDetails();
		request.setAttribute("users", users);
		request.getRequestDispatcher("list-all-userdata.jsp").forward(request, response);
	}

}
