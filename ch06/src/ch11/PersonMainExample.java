package ch11;

public class PersonMainExample {
	public static void main(String[] args) {
		Person person = new Person("001130-1234567", "ȫ�浿");
		System.out.println(person.nation);
		System.out.println(person.ssn);
		System.out.println(person.name);
		// ���� - ������ ���� ����
		person.name = "������";
		// ����� ���� �ʱ�ȭ ���Ŀ��� ���� �Ұ�
		// person.nation = "usa";
		// person.ssn = "001025-1234567";
		System.out.println(person.name);
	}
}