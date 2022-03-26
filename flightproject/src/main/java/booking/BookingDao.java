package booking;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import package1.Hotel;

public class BookingDao {


	public static final String url = "jdbc:sqlite:E:\\QuestProgram\\flightprojectnew\\flightproject\\flightproject\\projectflightdb.db";
	
	public static boolean insertNewBooking(String email,String bookingType,String travelDate,String source,String destination,String departureYime,String arrivalTime,float discountPercentage,String returnDate,int numberOfPassengers,float ticketFare,float totalTicketFare,float billAmount) {
		String query = "insert into booking(email_id, booking_type, travel_date, "
				+ "source,destination, departure_time, arrival_time, discount_percent, "
				+ "return_date, number_of_passengers, ticket_fare, total_ticket_fare,bill_amount)values(?,?,?,?, ?,?,?,?,?,?,?,?,?)";
				
				 
		
		try {
			Class.forName("org.sqlite.JDBC");
			Connection conn = DriverManager.getConnection(url);
			PreparedStatement st = conn.prepareStatement(query);
			st.setString(1, email);
			st.setString(2, bookingType);
			st.setString(3, travelDate);
			st.setString(4, source);
			st.setString(5,destination);
			st.setString(6,departureYime);
			st.setString(7,arrivalTime);
			st.setFloat(8,discountPercentage);
			st.setString(9,returnDate);
			st.setInt(10,numberOfPassengers);
			st.setFloat(11,ticketFare);
			st.setFloat(12,totalTicketFare);
			st.setFloat(13,billAmount);

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
	

	public static ArrayList<BookingViewPojo> readAllBookings() {
		String querry = "select booking_id,email_id, booking_type, travel_date,source,destination,departure_time, arrival_time, discount_percent,return_date, number_of_passengers, ticket_fare, total_ticket_fare,bill_amount from booking";
		ArrayList<BookingViewPojo> bookings = new ArrayList<>();
		try {
			Class.forName("org.sqlite.JDBC");
			Connection conn = DriverManager.getConnection(url);
			PreparedStatement st = conn.prepareStatement(querry);
			ResultSet rs = st.executeQuery();
			while(rs.next()) {
				BookingViewPojo booking = new BookingViewPojo(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5),rs.getString(6),rs.getString(7),rs.getString(8),rs.getFloat(9),rs.getString(10),rs.getInt(11),rs.getFloat(12),rs.getFloat(13),rs.getFloat(14));
				bookings.add(booking);
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
		return bookings;
	}
	
	
	

	public static boolean insertNewHotelBooking(String hotelName,String hotelPlace,int numberRooms,float accomodationFarePerRoom,float totalAccomodationFare,float billAmount) {
		String query = "insert into hotelbooking(hote_name, hotel_place, number_of_rooms, "
				+ "accomodation_fare_per_room,total_accomodation_fare, bill_amount)values(?,?,?,?, ?,?)";
				
				 
		
		try {
			Class.forName("org.sqlite.JDBC");
			Connection conn = DriverManager.getConnection(url);
			PreparedStatement st = conn.prepareStatement(query);
			st.setString(1, hotelName);
			st.setString(2, hotelPlace);
			st.setInt(3, numberRooms);
			st.setFloat(4, accomodationFarePerRoom);
			st.setFloat(5,totalAccomodationFare);
			st.setFloat(6,billAmount);
			

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
	
	
	
	
	
	
	
	
	
}
/*CREATE TABLE "hotelbooking" (
	"booking_id"	INTEGER,
	"hote_name"	TEXT,
	"hotel_place"	TEXT,
	"number_of_rooms"	INTEGER,
	"accomodation_fare_per_room"	float,
	"total_accomodation_fare"	float,
	"bill_amount"	float,
	FOREIGN KEY("booking_id") REFERENCES "booking"("booking_id")
)
)
)
)*/
