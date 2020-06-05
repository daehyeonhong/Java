package Exercise0511.Exercise015;

import java.util.Scanner;

public class Member {
	Scanner scanner = new Scanner(System.in);
	String name;
	String id;
	String password;
	int age;

	public Member(String id, String password) {
		System.out.println("id를 입력하세요.");
		id = scanner.next();
		this.id = id;
		System.out.println("비번을 입력하세요.");
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