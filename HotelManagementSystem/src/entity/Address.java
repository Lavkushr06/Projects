package entity;

public class Address {
	
	private int doorno;
	private String street;
	private String district;
	private String state;
	private String country; 
	private int pincode;
	
	public Address(int doorno, String street, String district, String state, String country, int pincode) {
		this.doorno = doorno;
		this.street = street;
		this.district = district;
		this.state = state;
		this.country = country;
		this.pincode = pincode;
	}
	
	public int getDoorno() {
		return doorno;
	}

	public void setDoorno(int doorno) {
		this.doorno = doorno;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

	@Override
	public String toString() {
		return "Address [doorno=" + doorno + ", street=" + street + ", district=" + district + ", state=" + state
				+ ", country=" + country + ", pincode=" + pincode + "]";
	}
}
