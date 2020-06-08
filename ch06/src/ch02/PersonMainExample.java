package ch02;

public class PersonMainExample {
	public static void main(String[] args) {
		Person person1 = new Person();
		Person person2 = new Person();

		person1.name = "홍길동";
		person1.gender = Gender.MALE;
		// person1.age = -13;
		person1.setAge(-13);

		System.out.println("이름: " + person1.name);
		System.out.println("성별: " + person1.gender.name());
		// System.out.println("나이: " + person1.age);
		System.out.println("나이: " + person1.getAge() + "살");
	}
}