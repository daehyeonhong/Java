package ch06;

public class CalculatorMainExample {
	public static void main(String[] args) {
		Calculator c = new Calculator();
		c.x = 10;
		c.y = 20;

		// �Ű� ������ �ް� ���� Ÿ���� �ִ� �޼ҵ� ȣ��
		int result = c.plus(10, 30);// ��������.�޼ҵ�(��1,��2);
		System.out.println(result);

		// �Ű� ������ �ް� ���� Ÿ���� ���� �޼ҵ� ȣ��
		c.minus(20, 50);
		
		// �Ű� ������ ���� �ʰ� ���� Ÿ�Ը� �ִ� �޼ҵ� ȣ��
		result = c.multiple();
		System.out.println(result);
		
		// �Ű� ������ ���� �ʰ� ���� Ÿ�Ե� ���� �޼ҵ� ȣ��
		c.divide();
	}
}