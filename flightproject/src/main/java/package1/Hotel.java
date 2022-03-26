package package1;

import java.util.Objects;

public class Hotel {
	
	private int hotelId;
	private String hotelName;
	private String hotelPlace;
	private int numOfRooms;
	private float farePerDay;
	public Hotel() {
		super();
	}
	public Hotel(int hotelId, String hotelName, String hotelPlace, int numOfRooms, float farePerDay) {
		super();
		this.hotelId = hotelId;
		this.hotelName = hotelName;
		this.hotelPlace = hotelPlace;
		this.numOfRooms = numOfRooms;
		this.farePerDay = farePerDay;
	}
	public int getHotelId() {
		return hotelId;
	}
	public void setHotelId(int hotelId) {
		this.hotelId = hotelId;
	}
	public String getHotelName() {
		return hotelName;
	}
	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}
	public String getHotelPlace() {
		return hotelPlace;
	}
	public void setHotelPlace(String hotelPlace) {
		this.hotelPlace = hotelPlace;
	}
	public int getNumOfRooms() {
		return numOfRooms;
	}
	public void setNumOfRooms(int numOfRooms) {
		this.numOfRooms = numOfRooms;
	}
	public float getFarePerDay() {
		return farePerDay;
	}
	public void setFarePerDay(float farePerDay) {
		this.farePerDay = farePerDay;
	}
	@Override
	public String toString() {
		return "Hotel [hotelId=" + hotelId + ", hotelName=" + hotelName + ", hotelPlace=" + hotelPlace + ", numOfRooms="
				+ numOfRooms + ", farePerDay=" + farePerDay + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(farePerDay, hotelId, hotelName, hotelPlace, numOfRooms);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Hotel other = (Hotel) obj;
		return Float.floatToIntBits(farePerDay) == Float.floatToIntBits(other.farePerDay) && hotelId == other.hotelId
				&& Objects.equals(hotelName, other.hotelName) && Objects.equals(hotelPlace, other.hotelPlace)
				&& numOfRooms == other.numOfRooms;
	}
	

}
