package ch11;

public class Member {
	private String name, id;

	public Member() {
		System.out.println("기본 생성자 실행.");
	}

	public Member(String id) {
		System.out.println("ID 생성자 실행.");
		this.id = id;
	}

	public Member(String name, String id) {
		System.out.println("name, ID 생성자 실행.");
		this.name = name;
		this.id = id;
	}

	public String getId() {
		return id;
	}

	public String getName() {
		return name;
	}
}