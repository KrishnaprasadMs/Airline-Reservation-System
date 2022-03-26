package booking;

import java.util.Objects;

public class BookingViewPojo {

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
	private float billAmount;
	public BookingViewPojo() {
		super();
	}
	public BookingViewPojo(int bookingId, String email, String bookingType, String travelDate, String source,
			String destination, String departureYime, String arrivalTime, float discoundPercentage, String returnDate,
			int numberOfPassengers, float ticketFare, float totalTicketFare, float billAmount) {
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
		this.billAmount = billAmount;
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
	public float getBillAmount() {
		return billAmount;
	}
	public void setBillAmount(float billAmount) {
		this.billAmount = billAmount;
	}
	@Override
	public String toString() {
		return "BookingViewPojo [bookingId=" + bookingId + ", email=" + email + ", bookingType=" + bookingType
				+ ", travelDate=" + travelDate + ", source=" + source + ", destination=" + destination
				+ ", departureYime=" + departureYime + ", arrivalTime=" + arrivalTime + ", discoundPercentage="
				+ discoundPercentage + ", returnDate=" + returnDate + ", numberOfPassengers=" + numberOfPassengers
				+ ", ticketFare=" + ticketFare + ", totalTicketFare=" + totalTicketFare + ", billAmount=" + billAmount
				+ "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(arrivalTime, billAmount, bookingId, bookingType, departureYime, destination,
				discoundPercentage, email, numberOfPassengers, returnDate, source, ticketFare, totalTicketFare,
				travelDate);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BookingViewPojo other = (BookingViewPojo) obj;
		return Objects.equals(arrivalTime, other.arrivalTime)
				&& Float.floatToIntBits(billAmount) == Float.floatToIntBits(other.billAmount)
				&& bookingId == other.bookingId && Objects.equals(bookingType, other.bookingType)
				&& Objects.equals(departureYime, other.departureYime) && Objects.equals(destination, other.destination)
				&& Float.floatToIntBits(discoundPercentage) == Float.floatToIntBits(other.discoundPercentage)
				&& Objects.equals(email, other.email) && numberOfPassengers == other.numberOfPassengers
				&& Objects.equals(returnDate, other.returnDate) && Objects.equals(source, other.source)
				&& Float.floatToIntBits(ticketFare) == Float.floatToIntBits(other.ticketFare)
				&& Float.floatToIntBits(totalTicketFare) == Float.floatToIntBits(other.totalTicketFare)
				&& Objects.equals(travelDate, other.travelDate);
	}
	
	
}
