package ch05;

import java.util.Scanner;

public class Member {
	Scanner scanner = new Scanner(System.in);
	public String id;
	private String name;
	private String pwd;
	private String phone;

	public Member(String id, String name, String pwd, String phone) {
		this.id = id;
		this.name = name;
		this.pwd = pwd;
		this.phone = phone;
	}

	private boolean isValid(String id, String pwd) {
		return this.id.equals(id) && this.pwd.equals(pwd) ? true : false;
	}

	public String getName() {
		return name;
	}

	public String getPwd() {
		return pwd;
	}

	public String getPhone() {
		return phone;
	}

	public void setPwd(String id, String pwd) {
		if (isValid(id, pwd)) {
			System.out.println("�� ����� ����ϼ���.");
			this.pwd = scanner.next();
		} else {
			System.out.println("����̳�  id�� Ȯ���ϼ���.");
		}
	}

	public String getInfo(boolean isAdmin) {
		if (isAdmin) {
			return "Member id=" + id + ", name=" + name + ", pwd=" + pwd + ", phone=" + phone + "]";
		} else {
			return "Member id=" + id + "]";
		}
	}
}