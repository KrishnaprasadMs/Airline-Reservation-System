package userlogin;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import admin.Flightpojo;



public class LoginUserDao {

	public static final String url = "jdbc:sqlite:E:\\QuestProgram\\flightprojectnew\\flightproject\\flightproject\\projectflightdb.db";

	public static  ArrayList<LoginUser> readAllUserDetails() {
		String query = "select id,fullname, email, phonenumber, password, confirmpassword from register" ;
		ArrayList<LoginUser> users = new ArrayList<>();
		try {
			Class.forName("org.sqlite.JDBC");
			Connection con = DriverManager.getConnection(url);
			PreparedStatement st = con.prepareStatement(query);
			ResultSet rs = st.executeQuery();
			while(rs.next()) {
				LoginUser user = new LoginUser(rs.getInt(1),rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6));
				users.add(user);
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} // 1. Register/Load Driver
	 catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return users;
	}
	
	
	public static boolean insertUserData(String fullName,String email,String phoneNumber,String password,String confirmPassword) {
		String query = "insert into register(fullname, email, phonenumber, password,"
				+ "confirmpassword) values(?, ?, ?, ?, ?)";
		//LoginUser user = readUserData();
		
		try {
			Class.forName("org.sqlite.JDBC");
			Connection conn = DriverManager.getConnection(url);
			PreparedStatement st = conn.prepareStatement(query);
			st.setString(1, fullName);
			st.setString(2, email);
			st.setString(3, phoneNumber);
			st.setString(4, password);
			st.setString(5, confirmPassword);
			
			st.executeUpdate();
			conn.close();
			return true;
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}
	
	
	public static void deleteUserData(int id) {
		String deleteQuery = "delete from register where id = "+ id;

		try {
			Class.forName("org.sqlite.JDBC");
			Connection conn = DriverManager.getConnection(url);
			PreparedStatement st = conn.prepareStatement(deleteQuery);
			System.out.println("Database connected successfully");
//			st.setInt(1, id);
			st.execute();
			System.out.println("One row Deleted successfully");
			conn.close();
			System.out.println("Database disconnected successfully");
		} catch (SQLException e) {
			System.out.println("Error in Deleted the row");
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("End of program");
	}
	
public static boolean updateUserData(int id, String password,String phoneNumber,String email,String confirmPassword) {
		
		String query = "update register set password='"+password +"',phonenumber= '" + phoneNumber +"',email= '" + email + "',confirmpassword= '" + confirmPassword + "'  where id = " + id;
		try {
			System.out.println(query);
			Class.forName("org.sqlite.JDBC");
			Connection conn = DriverManager.getConnection(url);
			PreparedStatement st = conn.prepareStatement(query);
			System.out.println("Database connected successfully");
			boolean found = st.execute();
			if(found) {
				System.out.println("One row updated successfully");

			}
			else {
				System.out.println("No row found with user id " +id);
			}
			conn.close();
			System.out.println("Database disconnected successfully");
			return true;
		} 
		catch (SQLException e) {
			System.out.println("Error in updated the row");
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;

	}


public static ArrayList<LoginUser> searchUserId(String email) {
	
	String query = "select id from register where email=?";
	ArrayList<LoginUser> users = new ArrayList<>();
	try {
		Class.forName("org.sqlite.JDBC"); // 1.
		Connection con = DriverManager.getConnection(url);
		PreparedStatement st = con.prepareStatement(query);
		st.setString(1, email);
		

		ResultSet rs = st.executeQuery();
		while (rs.next()) {
			LoginUser user = new LoginUser(rs.getInt(1),rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6));
			users.add(user);
		}

	} catch (ClassNotFoundException e) {
		e.printStackTrace();
	} catch (SQLException e) {
		e.printStackTrace();
	}


	return users;
}
		
}
