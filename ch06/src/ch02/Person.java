package ch02;

public class Person {
	String name;
	private int age;// 접근 제한자로 외부 클래스에서 접근 불가하도록 처리
	Gender gender;

	public void setAge(int age) {
		if (age < 1) {
			System.out.println("나이는 1살 이상의 값을 입력해야 합니다.");
			return;
		}
		this.age = age;
	}

	public int getAge() {
		return this.age;
	}
}