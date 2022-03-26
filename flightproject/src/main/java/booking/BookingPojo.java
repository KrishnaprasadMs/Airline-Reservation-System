package booking;

import java.util.Objects;

public class BookingPojo {

	private int bookingId;
	private String email;
	private String bookingType;
	private String travelDate;
	private String source;
	private String destination;
	private String departureYime;
	private String arrivalTime;
	private float discoundPercentage;
	private String returnDate;
	private int numberOfPassengers;
	private float ticketFare;
	private float totalTicketFare;
	private String hotelName;
	private String hotelPlace;
	private int numberRooms;
	private float accomodationFarePerRoom;
	private float totalAccomodationFare;
	private float billAmount;
	private String payMode;
	public BookingPojo() {
		super();
	}
	public BookingPojo(int bookingId, String email, String bookingType, String travelDate, String source,
			String destination, String departureYime, String arrivalTime, float discoundPercentage, String returnDate,
			int numberOfPassengers, float ticketFare, float totalTicketFare, String hotelName, String hotelPlace,
			int numberRooms, float accomodationFarePerRoom, float totalAccomodationFare, float billAmount,
			String payMode) {
		super();
		this.bookingId = bookingId;
		this.email = email;
		this.bookingType = bookingType;
		this.travelDate = travelDate;
		this.source = source;
		this.destination = destination;
		this.departureYime = departureYime;
		this.arrivalTime = arrivalTime;
		this.discoundPercentage = discoundPercentage;
		this.returnDate = returnDate;
		this.numberOfPassengers = numberOfPassengers;
		this.ticketFare = ticketFare;
		this.totalTicketFare = totalTicketFare;
		this.hotelName = hotelName;
		this.hotelPlace = hotelPlace;
		this.numberRooms = numberRooms;
		this.accomodationFarePerRoom = accomodationFarePerRoom;
		this.totalAccomodationFare = totalAccomodationFare;
		this.billAmount = billAmount;
		this.payMode = payMode;
	}
	public int getBookingId() {
		return bookingId;
	}
	public void setBookingId(int bookingId) {
		this.bookingId = bookingId;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getBookingType() {
		return bookingType;
	}
	public void setBookingType(String bookingType) {
		this.bookingType = bookingType;
	}
	public String getTravelDate() {
		return travelDate;
	}
	public void setTravelDate(String travelDate) {
		this.travelDate = travelDate;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public String getDepartureYime() {
		return departureYime;
	}
	public void setDepartureYime(String departureYime) {
		this.departureYime = departureYime;
	}
	public String getArrivalTime() {
		return arrivalTime;
	}
	public void setArrivalTime(String arrivalTime) {
		this.arrivalTime = arrivalTime;
	}
	public float getDiscoundPercentage() {
		return discoundPercentage;
	}
	public void setDiscoundPercentage(float discoundPercentage) {
		this.discoundPercentage = discoundPercentage;
	}
	public String getReturnDate() {
		return returnDate;
	}
	public void setReturnDate(String returnDate) {
		this.returnDate = returnDate;
	}
	public int getNumberOfPassengers() {
		return numberOfPassengers;
	}
	public void setNumberOfPassengers(int numberOfPassengers) {
		this.numberOfPassengers = numberOfPassengers;
	}
	public float getTicketFare() {
		return ticketFare;
	}
	public void setTicketFare(float ticketFare) {
		this.ticketFare = ticketFare;
	}
	public float getTotalTicketFare() {
		return totalTicketFare;
	}
	public void setTotalTicketFare(float totalTicketFare) {
		this.totalTicketFare = totalTicketFare;
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
	public int getNumberRooms() {
		return numberRooms;
	}
	public void setNumberRooms(int numberRooms) {
		this.numberRooms = numberRooms;
	}
	public float getAccomodationFarePerRoom() {
		return accomodationFarePerRoom;
	}
	public void setAccomodationFarePerRoom(float accomodationFarePerRoom) {
		this.accomodationFarePerRoom = accomodationFarePerRoom;
	}
	public float getTotalAccomodationFare() {
		return totalAccomodationFare;
	}
	public void setTotalAccomodationFare(float totalAccomodationFare) {
		this.totalAccomodationFare = totalAccomodationFare;
	}
	public float getBillAmount() {
		return billAmount;
	}
	public void setBillAmount(float billAmount) {
		this.billAmount = billAmount;
	}
	public String getPayMode() {
		return payMode;
	}
	public void setPayMode(String payMode) {
		this.payMode = payMode;
	}
	@Override
	public String toString() {
		return "BookingPojo [bookingId=" + bookingId + ", email=" + email + ", bookingType=" + bookingType
				+ ", travelDate=" + travelDate + ", source=" + source + ", destination=" + destination
				+ ", departureYime=" + departureYime + ", arrivalTime=" + arrivalTime + ", discoundPercentage="
				+ discoundPercentage + ", returnDate=" + returnDate + ", numberOfPassengers=" + numberOfPassengers
				+ ", ticketFare=" + ticketFare + ", totalTicketFare=" + totalTicketFare + ", hotelName=" + hotelName
				+ ", hotelPlace=" + hotelPlace + ", numberRooms=" + numberRooms + ", accomodationFarePerRoom="
				+ accomodationFarePerRoom + ", totalAccomodationFare=" + totalAccomodationFare + ", billAmount="
				+ billAmount + ", payMode=" + payMode + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(accomodationFarePerRoom, arrivalTime, billAmount, bookingId, bookingType, departureYime,
				destination, discoundPercentage, email, hotelName, hotelPlace, numberOfPassengers, numberRooms, payMode,
				returnDate, source, ticketFare, totalAccomodationFare, totalTicketFare, travelDate);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BookingPojo other = (BookingPojo) obj;
		return Float.floatToIntBits(accomodationFarePerRoom) == Float.floatToIntBits(other.accomodationFarePerRoom)
				&& Objects.equals(arrivalTime, other.arrivalTime)
				&& Float.floatToIntBits(billAmount) == Float.floatToIntBits(other.billAmount)
				&& bookingId == other.bookingId && Objects.equals(bookingType, other.bookingType)
				&& Objects.equals(departureYime, other.departureYime) && Objects.equals(destination, other.destination)
				&& Float.floatToIntBits(discoundPercentage) == Float.floatToIntBits(other.discoundPercentage)
				&& Objects.equals(email, other.email) && Objects.equals(hotelName, other.hotelName)
				&& Objects.equals(hotelPlace, other.hotelPlace) && numberOfPassengers == other.numberOfPassengers
				&& numberRooms == other.numberRooms && Objects.equals(payMode, other.payMode)
				&& Objects.equals(returnDate, other.returnDate) && Objects.equals(source, other.source)
				&& Float.floatToIntBits(ticketFare) == Float.floatToIntBits(other.ticketFare)
				&& Float.floatToIntBits(totalAccomodationFare) == Float.floatToIntBits(other.totalAccomodationFare)
				&& Float.floatToIntBits(totalTicketFare) == Float.floatToIntBits(other.totalTicketFare)
				&& Objects.equals(travelDate, other.travelDate);
	}

}
