package ch05.ch05;

public class Member {
	// 필드
	String id;
	String name;
	String pwd;
	String address;
	String phone;
	String email;

	// 생성자
	Member(String id, String name, String pwd) {
		this.id = id;
		this.name = name;
		this.pwd = pwd;
	}

	Member(String id, String name, String pwd, String address) {
		this.id = id;
		this.name = name;
		this.pwd = pwd;
		this.address = address;
	}

	Member(String id, String name, String pwd, String address, String phone) {
		this.id = id;
		this.name = name;
		this.pwd = pwd;
		this.address = address;
		this.phone = phone;
	}

	Member(String id, String name, String pwd, String address, String phone, String email) {
		this.id = id;
		this.name = name;
		this.pwd = pwd;
		this.address = address;
		this.phone = phone;
		this.email = email;
	}

	// 메소드
	public String toString() {
		return id + "," + name + "," + pwd + "," + address + "," + phone + "," + email;
	}
}