package hotelregistry.model.bean;

public class Resort {
	private int serviceId;
	private int userId;
	private int numberOfGuests;
	private int total;
	private boolean paid;

	public int getServiceId() {
		return serviceId;
	}

	public void setServiceId(int serviceId) {
		this.serviceId = serviceId;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
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
		return "Service [serviceId=" + serviceId + ", userId=" + userId + ", numberOfGuests=" + numberOfGuests
				+ ", total=" + total + ", paid=" + paid + "]";
	}

}
