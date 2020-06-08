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
			System.out.println("새 비번을 등록하세요.");
			this.pwd = scanner.next();
		} else {
			System.out.println("비번이나  id를 확인하세요.");
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