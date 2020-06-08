package ch05.ch02;

public class Person {

	// defalut 접근자인 멤버 필드
	String name;
	String id;

	public Person(String name) {
		this.name = name;
	}

	String getName() {
		return name;
	}
}

class Student extends Person {

	public Student(String name) {
		super(name);
	}

	// 자식 클래스에서 추가된 멤버 필드
	String grade;
	String department;

	// 자식 클래스에서 추가된 메소드
	void getGrade() {
		System.out.println(grade);
	}

	@Override
	String getName() {
		return "B:" + name;
	}
}