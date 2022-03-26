package booking;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import package1.Hotel;




public class TicketCancelDAO {

	public static final String url = "jdbc:sqlite:E:\\\\QuestProgram\\\\flightprojectnew\\\\flightproject\\\\flightproject\\\\projectflightdb.db";

	public static ArrayList<TicketCancel> readCancelledTickets() {
		String querry = "select cancel_id, booking_id, cancellation_date, reason_for_cancellation, account_number, ifsc, account_holder_name from booking_cancellation";
		ArrayList<TicketCancel> tickets = new ArrayList<>();
		try {
			Class.forName("org.sqlite.JDBC");
			Connection conn = DriverManager.getConnection(url);
			PreparedStatement st = conn.prepareStatement(querry);
			ResultSet rs = st.executeQuery();
			while(rs.next()) {
				TicketCancel ticket = new TicketCancel(rs.getInt(1), rs.getInt(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7));
				tickets.add(ticket);
			}		
		}
		catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} // 1. Register/Load Driver
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return tickets;
	}
	public static boolean insertCancelTicket(int booking_id, String cancellation_date, String reason_for_cancellation, String account_number,String ifsc, String account_holder_name ) {
		String query = "insert into booking_cancellation(booking_id, cancellation_date, reason_for_cancellation, account_number, ifsc, account_holder_name) values(?, ?, ?, ?, ?, ?)";
		try {
			Class.forName("org.sqlite.JDBC");
			Connection conn = DriverManager.getConnection(url);
			PreparedStatement st = conn.prepareStatement(query);
			st.setInt(1, booking_id);
			st.setString(2, cancellation_date);
			st.setString(3, reason_for_cancellation);
			st.setString(4, account_number);
			st.setString(5, ifsc);
			st.setString(6, account_holder_name);

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
	
	public static void deleteCancelTicket(int id) {
		String deleteQuery = "delete from booking where booking_id = "+ id;

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
}