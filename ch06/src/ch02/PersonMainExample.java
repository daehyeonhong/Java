package ch02;

public class PersonMainExample {
	public static void main(String[] args) {
		Person person1 = new Person();
		Person person2 = new Person();

		person1.name = "ȫ�浿";
		person1.gender = Gender.MALE;
		// person1.age = -13;
		person1.setAge(-13);

		System.out.println("�̸�: " + person1.name);
		System.out.println("����: " + person1.gender.name());
		// System.out.println("����: " + person1.age);
		System.out.println("����: " + person1.getAge() + "��");
	}
}