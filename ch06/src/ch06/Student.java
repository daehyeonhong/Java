package ch06;

public class Student {
	// �Ű� ������ �ް� ��ü�� �����ϴ� �޼ҵ�
	// ������ �� name(String), gender(char)'F','M', age(int)
	// Person�� �����ϴ� �޼ҵ带 ���弼��
	// Ÿ�� �޼ҵ�� (�Ű�����1,�Ű�����2,�Ű�����3){return ���;}
	// "ȫ�浿", 'M', 13

	Person getPerson(String name, char gender, int age) {
		// Person p = new Person(name, gender, age);
		// return p;
		return new Person(name, gender, age);
	}
}