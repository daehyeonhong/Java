package ch07;

public class Member {
	// field
	private String name;
	private String id;
	private Address address;

	// constructor
	public Member(String name, String id, Address address) {
		this.name = name;
		this.id = id;
		this.address = address;
	}

	public Address getAddress() {
		return address;
	}

	public String getId() {
		return id;
	}

	public String getName() {
		return name;
	}
}

class Address {
	private String country;
	private String city;

	public Address(String country, String city) {
		this.country = country;
		this.city = city;
	}

	public String getCity() {
		return city;
	}

	public String getCountry() {
		return country;
	}
}