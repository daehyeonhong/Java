package ch05.ch07;

public class Shape {
	protected String name;// "Shape"

	public void paint() {
		draw();
	}

	public void draw() {
		System.out.println(name);// "Shape"
	}
}

class Circle extends Shape {
	protected String name;// �߰��� �ʵ� = "Circle"

	public void draw() {
		name = "circle";
		super.name = "Shape";// �θ� Ŭ������ �ʵ忡 �� ����:���� ���ε�
		super.draw();// �θ� Ŭ������ �޼ҵ� ȣ��:���� ���ε�
		System.out.println(name);// "Circle"
	}
}