package ch03_01;

public class Member {
	public static final int MALE = 0;
	public static final int FEMALE = 1;

	private String name;
	private int gender, age;

	public Member(String name, int gender, int age) {
		super();
		this.name = name;
		this.gender = gender;
		this.age = age;
	}

	public int getGender() {
		return gender;
	}

	public int getAge() {
		return age;
	}

	public String getName() {
		return name;
	}
}