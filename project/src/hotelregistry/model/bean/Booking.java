package hotelregistry.model.bean;

import java.util.Date;

public class Booking {
	private int userId;
	private int roomId;
	private boolean checkedIn;
	private Date dateFrom;
	private Date dateTo;
	private int numberOfGuests;
	private int total;
	private boolean paid;
	
	public int getUserId() {
		return userId;
	}
	
	public void setUserId(int userId) {
		this.userId = userId;
	}
	
	public int getRoomId() {
		return roomId;
	}
	
	public void setRoomId(int roomId) {
		this.roomId = roomId;
	}
	
	public boolean isCheckedIn() {
		return checkedIn;
	}
	
	public void setCheckedIn(boolean checkedIn) {
		this.checkedIn = checkedIn;
	}
	
	public Date getDateFrom() {
		return dateFrom;
	}
	
	public void setDateFrom(Date dateFrom) {
		this.dateFrom = dateFrom;
	}
	
	public Date getDateTo() {
		return dateTo;
	}
	
	public void setDateTo(Date dateTo) {
		this.dateTo = dateTo;
	}
	
	public int getNumberOfGuests() {
		return numberOfGuests;
	}
	
	public void setNumberOfGuests(int numberOfGuests) {
		this.numberOfGuests = numberOfGuests;
	}
	
	public int getTotal() {
		return total;
	}
	
	public void setTotal(int total) {
		this.total = total;
	}
	
	public boolean isPaid() {
		return paid;
	}
	
	public void setPaid(boolean paid) {
		this.paid = paid;
	}

	@Override
	public String toString() {
		return "Booking [userId=" + userId + ", roomId=" + roomId + ", checkedIn=" + checkedIn + ", dateFrom="
				+ dateFrom + ", dateTo=" + dateTo + ", numberOfGuests=" + numberOfGuests + ", total=" + total
				+ ", paid=" + paid + "]";
	}
}
