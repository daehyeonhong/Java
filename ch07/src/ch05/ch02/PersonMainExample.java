package ch05.ch02;

public class PersonMainExample {
	public static void main(String[] args) {
		Student student = new Student("ȫ�浿");
		System.out.println("1." + student.name);
		student.grade = "A";
		System.out.println(student.grade);

		// �θ� Ÿ������ ����(promotion)
		Person person = student;
		System.out.println("2." + person.name);
		// �θ� Ÿ������ promotion�� ��ü�� �ڽ� Ÿ�� Ŭ�������� �߰��� ����� ���� �Ұ�
		// System.out.println(person.grade);
		// person.getGrade();
		// �����ǵ� �޼ҵ� ����

		System.out.println("3:" + person.getName());
		Student s = (Student) person;
		// �ٽ� ���� Ÿ������ ȯ��(casting)�Ǹ� �߰��� �ڽ� Ŭ���� ����� ���� ����
		System.out.println("4." + s.grade);
		System.out.print("5. ");
		s.getGrade();
		System.out.println("6." + s.getName());
	}
}