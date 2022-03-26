package booking;

import java.util.Objects;

public class TicketCancel {

	private int cancelId;
	private int bookingId;
	private String cancellationDate; 
	private String reasonForCancellation;
	private String accountNumber; 
	private String ifsc;
	private String accountHolderName;
	public TicketCancel() {
		super();
	}
	public TicketCancel(int cancelId, int bookingId, String cancellationDate, String reasonForCancellation,
			String accountNumber, String ifsc, String accountHolderName) {
		super();
		this.cancelId = cancelId;
		this.bookingId = bookingId;
		this.cancellationDate = cancellationDate;
		this.reasonForCancellation = reasonForCancellation;
		this.accountNumber = accountNumber;
		this.ifsc = ifsc;
		this.accountHolderName = accountHolderName;
	}
	public int getCancelId() {
		return cancelId;
	}
	public void setCancelId(int cancelId) {
		this.cancelId = cancelId;
	}
	public int getBookingId() {
		return bookingId;
	}
	public void setBookingId(int bookingId) {
		this.bookingId = bookingId;
	}
	public String getCancellationDate() {
		return cancellationDate;
	}
	public void setCancellationDate(String cancellationDate) {
		this.cancellationDate = cancellationDate;
	}
	public String getReasonForCancellation() {
		return reasonForCancellation;
	}
	public void setReasonForCancellation(String reasonForCancellation) {
		this.reasonForCancellation = reasonForCancellation;
	}
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getIfsc() {
		return ifsc;
	}
	public void setIfsc(String ifsc) {
		this.ifsc = ifsc;
	}
	public String getAccountHolderName() {
		return accountHolderName;
	}
	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}
	@Override
	public String toString() {
		return "TicketCancel [cancelId=" + cancelId + ", bookingId=" + bookingId + ", cancellationDate="
				+ cancellationDate + ", reasonForCancellation=" + reasonForCancellation + ", accountNumber="
				+ accountNumber + ", ifsc=" + ifsc + ", accountHolderName=" + accountHolderName + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(accountHolderName, accountNumber, bookingId, cancelId, cancellationDate, ifsc,
				reasonForCancellation);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TicketCancel other = (TicketCancel) obj;
		return Objects.equals(accountHolderName, other.accountHolderName)
				&& Objects.equals(accountNumber, other.accountNumber) && bookingId == other.bookingId
				&& cancelId == other.cancelId && Objects.equals(cancellationDate, other.cancellationDate)
				&& Objects.equals(ifsc, other.ifsc)
				&& Objects.equals(reasonForCancellation, other.reasonForCancellation);
	}
}