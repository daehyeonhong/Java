package ch10.ch04;

public class FactoryMainExample {
	static int seq = 0;

	public static void main(String[] args) {
		School sc = new School();
		Student s1 = sc.getStudent(++seq, "ȫ�浿");
		Student s2 = sc.getStudent(++seq, "������");
		Student s3 = sc.getStudent(++seq, "�Ӳ���");

		System.out.println(s1);// toString() �޼ҵ� Ư¡: ���� ������ println()�� �Ű� ������ ��� �Ǹ� �ڵ� ȣ��
		System.out.println(s2.toString());
		System.out.println(s3);
	}
}