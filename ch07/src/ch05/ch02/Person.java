package ch05.ch02;

public class Person {

	// defalut �������� ��� �ʵ�
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

	// �ڽ� Ŭ�������� �߰��� ��� �ʵ�
	String grade;
	String department;

	// �ڽ� Ŭ�������� �߰��� �޼ҵ�
	void getGrade() {
		System.out.println(grade);
	}

	@Override
	String getName() {
		return "B:" + name;
	}
}