package admin;


	import java.beans.Statement;
	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.PreparedStatement;
	import java.sql.ResultSet;
	import java.sql.SQLException;
	import java.util.ArrayList;
	import java.util.Scanner;

	import javax.swing.JOptionPane;

		public class AdminOperations {

		public static final String url = "jdbc:sqlite:E:\\QuestProgram\\flightprojectnew\\flightproject\\flightproject\\projectflightdb.db";

		/*public static Flightpojo readFLightData() {
			Scanner sc = new Scanner(System.in);
			Flightpojo flight = new Flightpojo();
			System.out.print("Enter a airline Name: ");
			flight.setAirLineName(sc.next());
			System.out.print("Enter a flight Number: ");
			flight.setFlightNumber(sc.nextInt());
			System.out.print("Enter a source: ");
			flight.setSource(sc.next());
			System.out.print("Enter a destination: ");
			flight.setDestination(sc.next());
			System.out.print("Enter a Travel date: ");
			flight.setTravelDate(sc.next());
			System.out.print("Enter a Departure time: ");
			flight.setDepartureTime(sc.next());
			System.out.print("Enter a arrival time: ");
			flight.setArrivalTime(sc.next());
			System.out.print("Enter a Flight Capacity: ");
			flight.setFlightCapacity(sc.nextInt());
			System.out.print("Enter a Flight Fare: ");
			flight.setFlightFare(sc.nextFloat());
			sc.close();
			return flight;

		}

		public static Flightpojo insertNewFlight() {
			String query = "insert into flight(airline_name, flight_number,source,destination, travel_date,departure_time, arrival_time, flight_capacity, flight_fare ) values(?,?,?,?,?,?,?,?,?)";
			Flightpojo flight = readFLightData();
			try {
				Class.forName("org.sqlite.JDBC");
				Connection con = DriverManager.getConnection(url);
				PreparedStatement st = con.prepareStatement(query);
				st.setString(1, flight.getAirLineName());
				st.setInt(2, flight.getFlightNumber());
				st.setString(3, flight.getSource());
				st.setString(4, flight.getDestination());
				st.setString(5, flight.getTravelDate());
				st.setString(6, flight.getDepartureTime());
				st.setString(7, flight.getArrivalTime());
				st.setInt(8, flight.getFlightCapacity());
				st.setFloat(9, flight.getFlightFare());
				st.executeUpdate();
				con.close();

			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			return flight;
		}
*/
		public static Flightpojo addFlight(Flightpojo flight) {
			String query = "insert into flight(airline_name, flight_number, source, destination,"
					+ "travel_date, departure_time, arrival_time, flight_capacity, flight_fare) values(?, ?, ?, ?, ?, ?, ?, ?, ?)";

			try {
				Class.forName("org.sqlite.JDBC");
				Connection conn = DriverManager.getConnection(url);
				PreparedStatement st = conn.prepareStatement(query);
				st.setString(1, flight.getAirLineName());
				st.setInt(2, flight.getFlightNumber());
				st.setString(3, flight.getSource());
				st.setString(4, flight.getDestination());
				st.setString(5, flight.getTravelDate());
				st.setString(6, flight.getDepartureTime());
				st.setString(7, flight.getArrivalTime());
				st.setInt(8, flight.getFlightCapacity());
				st.setFloat(9, flight.getFlightFare());
				st.executeUpdate();
				conn.close();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return flight;

		}

		public static int deleteFlight(int flightId) {
			String deleteQuery = "delete from flight where flight_id = "+ flightId;
	        
	         int i=0;
			try {
				Class.forName("org.sqlite.JDBC");
				Connection conn = DriverManager.getConnection(url);
				PreparedStatement st = conn.prepareStatement(deleteQuery);
				System.out.println("Database connected successfully");
//				st.setInt(1, id);
				 i=st.executeUpdate();
				if(i==0) {
					System.out.println("Row not updated");
				}
				else {
					System.out.println("Row updated");
				}
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
			return i;		
			}

		// update
		public static boolean updateFlightFare(int flightId,String traveldate,String depaturetime,String arrivaltime,int flightcapacity,float flightfare) {

			String query = "update flight set travel_date = ?,departure_time = ?,arrival_time = ?,flight_capacity = ?,flight_fare = ? where flight_id = ?";
			try {
				System.out.println(query);
				Class.forName("org.sqlite.JDBC");
				Connection conn = DriverManager.getConnection(url);
				PreparedStatement st = conn.prepareStatement(query);
				st.setString(1, traveldate);
				st.setString(2, depaturetime);
				st.setString(3, arrivaltime);
				st.setInt(4, flightcapacity);
				st.setFloat(5, flightfare);
				st.setInt(6, flightId);

				System.out.println("Database connected successfully");
				boolean found = st.execute();
				if (found) {
					System.out.println("One row updated successfully");

				} else {
					System.out.println("No row found with movie id " + flightId);
				}
				conn.close();
				System.out.println("Database disconnected successfully");
				return true;
			} catch (SQLException e) {
				System.out.println("Error in updated the row");
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return false;

		}

		// select all data
		public static ArrayList<Flightpojo> readAllFlights() {
			String query = "select flight_id, airline_name, flight_number, source, destination, travel_date,departure_time, arrival_time,flight_capacity,flight_fare from  flight";
			ArrayList<Flightpojo> flight = new ArrayList<>();
			try {
				Class.forName("org.sqlite.JDBC"); // 1.
				Connection con = DriverManager.getConnection(url);
				PreparedStatement st = con.prepareStatement(query);
				ResultSet rs = st.executeQuery();
				while (rs.next()) {
					Flightpojo flights = new Flightpojo(rs.getInt(1), rs.getString(2), rs.getInt(3),
							rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8),
							rs.getInt(9), rs.getFloat(10));
					flight.add(flights);
				}

			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			return flight;
		}

	//select with id
		public static ArrayList<Flightpojo> readFlight(int flightId) {
			String query = "select flight_id, airline_name, flight_number, source, destination, travel_date,departure_time, arrival_time,flight_capacity,flight_fare from  flight where flight_id = "
					+ flightId;
			ArrayList<Flightpojo> flights = new ArrayList<>();
			try {
				Class.forName("org.sqlite.JDBC"); // 1.
				Connection con = DriverManager.getConnection(url);
				PreparedStatement st = con.prepareStatement(query);
				ResultSet rs = st.executeQuery();
				while (rs.next()) {
					Flightpojo flight = new Flightpojo(rs.getInt(1), rs.getString(2), rs.getInt(3),
							rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8),
							rs.getInt(9), rs.getFloat(10));
					flights.add(flight);
				}

			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			return flights;
		}

	public static ArrayList<Flightpojo> readFlightWIthFare() {
		
		String query = "select flight_id, airline_name, flight_number, source, destination, travel_date,departure_time, arrival_time,flight_capacity,flight_fare from  flight1 where flight_fare > "+100;
		ArrayList<Flightpojo> flights = new ArrayList<>();
		try {
			Class.forName("org.sqlite.JDBC"); // 1.
			Connection con = DriverManager.getConnection(url);
			PreparedStatement st = con.prepareStatement(query);
			ResultSet rs = st.executeQuery();
			while (rs.next()) {
				Flightpojo flight = new Flightpojo(rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getString(4),
						rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8),rs.getInt(9),rs.getFloat(10));
				flights.add(flight);
			}

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}


		return flights;
	}

	public AdminPojo checkLogin(String email, String password) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
public static ArrayList<Flightpojo> searchUserFlight(String source,String destination,String date) {
		
		String query = "select flight_id, airline_name, flight_number, source, destination, travel_date,departure_time, arrival_time,flight_capacity,flight_fare from  flight where travel_date >=? and source=? and destination=?";
		ArrayList<Flightpojo> flights = new ArrayList<>();
		try {
			Class.forName("org.sqlite.JDBC"); // 1.
			Connection con = DriverManager.getConnection(url);
			PreparedStatement st = con.prepareStatement(query);
			st.setString(1, date);
			st.setString(2, source);
			st.setString(3, destination);

			ResultSet rs = st.executeQuery();
			while (rs.next()) {
				Flightpojo flight = new Flightpojo(rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getString(4),
						rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8),rs.getInt(9),rs.getFloat(10));
				flights.add(flight);
			}

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}


		return flights;
	}
	
	
	}
		//CREATE TABLE "flight1" (
//		    "flight_id"    INTEGER,
//		    "airline_name"    varchar(50),
//		    "flight_number"    varchar(10) NOT NULL,
//		    "source"    varchar(25) NOT NULL,
//		    "destination"    varchar(25) NOT NULL,
//		    "travel_date"    datetime,
//		    "departure_time"    time,
//		    "arrival_time"    time,
//		    "flight_capacity"    int NOT NULL,
//		    "flight_fare" float not null ,
//		    PRIMARY KEY("flight_id" AUTOINCREMENT)
//		)



