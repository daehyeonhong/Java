package Exercise0511.Exercise015;

import java.util.Scanner;

public class Member {
	Scanner scanner = new Scanner(System.in);
	String name;
	String id;
	String password;
	int age;

	public Member(String id, String password) {
		System.out.println("id�� �Է��ϼ���.");
		id = scanner.next();
		this.id = id;
		System.out.println("����� �Է��ϼ���.");
		password = scanner.next();
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}