package package1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import admin.Flightpojo;

public class HotelDAO {

	public static final String url = "jdbc:sqlite:E:\\QuestProgram\\flightprojectnew\\flightproject\\flightproject\\projectflightdb.db";

	public static ArrayList<Hotel> readAllHotels() {
		String querry = "select hotel_id, hotel_name, hotel_place, number_of_rooms_in_hotel, room_fare_per_day from hotel";
		ArrayList<Hotel> hotels = new ArrayList<>();
		try {
			Class.forName("org.sqlite.JDBC");
			Connection conn = DriverManager.getConnection(url);
			PreparedStatement st = conn.prepareStatement(querry);
			ResultSet rs = st.executeQuery();
			while(rs.next()) {
				Hotel hotel = new Hotel(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getInt(4), rs.getFloat(5));
				hotels.add(hotel);
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
		return hotels;
	}
	public static boolean insertNewHotel(String hotelName,String hotelPlace,int numOfRooms, Float farePerDay) {
		String query = "insert into hotel(hotel_name, hotel_place, number_of_rooms_in_hotel, room_fare_per_day) values(?, ?, ?, ?)";
		try {
			Class.forName("org.sqlite.JDBC");
			Connection conn = DriverManager.getConnection(url);
			PreparedStatement st = conn.prepareStatement(query);
			st.setString(1, hotelName);
			st.setString(2, hotelPlace);
			st.setInt(3, numOfRooms);
			st.setFloat(4, farePerDay);
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
	
	public static void deleteHotel(int id) {
		String deleteQuery = "delete from hotel where hotel_id = "+ id;

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
	
public static boolean updateHotel(int hotelid, String fare) {
		
		String query = "update hotel set room_fare_per_day = '" + fare + "' where hotel_id = " +hotelid;
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
				System.out.println("No row found with hotel id " +hotelid);
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
public static boolean updateHotelName(int hotelid, String hotelname) {
	
	String query = "update hotel set hotel_name = '" + hotelname + "' where hotel_id = " +hotelid;
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
			System.out.println("No row found with hotel id " +hotelid);
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

public static boolean updateHotelPlace(int hotelid, String hotelplace) {
	
	String query = "update hotel set hotel_place = '" + hotelplace + "' where hotel_id = " +hotelid;
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
			System.out.println("No row found with hotel id " +hotelid);
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

public static boolean updateHotelRoom(int hotelid, String room) {
	
	String query = "update hotel set number_of_rooms_in_hotel = '" + room + "' where hotel_id = " +hotelid;
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
			System.out.println("No row found with hotel id " +hotelid);
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



	
}
