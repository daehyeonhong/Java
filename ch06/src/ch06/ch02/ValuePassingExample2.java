package ch06.ch02;

public class ValuePassingExample2 {
	public static void main(String[] args) {
		// ��ü ����
		Circle pizza = new Circle(10);

		// �޼ҵ� �Ű������� ���� ���� ���� ��.
		increase(pizza);
		System.out.println("pizzaRadius: " + pizza.radius);
	}

	// ���� Ÿ�� �Ű� ���� �ް� ������ ���� �ʴ� �޼ҵ�
	static void increase(Circle c) {
		c.radius++;
		System.out.println("radius: " + c.radius);
	}
}