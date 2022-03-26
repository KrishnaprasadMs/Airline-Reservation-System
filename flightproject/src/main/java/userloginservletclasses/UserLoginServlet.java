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
 * Servlet implementation class UserLoginServlet
 */
public class UserLoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UserLoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String fullName = request.getParameter("fullname");
		String email = request.getParameter("email");
		String phoneNumber = request.getParameter("phonenumber");
		String password = request.getParameter("password");
		String confirmPassword = request.getParameter("confirmpassword");
		boolean b = LoginUserDao.insertUserData(fullName, email, phoneNumber, password, confirmPassword);
		if(!b) {
			System.out.println("Error");
		}
		else
		{
			request.setAttribute("acc-created-sucessful", "Account Created Sucessfully  Login Here ");

			request.getRequestDispatcher("userSucessfullregistration.html").forward(request, response);

		}
		//ArrayList<LoginUser> users = LoginUserDao.readAllUserDetails();
	//	request.setAttribute("users", users);
	//	request.getRequestDispatcher("list-all-userdata.jsp").forward(request, response);
	}

}
