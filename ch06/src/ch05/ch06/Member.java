package ch05.ch06;

public class Member {
	// �ʵ�
	String id;
	String name;
	String pwd;
	String address;
	String phone;
	String email;

	// ������
	Member(String id, String name, String pwd) {
		this.id = id;
		this.name = name;
		this.pwd = pwd;
	}

	Member(String id, String name, String pwd, String address) {
		this(id, name, pwd);
		this.address = address;
	}

	Member(String id, String name, String pwd, String address, String phone) {
		this(id, name, pwd, address);
		this.phone = phone;
	}

	Member(String id, String name, String pwd, String address, String phone, String email) {
		this(id, name, pwd, address, phone);
		this.email = email;
	}

	// �޼ҵ�
	public String toString() {
		return id + "," + name + "," + pwd + "," + address + "," + phone + "," + email;
	}
}