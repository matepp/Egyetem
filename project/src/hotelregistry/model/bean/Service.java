package hotelregistry.model.bean;

import java.sql.Timestamp;

public class Service {
	private int id;
	private String type;
	private String description;
	private Timestamp time; // :/
	private int price;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Timestamp getTime() {
		return time;
	}

	public void setTime(Timestamp time) {
		this.time = time;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Service [id=" + id + ", type=" + type + ", description=" + description + ", time=" + time + ", price="
				+ price + "]";
	}

}
