package admin;
import java.util.Objects;

public class AdminPojo {


		
			private int flightId;
			private  String airLineName;
			private int flightNumber;
			private String source;
			private String destination;
			private String travelDate;
			private String departureTime;
			private String arrivalTime;
			private int flightCapacity;
			private float flightFare;
			public AdminPojo() {
				super();
			}
			public AdminPojo(int flightId, String airLineName, int flightNumber, String source, String destination,
					String travelDate, String departureTime, String arrivalTime, int flightCapacity, float flightFare) {
				super();
				this.flightId = flightId;
				this.airLineName = airLineName;
				this.flightNumber = flightNumber;
				this.source = source;
				this.destination = destination;
				this.travelDate = travelDate;
				this.departureTime = departureTime;
				this.arrivalTime = arrivalTime;
				this.flightCapacity = flightCapacity;
				this.flightFare = flightFare;
			}
			public int getFlightId() {
				return flightId;
			}
			public void setFlightId(int flightId) {
				this.flightId = flightId;
			}
			public String getAirLineName() {
				return airLineName;
			}
			public void setAirLineName(String airLineName) {
				this.airLineName = airLineName;
			}
			public int getFlightNumber() {
				return flightNumber;
			}
			public void setFlightNumber(int flightNumber) {
				this.flightNumber = flightNumber;
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
			public String getTravelDate() {
				return travelDate;
			}
			public void setTravelDate(String travelDate) {
				this.travelDate = travelDate;
			}
			public String getDepartureTime() {
				return departureTime;
			}
			public void setDepartureTime(String departureTime) {
				this.departureTime = departureTime;
			}
			public String getArrivalTime() {
				return arrivalTime;
			}
			public void setArrivalTime(String arrivalTime) {
				this.arrivalTime = arrivalTime;
			}
			public int getFlightCapacity() {
				return flightCapacity;
			}
			public void setFlightCapacity(int flightCapacity) {
				this.flightCapacity = flightCapacity;
			}
			public float getFlightFare() {
				return flightFare;
			}
			public void setFlightFare(float flightFare) {
				this.flightFare = flightFare;
			}
			@Override
			public int hashCode() {
				return Objects.hash(airLineName, arrivalTime, departureTime, destination, flightCapacity, flightFare,
						flightId, flightNumber, source, travelDate);
			}
			@Override
			public boolean equals(Object obj) {
				if (this == obj)
					return true;
				if (obj == null)
					return false;
				if (getClass() != obj.getClass())
					return false;
				AdminPojo other = (AdminPojo) obj;
				return Objects.equals(airLineName, other.airLineName) && Objects.equals(arrivalTime, other.arrivalTime)
						&& Objects.equals(departureTime, other.departureTime)
						&& Objects.equals(destination, other.destination) && flightCapacity == other.flightCapacity
						&& Float.floatToIntBits(flightFare) == Float.floatToIntBits(other.flightFare)
						&& flightId == other.flightId && flightNumber == other.flightNumber
						&& Objects.equals(source, other.source) && Objects.equals(travelDate, other.travelDate);
			}
			@Override
			public String toString() {
				return "Flightspojo [flightId=" + flightId + ", airLineName=" + airLineName + ", flightNumber="
						+ flightNumber + ", source=" + source + ", destination=" + destination + ", travelDate="
						+ travelDate + ", departureTime=" + departureTime + ", arrivalTime=" + arrivalTime
						+ ", flightCapacity=" + flightCapacity + ", flightFare=" + flightFare + "]";
			}

	}


