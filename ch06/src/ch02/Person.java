package ch02;

public class Person {
	String name;
	private int age;// ���� �����ڷ� �ܺ� Ŭ�������� ���� �Ұ��ϵ��� ó��
	Gender gender;

	public void setAge(int age) {
		if (age < 1) {
			System.out.println("���̴� 1�� �̻��� ���� �Է��ؾ� �մϴ�.");
			return;
		}
		this.age = age;
	}

	public int getAge() {
		return this.age;
	}
}