package ch11;

public class Person {
	// final 필드명 = 상수
	final String nation = "korea";
	final String ssn;
	String name;

	public Person(String ssn, String name) {
		this.ssn = ssn;
		this.name = name;
	}
}