package beans;

public class Address {
	
	private int id;
	private String street;
	private int streetNumber;
	private String city;
	private int zipCode;
	
	
	
	public Address(int id, String street, int streetNumber, String city, int zipCode) {
		super();
		this.id = id;
		this.street = street;
		this.streetNumber = streetNumber;
		this.city = city;
		this.zipCode = zipCode;
	}


	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getStreet() {
		return street;
	}



	public void setStreet(String street) {
		this.street = street;
	}



	public int getStreetNumber() {
		return streetNumber;
	}



	public void setStreetNumber(int streetNumber) {
		this.streetNumber = streetNumber;
	}



	public String getCity() {
		return city;
	}



	public void setCity(String city) {
		this.city = city;
	}



	public int getZipCode() {
		return zipCode;
	}



	public void setZipCode(int zipCode) {
		this.zipCode = zipCode;
	}
	
	
	
	
	
	

}
