package entity;

public class Hotel {
	private String roomtype;
	private int roomstatus;
	private double roomprice;
	public Hotel(String roomtype, int roomstatus, double roomprice) {
		super();
		this.roomtype = roomtype;
		this.roomstatus = roomstatus;
		this.roomprice = roomprice;
	}
	public String getRoomtype() {
		return roomtype;
	}
	public void setRoomtype(String roomtype) {
		this.roomtype = roomtype;
	}
	public int getRoomstatus() {
		return roomstatus;
	}
	public void setRoomstatus(int roomstatus) {
		this.roomstatus = roomstatus;
	}
	public double getRoomPrice() {
		return roomprice;
	}
	public void setRoomPrice(double roomprice) {
		this.roomprice = roomprice;
	}
	@Override
	public String toString() {
		return "Hotel [Type=" + roomtype + ", Status=" + roomstatus + ", Price=" + roomprice + "]";
	}
}
