package ch01;

public class NullPointExceptionExample2 {
	public static void main(String[] args) {

		String str = null;
		str = "hello";// ���ڿ� ���ͷ��� �����ϸ� new String()ó�� ������
		System.out.println(str.hashCode());
		System.out.println("1�� " + System.identityHashCode(str));

		str = new String("hello");
		System.out.println(str.hashCode());
		System.out.println("2�� " + System.identityHashCode(str));
		System.out.println("�� ���ڼ�:" + str.length());

		str = new String("hello");
		System.out.println(str.hashCode());
		System.out.println("3�� " + System.identityHashCode(str));
		System.out.println("�� ���ڼ�:" + str.length());

		str = new String("hello");
		System.out.println(str.hashCode());// ��ü�� ����� HashCode��
		System.out.println("4�� " + System.identityHashCode(str));// ��ü�� ����� ���������� �ּҰ�

		String str1 = new String("hello");

		// str ������ str1 ���� ������ ����Ű�� ��ü�� �����Ѱ�?false
		System.out.println(str == str1);
		// str ������ ����Ű�� ��ü�� ������ str1 ������ ����Ű�� ��ü�� ������ ������? true
		System.out.println(str.contentEquals(str1));
		System.out.println("�� ���ڼ�:" + str.length());
	}
}